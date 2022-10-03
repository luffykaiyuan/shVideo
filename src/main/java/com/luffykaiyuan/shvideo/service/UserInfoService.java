package com.luffykaiyuan.shvideo.service;

import com.luffykaiyuan.shvideo.po.UserInfo;

import java.util.Date;
import java.util.List;

public interface UserInfoService {

    int insertUserInfo(UserInfo userInfo);

    UserInfo selectOneUserInfo(String userId);

    List<UserInfo> selectOne(Date date);
}
