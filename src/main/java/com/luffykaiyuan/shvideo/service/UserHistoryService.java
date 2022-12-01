package com.luffykaiyuan.shvideo.service;

import com.luffykaiyuan.shvideo.dao.UserHistoryMapper;
import com.luffykaiyuan.shvideo.po.UserHistory;
import com.luffykaiyuan.shvideo.util.GetNowDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserHistoryService implements UserHistoryMapper {

    @Autowired
    UserHistoryMapper userHistoryMapper;

    public int insertHistory(UserHistory userHistory) {
        userHistory.setPlayTime(GetNowDate.getDate());
        userHistory.setAddTime(GetNowDate.getDate());
        return userHistoryMapper.insertHistory(userHistory);
    }

    public void deleteOutTimeHistory(Date endTime) {
        userHistoryMapper.deleteOutTimeHistory(endTime);
    }

    public List<UserHistory> selectByUsername(String username){
        return userHistoryMapper.selectByUsername(username);
    }


    public int updateHistory(UserHistory userHistory) {
        return userHistoryMapper.updateHistory(userHistory);
    }
}
