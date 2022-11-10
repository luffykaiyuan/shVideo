package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.po.UserInfo;
import com.luffykaiyuan.shvideo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserInfoCon {
    
    @Autowired
    UserInfoService userInfoService;

    @PostMapping("/doRegister")
    public int doRegister(UserInfo userInfo) {
        return userInfoService.insertUser(userInfo);
    }

    @PostMapping("/updateUser")
    public int updateUser(UserInfo userInfo) {
        return userInfoService.updateUser(userInfo);
    }

    @GetMapping("/deleteUser")
    public int deleteUser(String userId) {
        return userInfoService.deleteUser(userId);
    }

    @GetMapping("/selectUserById")
    public UserInfo selectUserById(String userId) {
        return userInfoService.selectUserById(userId);
    }

    @GetMapping("/selectUserByName")
    public UserInfo selectUserByName(String username) {
        return userInfoService.selectUserByName(username);
    }

    @GetMapping("/selectAllUser")
    public List<UserInfo> selectAllUser() {
        return userInfoService.selectAllUser();
    }

    @GetMapping("/selectInuseUser")
    public List<UserInfo> selectInuseUser() {
        return userInfoService.selectInuseUser();
    }

    @GetMapping("/selectUserByTime")
    public List<UserInfo> selectUserByTime(String beginTime, String endTime) {
        return userInfoService.selectUserByTime(beginTime, endTime);
    }

    @GetMapping("/selectUserByRank")
    public List<UserInfo> selectUserByRank(String rankId) {
        return userInfoService.selectUserByRank(rankId);
    }

    @GetMapping("/selectUserByCard")
    public List<UserInfo> selectUserByCard(String cardType) {
        return userInfoService.selectUserByCard(cardType);
    }
}
