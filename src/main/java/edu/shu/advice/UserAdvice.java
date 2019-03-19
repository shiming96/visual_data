package edu.shu.advice;

import edu.shu.entity.Result;
import edu.shu.entity.StatusCode;
import edu.shu.entity.User;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import utils.GetDateTime;

import javax.servlet.http.HttpServletRequest;

@Component
@Aspect
public class UserAdvice {

    private final Logger log = LoggerFactory.getLogger("LOGINFILE");
    private static long count  = 0;

    @Pointcut("execution(* edu.shu.controller.UserController.login(..)) && args(loginUser, request)")
    public void userLogin(User loginUser, HttpServletRequest request) {
    }

    @AfterReturning(value = "userLogin(loginUser, request)", returning = "result")
    public void login(User loginUser, HttpServletRequest request, Result result) {
        if(result.getCode() == StatusCode.OK) {
            count++;
            log.info(GetDateTime.now() + ": 工号" + loginUser.getsID() +  "登陆， 共登陆" + count + "次。");
        }
    }

    @Pointcut("execution(* edu.shu.controller.UserController.logout(..)) && args(sID, request)")
    public void userLogout(String sID, HttpServletRequest request) {
    }

    @AfterReturning(value = "userLogout(sID, request)", returning = "result")
    public void logout(String sID, HttpServletRequest request, Result result) {
        if(result.getCode() == StatusCode.OK) {
            log.info(GetDateTime.now() + ": 工号" + sID +  "登出。");
        }

    }


}
