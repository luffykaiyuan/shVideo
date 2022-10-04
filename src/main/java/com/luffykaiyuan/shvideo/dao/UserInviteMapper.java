package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.UserInvite;

public interface UserInviteMapper {
    int deleteByPrimaryKey(String username);

    int insert(UserInvite record);

    int insertSelective(UserInvite record);

    UserInvite selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(UserInvite record);

    int updateByPrimaryKey(UserInvite record);
}