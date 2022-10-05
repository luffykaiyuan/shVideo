package com.luffykaiyuan.shvideo.service;

import com.luffykaiyuan.shvideo.dao.VideoTagMapper;
import com.luffykaiyuan.shvideo.po.VideoTag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoTagService implements VideoTagMapper {

    @Autowired
    VideoTagMapper videoTagMapper;

    public int insertTag(VideoTag videoTag) {
        return videoTagMapper.insertTag(videoTag);
    }

    public int updateTag(VideoTag videoTag) {
        return videoTagMapper.updateTag(videoTag);
    }

    public int delTag(String tagId) {
        return videoTagMapper.delTag(tagId);
    }

    public VideoTag selectTagById(String tagId) {
        return videoTagMapper.selectTagById(tagId);
    }

    public List<VideoTag> selectTagByName(String tagName) {
        return videoTagMapper.selectTagByName(tagName);
    }

    public List<VideoTag> selectAllTag() {
        return videoTagMapper.selectAllTag();
    }

    public List<VideoTag> selectInuseTag() {
        return videoTagMapper.selectInuseTag();
    }
}
