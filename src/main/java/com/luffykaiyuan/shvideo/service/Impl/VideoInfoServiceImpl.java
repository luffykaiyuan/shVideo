package com.luffykaiyuan.shvideo.service.Impl;

import com.github.pagehelper.PageInfo;
import com.luffykaiyuan.shvideo.dao.VideoInfoMapper;
import com.luffykaiyuan.shvideo.po.VideoInfo;
import com.luffykaiyuan.shvideo.po.VideoSource;
import com.luffykaiyuan.shvideo.service.VideoInfoService;
import com.luffykaiyuan.shvideo.util.GetNowDate;
import com.luffykaiyuan.shvideo.util.ShVideoUtils;
import com.luffykaiyuan.shvideo.util.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class VideoInfoServiceImpl implements VideoInfoService {

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

    public PageInfo<VideoInfo> selectAllVideo(int pageNum, int pageSize) {
        return ShVideoUtils.doPage(videoInfoMapper.selectAllVideo(), pageNum, pageSize);
    }

    public PageInfo<VideoInfo> selectInuseVideo(int pageNum, int pageSize) {
        return ShVideoUtils.doPage(videoInfoMapper.selectInuseVideo(), pageNum, pageSize);
    }

    public VideoInfo selectVideoById(String videoId) {
        return videoInfoMapper.selectVideoById(videoId);
    }

    public List<VideoInfo> selectVideoByMold(String bigMold, String smallMold) {
        return videoInfoMapper.selectVideoByMold(bigMold, smallMold);
    }

    public PageInfo<VideoInfo> selectVideoByBigMold(String bigMold, int pageNum, int pageSize) {
        return ShVideoUtils.doPage(videoInfoMapper.selectVideoByBigMold(bigMold), pageNum, pageSize);
    }

    public List<VideoInfo> selectVideoByBigMoldLimit(String bigMold) {
        return videoInfoMapper.selectVideoByBigMoldLimit(bigMold);
    }

    public PageInfo<VideoInfo> selectVideoBySmallMold(String smallMold, int pageNum, int pageSize) {
        return ShVideoUtils.doPage(videoInfoMapper.selectVideoBySmallMold(smallMold), pageNum, pageSize);
    }

    public List<VideoInfo> selectVideoBySmallMoldLimit(String smallMold) {
        return videoInfoMapper.selectVideoBySmallMoldLimit(smallMold);
    }

    public List<VideoInfo> selectVideoByMoldId(String moldId) {
        return videoInfoMapper.selectVideoByMoldId(moldId);
    }

    public PageInfo<VideoInfo> selectVideoByVideoName(String videoName, int pageNum, int pageSize) {
        return ShVideoUtils.doPage(videoInfoMapper.selectVideoByVideoName(videoName), pageNum, pageSize);
    }

    public PageInfo<VideoInfo> selectVideoByTime(Date beginTime, Date endTime, int pageNum, int pageSize) {
        return ShVideoUtils.doPage(videoInfoMapper.selectVideoByTime(beginTime, endTime), pageNum, pageSize);
    }

    public PageInfo<VideoInfo> selectVideoByTag(String videoTag, int pageNum, int pageSize) {
        return ShVideoUtils.doPage(videoInfoMapper.selectVideoByTag(videoTag), pageNum, pageSize);
    }

    public PageInfo<VideoInfo> selectVideoByDes(String videoDescribe, int pageNum, int pageSize){
        return ShVideoUtils.doPage(videoInfoMapper.selectVideoByDes(videoDescribe), pageNum, pageSize);
    }

    public int updateBatchVideoServer(List<VideoInfo> videoInfoList) {
        return videoInfoMapper.updateBatchVideoServer(videoInfoList);
    }

    public int updateBatchVideoMold(List<VideoInfo> videoInfoList) {
        return videoInfoMapper.updateBatchVideoMold(videoInfoList);
    }




}
