package edu.shu.task;

import edu.shu.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TimeRefreshTask {

    @Autowired
    private CjService cjServiceImpl;
    @Autowired
    private StudentXJService studentXJServiceImpl;
    @Autowired
    private KcService kcServiceImpl;
    @Autowired
    private XlService xlServiceImpl;
    @Autowired
    private SslqkService sslqkServiceImpl;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    //每月第一天的凌晨刷新缓存
    @Scheduled(cron = "0 0 0 1 * ?")
//    @Scheduled(cron = "0 0/5 * * * ?")
    public void refreshData() {
        deleteCache();
        refreshCache();

    }

    private void refreshCache() {
        //刷新学籍数据缓存
        studentXJServiceImpl.selectLBSJGet("学校");
        studentXJServiceImpl.selectCXZSJGet("学校");

        //刷新成绩数据缓存
        cjServiceImpl.selectCjztGet("学校");
        cjServiceImpl.selectXfztGet("学校");
        cjServiceImpl.selectCjyjGet("学校");

        //刷新课程数据缓存
        kcServiceImpl.selectGgkGet("学校");
        kcServiceImpl.selectXqkkGet("学校");
        kcServiceImpl.selectKyxsjGet("学校");

        //刷新学历数据缓存
        xlServiceImpl.selectXXGet("学校");
        xlServiceImpl.selectZSGet("学校");
        xlServiceImpl.selectXSGet("学校");
        xlServiceImpl.selectBSGet("学校");

        //刷新生源数据缓存
        sslqkServiceImpl.selectMZQKGet("学校");
    }

    private void deleteCache() {
        //删除缓存数据
        redisTemplate.delete( "学校" + "sysj");
        redisTemplate.delete( "学校" + "xlsj");
        redisTemplate.delete( "学校" + "xjsj");
        redisTemplate.delete( "学校" + "kcsj");
        redisTemplate.delete( "学校" + "cjsj");
    }
}
