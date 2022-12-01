package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.po.RunWater;
import com.luffykaiyuan.shvideo.service.RunWaterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "流水编辑")
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
    @ApiOperation(value = "查询所有有效流水")
    public List<RunWater> selectInuseWater() {
        return runWaterService.selectInuseWater();
    }

    @GetMapping("/selectWaterByTime")
    @ApiOperation(value = "查询所有有效流水 by 时间")
    public List<RunWater> selectWaterByTime(String beginTime, String endTime){
        return runWaterService.selectWaterByTime(beginTime, endTime);
    }

//    @GetMapping("/selectWaterById")
//    @ApiOperation(value = "查询所有有效流水 by 流水Id")
//    public List<RunWater> selectWaterById(String waterId) {
//        return runWaterService.selectWaterById(waterId);
//    }

    @GetMapping("/selectWaterByName")
    @ApiOperation(value = "查询所有有效流水 by 用户名")
    public List<RunWater> selectWaterByName(String username) {
        return runWaterService.selectWaterByName(username);
    }

    @GetMapping("/selectWaterByType")
    @ApiOperation(value = "查询所有有效流水 by 来源类型")
    public List<RunWater> selectWaterByType(String waterType) {
        return runWaterService.selectWaterByType(waterType);
    }
}
