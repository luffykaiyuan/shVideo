package com.luffykaiyuan.shvideo.service;

import com.luffykaiyuan.shvideo.dao.UserInviteMapper;
import com.luffykaiyuan.shvideo.po.UserInvite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInviteService implements UserInviteMapper {

    @Autowired
    UserInviteMapper userInviteMapper;

    public int insertUserInvite(String username) {
        return userInviteMapper.insertUserInvite(username);
    }

    public UserInvite selectUserInvite(String username) {
        return userInviteMapper.selectUserInvite(username);
    }

    public int updateUserInvite(UserInvite userInvite) {
        return userInviteMapper.updateUserInvite(userInvite);
    }

    public int addInviteNum(String username) {
        return userInviteMapper.addInviteNum(username);
    }

}
