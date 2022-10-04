package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.UserHistory;

public interface UserHistoryMapper {
    int deleteByPrimaryKey(String historyId);

    int insert(UserHistory record);

    int insertSelective(UserHistory record);

    UserHistory selectByPrimaryKey(String historyId);

    int updateByPrimaryKeySelective(UserHistory record);

    int updateByPrimaryKey(UserHistory record);
}