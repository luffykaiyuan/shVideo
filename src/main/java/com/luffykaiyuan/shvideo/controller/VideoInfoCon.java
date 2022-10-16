package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.po.VideoInfo;
import com.luffykaiyuan.shvideo.service.VideoInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VideoInfoCon {
    
    @Autowired
    VideoInfoService videoInfoService;

    @PostMapping("/insertVideo")
    public int insertVideo(VideoInfo videoInfo) {
        return videoInfoService.insertVideo(videoInfo);
    }

    @PostMapping("/updateVideo")
    public int updateVideo(VideoInfo videoInfo) {
        return videoInfoService.updateVideo(videoInfo);
    }

    @GetMapping("/delVideo")
    public int delVideo(String videoId) {
        return videoInfoService.delVideo(videoId);
    }

    @GetMapping("/selectAllVideo")
    public List<VideoInfo> selectAllVideo() {
        return videoInfoService.selectAllVideo();
    }

    @GetMapping("/selectInuseVideo")
    public List<VideoInfo> selectInuseVideo() {
        return videoInfoService.selectInuseVideo();
    }

    @GetMapping("/selectVideoById")
    public VideoInfo selectVideoById(String videoId) {
        return videoInfoService.selectVideoById(videoId);
    }

    @GetMapping("/selectVideoByMold")
    public List<VideoInfo> selectVideoByMold(String bigMold, String smallMold) {
        return videoInfoService.selectVideoByMold(bigMold, smallMold);
    }

    @GetMapping("/selectVideoByBigMold")
    public List<VideoInfo> selectVideoByBigMold(String bigMold) {
        return videoInfoService.selectVideoByBigMold(bigMold);
    }

    @GetMapping("/selectVideoBySmallMold")
    public List<VideoInfo> selectVideoBySmallMold(String smallMold) {
        return videoInfoService.selectVideoBySmallMold(smallMold);
    }

    @GetMapping("/selectVideoByVideoName")
    public List<VideoInfo> selectVideoByVideoName(String videoName) {
        return videoInfoService.selectVideoByVideoName(videoName);
    }
}