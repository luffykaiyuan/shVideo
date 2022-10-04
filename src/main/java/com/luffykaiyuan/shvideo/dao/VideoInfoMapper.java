package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.VideoInfo;

public interface VideoInfoMapper {
    int deleteByPrimaryKey(String videoId);

    int insert(VideoInfo record);

    int insertSelective(VideoInfo record);

    VideoInfo selectByPrimaryKey(String videoId);

    int updateByPrimaryKeySelective(VideoInfo record);

    int updateByPrimaryKey(VideoInfo record);
}