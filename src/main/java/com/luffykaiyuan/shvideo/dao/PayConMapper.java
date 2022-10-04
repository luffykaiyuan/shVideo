package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.PayCon;

public interface PayConMapper {
    int deleteByPrimaryKey(byte[] payId);

    int insert(PayCon record);

    int insertSelective(PayCon record);

    PayCon selectByPrimaryKey(byte[] payId);

    int updateByPrimaryKeySelective(PayCon record);

    int updateByPrimaryKey(PayCon record);
}