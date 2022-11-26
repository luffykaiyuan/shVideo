package com.luffykaiyuan.shvideo.service;

import com.luffykaiyuan.shvideo.dao.VideoInfoMapper;
import com.luffykaiyuan.shvideo.po.VideoInfo;
import com.luffykaiyuan.shvideo.po.VideoSource;
import com.luffykaiyuan.shvideo.util.GetNowDate;
import com.luffykaiyuan.shvideo.util.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class VideoInfoService implements VideoInfoMapper {

    @Autowired
    VideoInfoMapper videoInfoMapper;

    public int insertVideo(VideoInfo videoInfo) {
        videoInfo.setVideoId(UUIDUtils.getUUID(16));
        videoInfo.setAddTime(GetNowDate.getDate());
        return videoInfoMapper.insertVideo(videoInfo);
    }

    public int insertVideoList(List<VideoSource> sourceList, String coverServer, String videoServer, String adminName) {
        for (int i = 0; i < sourceList.size(); i++) {
            VideoInfo videoInfo = new VideoInfo();
            videoInfo.setVideoId(UUIDUtils.getUUID(16));
            videoInfo.setVideoName(sourceList.get(i).getName());
            videoInfo.setVideoCover(sourceList.get(i).getCover().replace("xxx.xxx.xxx", coverServer));
            videoInfo.setVideoDescribe(sourceList.get(i).getContent());
            videoInfo.setVideoTag(sourceList.get(i).getTag());
            videoInfo.setVideoSource(sourceList.get(i).getHttpContent().replace("xxx.xxx.xxx", videoServer));
            videoInfo.setVideoServer(videoServer);
            videoInfo.setCoverServer(coverServer);
            videoInfo.setDuration(sourceList.get(i).getDuration());
            videoInfo.setAdminName(adminName);
            videoInfo.setAddTime(GetNowDate.getDate());
            videoInfoMapper.insertVideo(videoInfo);
        }
        return 0;
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

    public List<VideoInfo> selectVideoByBigMoldLimit(String bigMold) {
        return videoInfoMapper.selectVideoByBigMoldLimit(bigMold);
    }

    public List<VideoInfo> selectVideoBySmallMold(String smallMold) {
        return videoInfoMapper.selectVideoBySmallMold(smallMold);
    }

    public List<VideoInfo> selectVideoBySmallMoldLimit(String smallMold) {
        return videoInfoMapper.selectVideoBySmallMoldLimit(smallMold);
    }

    public List<VideoInfo> selectVideoByVideoName(String videoName) {
        return videoInfoMapper.selectVideoByVideoName(videoName);
    }

    public List<VideoInfo> selectVideoByTime(Date beginTime, Date endTime) {
        return videoInfoMapper.selectVideoByTime(beginTime, endTime);
    }

    public List<VideoInfo> selectVideoByTag(String videoTag) {
        return videoInfoMapper.selectVideoByTag(videoTag);
    }

    public int updateBatchVideoServer(List<VideoInfo> videoInfoList) {
        return videoInfoMapper.updateBatchVideoServer(videoInfoList);
    }

    public int updateBatchVideoMold(List<VideoInfo> videoInfoList) {
        return videoInfoMapper.updateBatchVideoMold(videoInfoList);
    }
}
