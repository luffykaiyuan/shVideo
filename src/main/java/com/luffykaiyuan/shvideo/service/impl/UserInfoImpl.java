package com.luffykaiyuan.shvideo.service.impl;

import com.luffykaiyuan.shvideo.dao.UserInfoMapper;
import com.luffykaiyuan.shvideo.po.UserInfo;
import com.luffykaiyuan.shvideo.service.UserInfoService;
import com.luffykaiyuan.shvideo.util.GetNowDate;
import com.luffykaiyuan.shvideo.util.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserInfoImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;

    public int insertUserInfo(UserInfo userInfo){

        return userInfoMapper.insertUserInfo(userInfo);
    }

    public UserInfo selectOneUserInfo(String userId){
        return userInfoMapper.selectOneUserInfo(userId);
    }

    public List<UserInfo> selectOne(Date date){
        return userInfoMapper.selectOne(date);
    }
}
