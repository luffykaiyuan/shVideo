package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.UserInvite;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInviteMapper {

    int insertUserInvite(String username);

    UserInvite selectUserInvite(String username);

    int updateUserInvite(UserInvite userInvite);

    int addInviteNum(String username);
}