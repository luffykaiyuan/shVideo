package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.VideoTag;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VideoTagMapper {

    int insertTag(VideoTag videoTag);

    int updateTag(VideoTag videoTag);

    int delTag(String tagId);

    VideoTag selectTagById(String tagId);

    List<VideoTag> selectTagByName(String tagName);

    List<VideoTag> selectAllTag();

    List<VideoTag> selectInuseTag();
}