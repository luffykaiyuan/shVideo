package com.luffykaiyuan.shvideo.service;

import com.luffykaiyuan.shvideo.po.VideoInfo;
import com.luffykaiyuan.shvideo.po.VideoSource;

import java.util.Date;
import java.util.List;

public interface  VideoInfoService{

    int insertVideo(VideoInfo videoInfo);

    int updateVideo(VideoInfo videoInfo);

    int delVideo(String videoId);

    int insertVideoList(List<VideoSource> sourceList, String coverServer, String videoServer, String adminName);

    List<VideoInfo> selectAllVideo(int pageNum, int pageSize);

    List<VideoInfo> selectInuseVideo(int pageNum, int pageSize);

    VideoInfo selectVideoById(String videoId);

    List<VideoInfo> selectVideoByMold(String bigMold, String smallMold);

    List<VideoInfo> selectVideoByBigMold(String bigMold, int pageNum, int pageSize);

    List<VideoInfo> selectVideoByBigMoldLimit(String bigMold);

    List<VideoInfo> selectVideoBySmallMold(String smallMold, int pageNum, int pageSize);

    List<VideoInfo> selectVideoBySmallMoldLimit(String smallMold);

    List<VideoInfo> selectVideoByMoldId(String moldId);

    List<VideoInfo> selectVideoByVideoName(String videoName, int pageNum, int pageSize);

    List<VideoInfo> selectVideoByTag(String videoTag, int pageNum, int pageSize);

    List<VideoInfo> selectVideoByTime(Date beginTime, Date endTime, int pageNum, int pageSize);

    List<VideoInfo> selectVideoByDes(String videoDescribe, int pageNum, int pageSize);

    int updateBatchVideoServer(List<VideoInfo> videoInfoList);

    int updateBatchVideoMold(List<VideoInfo> videoInfoList);

}
