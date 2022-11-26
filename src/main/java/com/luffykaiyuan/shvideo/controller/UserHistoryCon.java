package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.po.UserHistory;
import com.luffykaiyuan.shvideo.service.UserHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserHistoryCon {

    @Autowired
    UserHistoryService userHistoryService;

    @PostMapping("/insertHistory")
    public int insertHistory(UserHistory userHistory) {
        return userHistoryService.insertHistory(userHistory);
    }

    @GetMapping("/selectByUsername")
    public List<UserHistory> selectByUsername(String username){
        return userHistoryService.selectByUsername(username);
    }

    @PostMapping("/updateHistory")
    public int updateHistory(UserHistory userHistory) {
        return userHistoryService.updateHistory(userHistory);
    }
}
