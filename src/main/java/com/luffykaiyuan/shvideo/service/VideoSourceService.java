package com.luffykaiyuan.shvideo.service;

import com.luffykaiyuan.shvideo.dao.VideoSourceMapper;
import com.luffykaiyuan.shvideo.po.VideoSource;
import org.springframework.stereotype.Service;

@Service
public class VideoSourceService implements VideoSourceMapper {
    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    @Override
    public int insert(VideoSource record) {
        return 0;
    }

    @Override
    public int insertSelective(VideoSource record) {
        return 0;
    }

    @Override
    public VideoSource selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(VideoSource record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(VideoSource record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(VideoSource record) {
        return 0;
    }
}
