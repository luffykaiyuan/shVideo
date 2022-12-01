package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.po.UserHistory;
import com.luffykaiyuan.shvideo.service.UserHistoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "用户历史")
public class UserHistoryCon {

    @Autowired
    UserHistoryService userHistoryService;

    @PostMapping("/insertHistory")
    @ApiOperation(value = "新增用户历史")
    public int insertHistory(UserHistory userHistory) {
        return userHistoryService.insertHistory(userHistory);
    }

    @GetMapping("/selectByUsername")
    @ApiOperation(value = "查询单个用户的历史信息")
    public List<UserHistory> selectByUsername(String username){
        return userHistoryService.selectByUsername(username);
    }

//    @PostMapping("/updateHistory")
//    public int updateHistory(UserHistory userHistory) {
//        return userHistoryService.updateHistory(userHistory);
//    }
}
