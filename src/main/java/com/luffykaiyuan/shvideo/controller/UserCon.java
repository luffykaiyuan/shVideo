package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.po.UserPo;
import com.luffykaiyuan.shvideo.service.impl.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserCon {

    @Autowired
    private UserImpl userImpl;

    @GetMapping("/get")
    public List<UserPo> get(){
        return userImpl.get();
    }
}
