package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.po.UserInfo;
import com.luffykaiyuan.shvideo.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "用户信息编辑")
public class UserInfoCon {
    
    @Autowired
    UserInfoService userInfoService;

    @PostMapping("/doRegister")
    @ApiOperation(value = "注册")
    public int doRegister(UserInfo userInfo) {
        return userInfoService.insertUser(userInfo);
    }

    @PostMapping("/doLogin")
    @ApiOperation(value = "登录")
    public boolean doLogin(UserInfo userInfo) {
        return userInfoService.doLogin(userInfo);
    }

    @PostMapping("/updateUser")
    @ApiOperation(value = "修改用户信息")
    public int updateUser(UserInfo userInfo) {
        return userInfoService.updateUser(userInfo);
    }

    @PostMapping("/updateUserMoney")
    @ApiOperation(value = "修改用户余额")
    public int updateUserMoney(String userId, float money) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(userId);
        userInfo.setMoney(money);
        return userInfoService.updateUser(userInfo);
    }

//    @GetMapping("/deleteUser")
//    public int deleteUser(String userId) {
//        return userInfoService.deleteUser(userId);
//    }

//    @GetMapping("/selectUserById")
//    public UserInfo selectUserById(String userId) {
//        return userInfoService.selectUserById(userId);
//    }

    @GetMapping("/selectUserByName")
    @ApiOperation(value = "查询用户 by 用户名")
    public UserInfo selectUserByName(String username) {
        return userInfoService.selectUserByName(username);
    }

    @GetMapping("/selectAllUser")
    @ApiOperation(value = "查询所有用户")
    public List<UserInfo> selectAllUser() {
        return userInfoService.selectAllUser();
    }

    @GetMapping("/selectInuseUser")
    @ApiOperation(value = "查询所有有效用户")
    public List<UserInfo> selectInuseUser() {
        return userInfoService.selectInuseUser();
    }

    @GetMapping("/selectUserByTime")
    @ApiOperation(value = "查询所有有效用户 by 时间")
    public List<UserInfo> selectUserByTime(String beginTime, String endTime) {
        return userInfoService.selectUserByTime(beginTime, endTime);
    }

    @GetMapping("/selectUserByRank")
    @ApiOperation(value = "查询所有有效用户 by 等级")
    public List<UserInfo> selectUserByRank(String rankId) {
        return userInfoService.selectUserByRank(rankId);
    }

    @GetMapping("/selectUserByCard")
    @ApiOperation(value = "查询所有有效用户 by 会员卡类型")
    public List<UserInfo> selectUserByCard(String cardType) {
        return userInfoService.selectUserByCard(cardType);
    }
}
