package utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class EncodingUtils {
    //Enforce noninstantiability with a private constructor
    private EncodingUtils() {
        throw new AssertionError(); //避免不小心在类的内部调用构造器
    }

    public static String fixGetEncoding(String data) {
        if(data != null)
            data = new String(data.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        return data;
    }

    public static void contentDisposition(String fileName, String userAgent, HttpServletRequest request, HttpServletResponse response) {
        try {
            response.reset();
            response.setCharacterEncoding("UTF-8");
            String newFileName = URLEncoder.encode(fileName, "UTF-8").replace("+", "");
            String rtn = "filename=\"" + newFileName + "\"";
            if(userAgent != null) {
                userAgent = userAgent.toLowerCase();
                if(userAgent.contains("edge")) {
                    newFileName = URLEncoder.encode(fileName, "UTF-8").replace("+", "");
                    rtn = "filename=\"" + newFileName + "\"";
                }
                else if(userAgent.contains("trident")) {
                    rtn = "filename=\"" + newFileName + "\"";
                }
                else
                    rtn = "filename=\"" + new String(fileName.getBytes(StandardCharsets.UTF_8),"ISO8859-1") +"\"";
            }
            response.setHeader("Content-Disposition","attachment;" + rtn);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
