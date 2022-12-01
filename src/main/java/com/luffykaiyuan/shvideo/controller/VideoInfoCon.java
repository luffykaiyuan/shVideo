package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.po.VideoInfo;
import com.luffykaiyuan.shvideo.po.VideoSource;
import com.luffykaiyuan.shvideo.service.VideoInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@Api(tags = "视频操作")
public class VideoInfoCon {
    
    @Autowired
    VideoInfoService videoInfoService;

//    @PostMapping("/insertVideo")
//    public int insertVideo(VideoInfo videoInfo) {
//        return videoInfoService.insertVideo(videoInfo);
//    }

    @PostMapping("/insertVideoList")
    @ApiOperation(value = "根据视频源列表新增视频")
    public int insertVideoList(List<VideoSource> sourceList, String coverServer, String videoServer, String adminName) {
        return videoInfoService.insertVideoList(sourceList, coverServer, videoServer, adminName);
    }

    @PostMapping("/updateVideo")
    @ApiOperation(value = "修改视频")
    public int updateVideo(VideoInfo videoInfo) {
        return videoInfoService.updateVideo(videoInfo);
    }

    @GetMapping("/delVideo")
    @ApiOperation(value = "删除视频")
    public int delVideo(String videoId) {
        return videoInfoService.delVideo(videoId);
    }

    @GetMapping("/selectAllVideo")
    @ApiOperation(value = "查询所有视频")
    public List<VideoInfo> selectAllVideo() {
        return videoInfoService.selectAllVideo();
    }

    @GetMapping("/selectInuseVideo")
    @ApiOperation(value = "查询所有有效视频")
    public List<VideoInfo> selectInuseVideo() {
        return videoInfoService.selectInuseVideo();
    }

    @GetMapping("/selectVideoById")
    @ApiOperation(value = "查询视频 by id")
    public VideoInfo selectVideoById(String videoId) {
        return videoInfoService.selectVideoById(videoId);
    }

//    @GetMapping("/selectVideoByMold")
//    public List<VideoInfo> selectVideoByMold(String bigMold, String smallMold) {
//        return videoInfoService.selectVideoByMold(bigMold, smallMold);
//    }

    @GetMapping("/selectVideoByBigMold")
    @ApiOperation(value = "查询视频 by 大类")
    public List<VideoInfo> selectVideoByBigMold(String bigMold) {
        return videoInfoService.selectVideoByBigMold(bigMold);
    }

    @GetMapping("/selectVideoByBigMoldLimit")
    @ApiOperation(value = "查询视频 by 大类 限制6个")
    public List<VideoInfo> selectVideoByBigMoldLimit(String bigMold) {
        return videoInfoService.selectVideoByBigMoldLimit(bigMold);
    }

    @GetMapping("/selectVideoBySmallMold")
    @ApiOperation(value = "查询视频 by 小类")
    public List<VideoInfo> selectVideoBySmallMold(String smallMold) {
        return videoInfoService.selectVideoBySmallMold(smallMold);
    }

    @GetMapping("/selectVideoBySmallMoldLimit")
    @ApiOperation(value = "查询视频 by 小类 限制4个")
    public List<VideoInfo> selectVideoBySmallMoldLimit(String smallMold) {
        return videoInfoService.selectVideoBySmallMoldLimit(smallMold);
    }

    @GetMapping("/selectVideoByMoldId")
    @ApiOperation(value = "查询视频 by 类Id")
    public List<VideoInfo> selectVideoByMoldId(String moldId) {
        return videoInfoService.selectVideoByMoldId(moldId);
    }

    @GetMapping("/selectVideoByVideoName")
    @ApiOperation(value = "查询视频 by 片名")
    public List<VideoInfo> selectVideoByVideoName(String videoName) {
        return videoInfoService.selectVideoByVideoName(videoName);
    }

    @GetMapping("/selectVideoByTime")
    @ApiOperation(value = "查询视频 by 时间间隔")
    public List<VideoInfo> selectVideoByTime(Date beginTime, Date endTime) {
        return videoInfoService.selectVideoByTime(beginTime, endTime);
    }

    @GetMapping("/selectVideoByTag")
    @ApiOperation(value = "查询视频 by 标签")
    public List<VideoInfo> selectVideoByTag(String videoTag) {
        return videoInfoService.selectVideoByTag(videoTag);
    }

    @PostMapping("/updateBatchVideoServer")
    @ApiOperation(value = "修改视频的服务器地址 by id、可批量更新")
    public int updateBatchVideoServer(List<VideoInfo> videoInfoList) {
        return videoInfoService.updateBatchVideoServer(videoInfoList);
    }

    @PostMapping("/updateBatchVideoMold")
    @ApiOperation(value = "修改视频的大小类 by id、可批量更新")
    public int updateBatchVideoMold(List<VideoInfo> videoInfoList) {
        return videoInfoService.updateBatchVideoMold(videoInfoList);
    }
}
