package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.UserRebate;

public interface UserRebateMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserRebate record);

    int insertSelective(UserRebate record);

    UserRebate selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserRebate record);

    int updateByPrimaryKey(UserRebate record);
}