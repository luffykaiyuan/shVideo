package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.po.VideoTag;
import com.luffykaiyuan.shvideo.service.VideoTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VideoTagCon {
    
    @Autowired
    VideoTagService videoTagService;

    @PostMapping("/insertTag")
    public int insertTag(VideoTag videoTag) {
        return videoTagService.insertTag(videoTag);
    }

    @PostMapping("/updateTag")
    public int updateTag(VideoTag videoTag) {
        return videoTagService.updateTag(videoTag);
    }

    @GetMapping("/delTag")
    public int delTag(String tagId) {
        return videoTagService.delTag(tagId);
    }

    @GetMapping("/selectTagById")
    public VideoTag selectTagById(String tagId) {
        return videoTagService.selectTagById(tagId);
    }

    @GetMapping("/selectTagByName")
    public List<VideoTag> selectTagByName(String tagName) {
        return videoTagService.selectTagByName(tagName);
    }

    @GetMapping("/selectAllTag")
    public List<VideoTag> selectAllTag() {
        return videoTagService.selectAllTag();
    }

    @GetMapping("/selectInuseTag")
    public List<VideoTag> selectInuseTag() {
        return videoTagService.selectInuseTag();
    }
}
