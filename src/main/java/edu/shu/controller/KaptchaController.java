package edu.shu.controller;

import edu.shu.entity.Result;
import edu.shu.entity.StatusCode;
import edu.shu.service.KaptchaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class KaptchaController {

    @Autowired
    private KaptchaService kaptchaServiceImpl;

    @RequestMapping(value = "/yzm")
    public Result getPictureCode(HttpServletRequest request){
        String param = "ImgVerificationCodeMark";
        String base64ImgStr = kaptchaServiceImpl.createPicVerificationCode(param,request);
        if(base64ImgStr != null && !"".equals(base64ImgStr))
            return new Result(true, StatusCode.OK, "验证码生成成功",base64ImgStr);
        else
            return new Result(true, StatusCode.ERROR, "验证码生成失败");
    }

}
