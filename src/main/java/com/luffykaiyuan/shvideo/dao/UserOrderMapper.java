package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.UserOrder;

public interface UserOrderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(UserOrder record);

    int insertSelective(UserOrder record);

    UserOrder selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(UserOrder record);

    int updateByPrimaryKey(UserOrder record);
}