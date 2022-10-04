package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.VideoMole;

public interface VideoMoleMapper {
    int deleteByPrimaryKey(String moldId);

    int insert(VideoMole record);

    int insertSelective(VideoMole record);

    VideoMole selectByPrimaryKey(String moldId);

    int updateByPrimaryKeySelective(VideoMole record);

    int updateByPrimaryKey(VideoMole record);
}