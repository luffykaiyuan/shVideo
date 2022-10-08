package com.luffykaiyuan.shvideo.service;

import com.luffykaiyuan.shvideo.dao.UserInfoMapper;
import com.luffykaiyuan.shvideo.po.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService implements UserInfoMapper {

    @Autowired
    UserInfoMapper userInfoMapper;

    public int insertUser(UserInfo userInfo) {
        return userInfoMapper.insertUser(userInfo);
    }

    public int updateUser(UserInfo userInfo) {
        return userInfoMapper.updateUser(userInfo);
    }

    public int deleteUser(String userId) {
        return userInfoMapper.deleteUser(userId);
    }

    public UserInfo selectUserById(String userId) {
        return userInfoMapper.selectUserById(userId);
    }

    public List<UserInfo> selectUserByName(String username) {
        return userInfoMapper.selectUserByName(username);
    }

    public List<UserInfo> selectAllUser() {
        return userInfoMapper.selectAllUser();
    }

    public List<UserInfo> selectInuseUser() {
        return userInfoMapper.selectInuseUser();
    }
}
