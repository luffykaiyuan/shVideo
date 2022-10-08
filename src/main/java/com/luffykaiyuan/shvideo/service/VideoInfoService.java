package com.luffykaiyuan.shvideo.service;

import com.luffykaiyuan.shvideo.dao.VideoInfoMapper;
import com.luffykaiyuan.shvideo.po.VideoInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoInfoService implements VideoInfoMapper {

    @Autowired
    VideoInfoMapper videoInfoMapper;

    public int insertVideo(VideoInfo videoInfo) {
        return videoInfoMapper.insertVideo(videoInfo);
    }

    public int updateVideo(VideoInfo videoInfo) {
        return videoInfoMapper.updateVideo(videoInfo);
    }

    public int delVideo(String videoId) {
        return videoInfoMapper.delVideo(videoId);
    }

    public List<VideoInfo> selectAllVideo() {
        return videoInfoMapper.selectAllVideo();
    }

    public List<VideoInfo> selectInuseVideo() {
        return videoInfoMapper.selectInuseVideo();
    }

    public VideoInfo selectVideoById(String videoId) {
        return videoInfoMapper.selectVideoById(videoId);
    }

    public List<VideoInfo> selectVideoByMold(String bigMold, String smallMold) {
        return videoInfoMapper.selectVideoByMold(bigMold, smallMold);
    }

    public List<VideoInfo> selectVideoByBigMold(String bigMold) {
        return videoInfoMapper.selectVideoByBigMold(bigMold);
    }

    public List<VideoInfo> selectVideoBySmallMold(String smallMold) {
        return videoInfoMapper.selectVideoBySmallMold(smallMold);
    }

    public List<VideoInfo> selectVideoByVideoName(String videoName) {
        return videoInfoMapper.selectVideoByVideoName(videoName);
    }
}
