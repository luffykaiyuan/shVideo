package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.po.RunWater;
import com.luffykaiyuan.shvideo.service.RunWaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RunWaterCon {

    @Autowired
    RunWaterService runWaterService;

    @PostMapping("/insertRunWater")
    public int insertRunWater(RunWater runWater) {
        return runWaterService.insertRunWater(runWater);
    }

    @PostMapping("/updateRunWater")
    public int updateRunWater(RunWater runWater) {
        return runWaterService.updateRunWater(runWater);
    }

    @GetMapping("/selectInuseWater")
    public List<RunWater> selectInuseWater() {
        return runWaterService.selectInuseWater();
    }

    @GetMapping("/selectWaterByTime")
    public List<RunWater> selectWaterByTime(String beginTime, String endTime){
        return runWaterService.selectWaterByTime(beginTime, endTime);
    }

    @GetMapping("/selectWaterById")
    public List<RunWater> selectWaterById(String waterId) {
        return runWaterService.selectWaterById(waterId);
    }

    @GetMapping("/selectWaterByName")
    public List<RunWater> selectWaterByName(String username) {
        return runWaterService.selectWaterByName(username);
    }

    @GetMapping("/selectWaterByType")
    public List<RunWater> selectWaterByType(String waterType) {
        return runWaterService.selectWaterByType(waterType);
    }
}
