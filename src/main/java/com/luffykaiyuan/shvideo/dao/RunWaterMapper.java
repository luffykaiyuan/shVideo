package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.RunWater;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RunWaterMapper {

    int insertRunWater(RunWater runWater);

    int updateRunWater(RunWater runWater);

    RunWater selectWaterById(String waterId);

    RunWater selectWaterByName(String username);

}