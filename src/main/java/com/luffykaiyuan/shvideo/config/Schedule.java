package com.luffykaiyuan.shvideo.config;

import com.luffykaiyuan.shvideo.service.UserHistoryService;
import com.luffykaiyuan.shvideo.util.GetNowDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Schedule {

    @Autowired
    UserHistoryService userHistoryService;

    @Scheduled(cron = "0 0 0 ? * *")
    public void scheduled() {
        Date date = new Date();
        Date endTime = GetNowDate.AddAndSubDate(date, -7);
        userHistoryService.deleteOutTimeHistory(endTime);

        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("在 "+formatter.format(new Date())+" 执行了方法。");
    }

}
