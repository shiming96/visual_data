package edu.shu.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import utils.GetDateTime;

@Component
@Aspect
public class TaskAdvice {

    private final Logger log = LoggerFactory.getLogger("REFRESHFILE");

    private static long count = 0;

    @Pointcut("execution(* edu.shu.task.TimeRefreshTask.refreshData())")
    public void refreshData() {
    }

    @After("refreshData()")
    public void refresh() {
        count++;
        log.info(GetDateTime.now() + ": 刷新缓存! 共刷新" + count + "次。");
    }
}
