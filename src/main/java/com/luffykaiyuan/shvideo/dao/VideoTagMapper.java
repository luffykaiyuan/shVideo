package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.VideoTag;

public interface VideoTagMapper {
    int deleteByPrimaryKey(String tagId);

    int insert(VideoTag record);

    int insertSelective(VideoTag record);

    VideoTag selectByPrimaryKey(String tagId);

    int updateByPrimaryKeySelective(VideoTag record);

    int updateByPrimaryKey(VideoTag record);
}