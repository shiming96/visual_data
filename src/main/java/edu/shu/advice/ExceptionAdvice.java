package edu.shu.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import utils.GetDateTime;

@Component
@Aspect
public class ExceptionAdvice {

    private final Logger log = LoggerFactory.getLogger(ExceptionAdvice.class);

    @Pointcut("execution(* edu.shu.controller.*.*(..))")
    public void webExce() {
    }

    @AfterThrowing(pointcut = "webExce()", throwing = "e")
    public void refresh(JoinPoint joinPoint, Exception e) {
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();

        //开始打log
        for (Object arg : args) {
            if(arg != null)
                System.out.println(arg.toString());
        }

        log.error(GetDateTime.now() + "异常:" + e.getMessage());
        log.error("异常所在类：" + className);
        log.error("异常所在方法：" + methodName);
        log.error("异常中的参数：");
        for (Object arg : args) {
            log.error(arg.toString());
        }
        log.error("---------------------------------------------------------------");
    }

}
