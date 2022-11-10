package com.luffykaiyuan.shvideo.config;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Schedule {

    @Scheduled(cron = "0 0 0 ? * *")
    public void scheduled() {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("在 "+formatter.format(new Date())+" 执行了方法。");
    }

}
