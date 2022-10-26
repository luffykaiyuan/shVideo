package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.VideoSource;

public interface VideoSourceMapper {
    int deleteByPrimaryKey(String id);

    int insert(VideoSource record);

    int insertSelective(VideoSource record);

    VideoSource selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(VideoSource record);

    int updateByPrimaryKeyWithBLOBs(VideoSource record);

    int updateByPrimaryKey(VideoSource record);
}