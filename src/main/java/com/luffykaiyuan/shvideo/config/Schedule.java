package com.luffykaiyuan.shvideo.config;

import com.luffykaiyuan.shvideo.po.RankDetail;
import com.luffykaiyuan.shvideo.po.UserInfo;
import com.luffykaiyuan.shvideo.service.RankDetailService;
import com.luffykaiyuan.shvideo.service.UserHistoryService;
import com.luffykaiyuan.shvideo.service.UserInfoService;
import com.luffykaiyuan.shvideo.util.GetNowDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class Schedule {

    @Autowired
    UserHistoryService userHistoryService;

    @Autowired
    UserInfoService userInfoService;

    @Autowired
    RankDetailService rankDetailService;

    @Scheduled(cron = "0 0 0 ? * *")
    public void scheduled() {
        //删除历史
        Date date = new Date();
        Date endTime = GetNowDate.AddAndSubDate(date, -7);
        userHistoryService.deleteOutTimeHistory(endTime);

        //更新会员
        List<UserInfo> userInfos = userInfoService.selectVipUser();
        List<UserInfo> changeUsers = new ArrayList<>();
        List<RankDetail> rankDetails = rankDetailService.selectRankRule();
        List<String> indexList = new ArrayList<>();
        for (int i = 0; i < rankDetails.size(); i++) {
            indexList.add(rankDetails.get(i).getRankId());
        }
        for (int i = 0; i < userInfos.size(); i++) {
            userInfos.get(i).setRemainDay(userInfos.get(i).getRemainDay() - 1);
            if (userInfos.get(i).getRemainDay() == 0){
                userInfos.get(i).setCardType("没有");
                userInfos.get(i).setLookNum(rankDetails.get(indexList.indexOf(userInfos.get(i).getOrginRank())).getLookNum());
                userInfos.get(i).setRankId(userInfos.get(i).getOrginRank());
                changeUsers.add(userInfos.get(i));
            }
        }
        userInfoService.updateList(changeUsers);

        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("在 "+formatter.format(new Date())+" 执行了方法。");
    }

}
