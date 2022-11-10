package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.RunWater;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RunWaterMapper {

    int insertRunWater(RunWater runWater);

    int updateRunWater(RunWater runWater);

    List<RunWater> selectInuseWater();

    List<RunWater> selectWaterByTime(String beginTime, String endTime);

    List<RunWater> selectWaterById(String waterId);

    List<RunWater> selectWaterByName(String username);

    List<RunWater> selectWaterByType(String waterType);

}