package com.neo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;


/**
 * todo
 * @author zz
 * @date
 */

@Component
public class SchedulerTask {

    private int count=0;

    /**
     * corn 表达式
     * @param
     */
    @Scheduled(cron="*/6 * * * * ?")
    private void process(){
        System.out.println("this is scheduler task runing  "+(count++));
    }

}
