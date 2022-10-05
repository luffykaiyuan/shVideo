package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.po.VideoMold;
import com.luffykaiyuan.shvideo.service.VideoMoldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VideoMoldCon {
    
    @Autowired
    VideoMoldService videoMoldService;

    @PostMapping("/insertMold")
    public int insertMold(VideoMold videoMold) {
        return videoMoldService.insertMold(videoMold);
    }

    @PostMapping("/updateMold")
    public int updateMold(VideoMold videoMold) {
        return videoMoldService.updateMold(videoMold);
    }

    @GetMapping("/delMold")
    public int delMold(String moldId) {
        return videoMoldService.delMold(moldId);
    }

    @GetMapping("/selectAllMold")
    public List<VideoMold> selectAllMold() {
        return videoMoldService.selectAllMold();
    }

    @GetMapping("/selectInuseMold")
    public List<VideoMold> selectInuseMold() {
        return videoMoldService.selectInuseMold();
    }

    @GetMapping("/selectAllBigMold")
    public List<VideoMold> selectAllBigMold() {
        return videoMoldService.selectAllBigMold();
    }

    @GetMapping("/selectInuseBigMold")
    public List<VideoMold> selectInuseBigMold() {
        return videoMoldService.selectInuseBigMold();
    }

    @GetMapping("/selectAllSmallMold")
    public List<VideoMold> selectAllSmallMold() {
        return videoMoldService.selectAllSmallMold();
    }

    @GetMapping("/selectInuseSmallMold")
    public List<VideoMold> selectInuseSmallMold() {
        return videoMoldService.selectInuseSmallMold();
    }

    @GetMapping("/selectMoldById")
    public VideoMold selectMoldById(String moldId) {
        return videoMoldService.selectMoldById(moldId);
    }
    @GetMapping("/selectMoldByName")
    public List<VideoMold> selectMoldByName(String moldName) {
        return videoMoldService.selectMoldByName(moldName);
    }
}
