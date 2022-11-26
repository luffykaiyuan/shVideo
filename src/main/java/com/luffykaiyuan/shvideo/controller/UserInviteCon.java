package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.po.UserInvite;
import com.luffykaiyuan.shvideo.service.UserInviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInviteCon {

    @Autowired
    UserInviteService userInviteService;

    @GetMapping("/selectUserInvite'")
    public UserInvite selectUserInvite(String username) {
        return userInviteService.selectUserInvite(username);
    }
}
