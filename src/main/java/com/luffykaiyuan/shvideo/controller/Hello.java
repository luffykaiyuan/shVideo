package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.util.GetNowDate;
import com.luffykaiyuan.shvideo.util.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class Hello {

//    @Autowired
//    UserInfoImpl userInfoImpl;
//
//
//    @GetMapping("/hello")
//    public List<UserInfo> hello(){
//        UserInfo userInfo = new UserInfo();
//        userInfo.setUserId(UUIDUtils.getUUID(16));
//        userInfo.setAddTime(GetNowDate.getDate());
//        UserInfo get = userInfoImpl.selectOneUserInfo("371e15dad7404aad");
//
//        Date a = GetNowDate.AddAndSubDate(get.getAddTime(), 7);
//
//        return userInfoImpl.selectOne(a);
//    }
}
