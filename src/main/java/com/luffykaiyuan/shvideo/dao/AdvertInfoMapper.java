package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.AdvertInfo;

public interface AdvertInfoMapper {
    int deleteByPrimaryKey(String advertId);

    int insert(AdvertInfo record);

    int insertSelective(AdvertInfo record);

    AdvertInfo selectByPrimaryKey(String advertId);

    int updateByPrimaryKeySelective(AdvertInfo record);

    int updateByPrimaryKey(AdvertInfo record);
}