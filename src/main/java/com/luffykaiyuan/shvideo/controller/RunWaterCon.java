package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.po.RunWater;
import com.luffykaiyuan.shvideo.service.RunWaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/selectWaterById")
    public RunWater selectWaterById(String waterId) {
        return runWaterService.selectWaterById(waterId);
    }

    @GetMapping("/selectWaterByName")
    public RunWater selectWaterByName(String username) {
        return runWaterService.selectWaterByName(username);
    }
}
