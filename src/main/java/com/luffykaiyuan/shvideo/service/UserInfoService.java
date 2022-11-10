package com.luffykaiyuan.shvideo.service;

import com.luffykaiyuan.shvideo.dao.UserInfoMapper;
import com.luffykaiyuan.shvideo.po.UserInfo;
import com.luffykaiyuan.shvideo.po.UserInvite;
import com.luffykaiyuan.shvideo.util.GetNowDate;
import com.luffykaiyuan.shvideo.util.ShVideoUtils;
import com.luffykaiyuan.shvideo.util.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService implements UserInfoMapper {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Autowired
    UserInviteService userInviteService;

    public int insertUser(UserInfo userInfo) {
        userInfo.setUserId(UUIDUtils.getUUID(16));
        userInfo.setAddTime(GetNowDate.getDate());
        userInfo.setInviteCode(userInfo.getUsername());
        if (null != userInfo.getInviteCode()){
            userInviteService.addInviteNum(userInfo.getInviteUsername());
            UserInvite userInvite = userInviteService.selectUserInvite(userInfo.getInviteUsername());
            //todo，更新邀请人等级
            if (ShVideoUtils.checkInviteNum()){

            }
        }
        userInviteService.insertUserInvite(userInfo.getUsername());
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

    public UserInfo selectUserByName(String username) {
        return userInfoMapper.selectUserByName(username);
    }

    public List<UserInfo> selectAllUser() {
        return userInfoMapper.selectAllUser();
    }

    public List<UserInfo> selectInuseUser() {
        return userInfoMapper.selectInuseUser();
    }

    public List<UserInfo> selectUserByTime(String beginTme, String endTime) {
        return userInfoMapper.selectUserByTime(beginTme, endTime);
    }

    public List<UserInfo> selectUserByRank(String rankId) {
        return userInfoMapper.selectUserByRank(rankId);
    }

    public List<UserInfo> selectUserByCard(String cardType) {
        return userInfoMapper.selectUserByCard(cardType);
    }
}
