package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.po.UserInvite;
import com.luffykaiyuan.shvideo.service.UserInviteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "用户邀请接口")
public class UserInviteCon {

    @Autowired
    UserInviteService userInviteService;

    @GetMapping("/selectUserInvite")
    @ApiOperation(value = "查询单个用户的邀请人数")
    public UserInvite selectUserInvite(String username) {
        return userInviteService.selectUserInvite(username);
    }
}
