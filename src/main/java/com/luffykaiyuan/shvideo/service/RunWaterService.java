package com.luffykaiyuan.shvideo.service;

import com.luffykaiyuan.shvideo.dao.RunWaterMapper;
import com.luffykaiyuan.shvideo.po.RunWater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RunWaterService implements RunWaterMapper {

    @Autowired
    RunWaterMapper runWaterMapper;

    public int insertRunWater(RunWater runWater) {
        return runWaterMapper.insertRunWater(runWater);
    }

    public int updateRunWater(RunWater runWater) {
        return runWaterMapper.updateRunWater(runWater);
    }

    public RunWater selectWaterById(String waterId) {
        return runWaterMapper.selectWaterById(waterId);
    }

    public RunWater selectWaterByName(String username) {
        return runWaterMapper.selectWaterByName(username);
    }
}
