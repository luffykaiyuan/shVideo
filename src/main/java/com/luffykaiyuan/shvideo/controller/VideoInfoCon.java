package com.luffykaiyuan.shvideo.controller;

import com.github.pagehelper.PageInfo;
import com.luffykaiyuan.shvideo.po.VideoInfo;
import com.luffykaiyuan.shvideo.po.VideoSource;
import com.luffykaiyuan.shvideo.service.VideoInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public int insertVideoList(@RequestBody List<VideoSource> sourceList, String coverServer, String videoServer, String adminName) {
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

    @GetMapping("/delVideos")
    @ApiOperation(value = "批量删除视频")
    public int delVideos(@RequestParam List<String> videoIds){ return videoInfoService.delVideos(videoIds); }

    @GetMapping("/selectAllVideo")
    @ApiOperation(value = "查询所有视频")
    public PageInfo<VideoInfo> selectAllVideo(int pageNum, int pageSize) {
        return videoInfoService.selectAllVideo(pageNum, pageSize);
    }

    @GetMapping("/selectInuseVideo")
    @ApiOperation(value = "查询所有有效视频")
    public PageInfo<VideoInfo> selectInuseVideo(int pageNum, int pageSize) {
        return videoInfoService.selectInuseVideo(pageNum, pageSize);
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
    public PageInfo<VideoInfo> selectVideoByBigMold(String bigMold, int pageNum, int pageSize) {
        return videoInfoService.selectVideoByBigMold(bigMold, pageNum, pageSize);
    }

    @GetMapping("/selectVideoByBigMoldLimit")
    @ApiOperation(value = "查询视频 by 大类 限制6个")
    public List<VideoInfo> selectVideoByBigMoldLimit(String bigMold) {
        return videoInfoService.selectVideoByBigMoldLimit(bigMold);
    }

    @GetMapping("/selectVideoBySmallMold")
    @ApiOperation(value = "查询视频 by 小类")
    public PageInfo<VideoInfo> selectVideoBySmallMold(String smallMold, int pageNum, int pageSize) {
        return videoInfoService.selectVideoBySmallMold(smallMold, pageNum, pageSize);
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
    public PageInfo<VideoInfo> selectVideoByVideoName(String videoName, int pageNum, int pageSize) {
        return videoInfoService.selectVideoByVideoName(videoName, pageNum, pageSize);
    }

    @GetMapping("/selectVideoByTime")
    @ApiOperation(value = "查询视频 by 时间间隔")
    public PageInfo<VideoInfo> selectVideoByTime(Date beginTime, Date endTime, int pageNum, int pageSize) {
        return videoInfoService.selectVideoByTime(beginTime, endTime, pageNum, pageSize);
    }

    @GetMapping("/selectVideoByTag")
    @ApiOperation(value = "查询视频 by 标签")
    public PageInfo<VideoInfo> selectVideoByTag(String videoTag, int pageNum, int pageSize) {
        return videoInfoService.selectVideoByTag(videoTag, pageNum, pageSize);
    }

    @GetMapping("/selectVideoByDes")
    @ApiOperation(value = "查询视频 by 描述")
    public PageInfo<VideoInfo> selectVideoByDes(String videoDescribe, int pageNum, int pageSize){ return videoInfoService.selectVideoByDes(videoDescribe, pageNum, pageSize); }

    @PostMapping("/updateBatchVideoServer")
    @ApiOperation(value = "修改视频的服务器地址 by id、可批量更新")
    public int updateBatchVideoServer(@RequestBody List<VideoInfo> videoInfoList) {
        return videoInfoService.updateBatchVideoServer(videoInfoList);
    }

    @PostMapping("/updateBatchVideoMold")
    @ApiOperation(value = "修改视频的大小类 by id、可批量更新")
    public int updateBatchVideoMold(@RequestBody List<VideoInfo> videoInfoList) {
        return videoInfoService.updateBatchVideoMold(videoInfoList);
    }
}
