package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.RunWater;

public interface RunWaterMapper {
    int deleteByPrimaryKey(String waterId);

    int insert(RunWater record);

    int insertSelective(RunWater record);

    RunWater selectByPrimaryKey(String waterId);

    int updateByPrimaryKeySelective(RunWater record);

    int updateByPrimaryKey(RunWater record);
}