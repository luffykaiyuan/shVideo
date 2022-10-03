package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface UserInfoMapper {
    int insertUserInfo(UserInfo userInfo);

    UserInfo selectOneUserInfo(String userId);

    List<UserInfo> selectOne(Date date);

    int deleteByPrimaryKey(String userId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}