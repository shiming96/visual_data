package edu.shu.service.impl;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import edu.shu.service.KaptchaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;

@Service
public class KaptchaServiceImpl implements KaptchaService {

    //记得在Service层需要注入
    @Autowired
    private DefaultKaptcha defaultKaptcha;


    @Override
    public String createPicVerificationCode(String param, HttpServletRequest request) {
        if (param != null){
            byte[] captchaChallengeAsJpeg;
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            try {
                String verificationCodeText = defaultKaptcha.createText();
                //加入到session方便后面验证
                request.getSession().setAttribute(param,verificationCodeText);
                BufferedImage image = defaultKaptcha.createImage(verificationCodeText);
                ImageIO.write(image,"jpg",outputStream);
                captchaChallengeAsJpeg = outputStream.toByteArray();
                return Base64.getEncoder().encodeToString(captchaChallengeAsJpeg);
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                try {
                    outputStream.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        return "验证码生成失败，请重试";
    }

}
