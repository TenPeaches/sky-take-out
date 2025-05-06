package com.sky.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 自定义定时任务类
 */
@Component
@Slf4j
public class MyTask {

    /**
     * 自定义定时任务，每5秒执行一次
     */
    //@Scheduled(cron = "0/5 * * * * ?")
    public void executeTask() {
        log.info("执行自定义定时任务:{}",new Date());
    }
}
