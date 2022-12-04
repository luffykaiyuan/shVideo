package com.luffykaiyuan.shvideo.service;

import com.luffykaiyuan.shvideo.dao.RunWaterMapper;
import com.luffykaiyuan.shvideo.po.RunWater;
import com.luffykaiyuan.shvideo.util.GetNowDate;
import com.luffykaiyuan.shvideo.util.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RunWaterService implements RunWaterMapper {

    @Autowired
    RunWaterMapper runWaterMapper;

    public int insertRunWater(RunWater runWater) {
        runWater.setWaterId(UUIDUtils.getUUID(16));
        runWater.setAddTime(GetNowDate.getDate());
        return runWaterMapper.insertRunWater(runWater);
    }

    public int updateRunWater(RunWater runWater) {
        return runWaterMapper.updateRunWater(runWater);
    }

    public List<RunWater> selectInuseWater() {
        return runWaterMapper.selectInuseWater();
    }

    public List<RunWater> selectWaterByTime(String beginTime, String endTime){
        return runWaterMapper.selectWaterByTime(beginTime, endTime);
    }

    public List<RunWater> selectWaterById(String waterId) {
        return runWaterMapper.selectWaterById(waterId);
    }

    public List<RunWater> selectWaterByName(String username) {
        return runWaterMapper.selectWaterByName(username);
    }

    public List<RunWater> selectWaterByType(String waterType) {
        return runWaterMapper.selectWaterByType(waterType);
    }
}
