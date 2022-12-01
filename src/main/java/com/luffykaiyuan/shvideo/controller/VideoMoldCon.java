package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.po.VideoMold;
import com.luffykaiyuan.shvideo.service.VideoMoldService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "大小类编辑")
public class VideoMoldCon {
    
    @Autowired
    VideoMoldService videoMoldService;

    @PostMapping("/insertMold")
    @ApiOperation(value = "新增大小类，小类时要选择附属的大类ID")
    public int insertMold(VideoMold videoMold) {
        return videoMoldService.insertMold(videoMold);
    }

    @PostMapping("/updateMold")
    @ApiOperation(value = "更新大小类")
    public int updateMold(VideoMold videoMold) {
        return videoMoldService.updateMold(videoMold);
    }

    @GetMapping("/delMold")
    @ApiOperation(value = "删除大小类")
    public int delMold(String moldId) {
        return videoMoldService.delMold(moldId);
    }

//    @GetMapping("/selectAllMold")
//    public List<VideoMold> selectAllMold() {
//        return videoMoldService.selectAllMold();
//    }
//
//    @GetMapping("/selectInuseMold")
//    public List<VideoMold> selectInuseMold() {
//        return videoMoldService.selectInuseMold();
//    }

    @GetMapping("/selectAllBigMold")
    @ApiOperation(value = "查询所有大类")
    public List<VideoMold> selectAllBigMold() {
        return videoMoldService.selectAllBigMold();
    }

    @GetMapping("/selectInuseBigMold")
    @ApiOperation(value = "查询所有有效大类")
    public List<VideoMold> selectInuseBigMold() {
        return videoMoldService.selectInuseBigMold();
    }

    @GetMapping("/selectAllSmallMold")
    @ApiOperation(value = "查询所有小类")
    public List<VideoMold> selectAllSmallMold() {
        return videoMoldService.selectAllSmallMold();
    }

    @GetMapping("/selectInuseSmallMold")
    @ApiOperation(value = "查询所有有效小类")
    public List<VideoMold> selectInuseSmallMold() {
        return videoMoldService.selectInuseSmallMold();
    }

//    @GetMapping("/selectMoldById")
//    public VideoMold selectMoldById(String moldId) {
//        return videoMoldService.selectMoldById(moldId);
//    }
//
//    @GetMapping("/selectMoldByName")
//    public List<VideoMold> selectMoldByName(String moldName) {
//        return videoMoldService.selectMoldByName(moldName);
//    }
}
