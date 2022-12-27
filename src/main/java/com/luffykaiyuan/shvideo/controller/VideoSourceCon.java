package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.po.VideoSource;
import com.luffykaiyuan.shvideo.service.VideoSourceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@Api(tags = "视频源操作")
public class VideoSourceCon {

    @Autowired
    VideoSourceService videoSourceService;

    //文件存储到本地
    @PostMapping("/uploadFile")
    @ApiOperation(value = "上传单个视频源txt到服务器")
    public String uploadFile(MultipartFile file) {
        return videoSourceService.uploadFile(file);
    }

    @PostMapping("/insertVideoSource")
    @ApiOperation(value = "视频源列表上传至mysql")
    public List<VideoSource> insertVideoSource(@RequestBody String[] videoAddressList){
        return videoSourceService.insertVideoSource(videoAddressList);
    }

}
