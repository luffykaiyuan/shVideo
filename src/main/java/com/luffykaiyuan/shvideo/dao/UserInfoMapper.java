package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserInfoMapper {

    int insertUser(UserInfo userInfo);

    int updateUser(UserInfo userInfo);

    int updateList(List<UserInfo> userInfoList);

    int deleteUser(String userId);

    UserInfo selectUserById(String userId);

    UserInfo selectUserByName(String username);

    List<UserInfo> selectAllUser();

    List<UserInfo> selectInuseUser();

    List<UserInfo> selectUserByTime(String beginTime, String endTime);

    List<UserInfo> selectUserByRank(String rankId);

    List<UserInfo> selectUserByCard(String cardType);

    List<UserInfo> selectVipUser();

}