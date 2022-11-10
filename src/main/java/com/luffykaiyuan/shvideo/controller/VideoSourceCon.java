package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.service.VideoSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class VideoSourceCon {

    @Autowired
    VideoSourceService videoSourceService;

    //文件存储到本地
    @PostMapping("/uploadFile")
    public String uploadFile(MultipartFile file) {
        return videoSourceService.uploadFile(file);
    }

    @PostMapping("/insertVideoSource")
    public boolean insertVideoSource(String[] videoAddressList){
        return videoSourceService.insertVideoSource(videoAddressList);
    }

}
