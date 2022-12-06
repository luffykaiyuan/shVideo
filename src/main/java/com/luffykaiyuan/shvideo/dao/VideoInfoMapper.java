package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.VideoInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface VideoInfoMapper {

    int insertVideo(VideoInfo videoInfo);

    int updateVideo(VideoInfo videoInfo);

    int delVideo(String videoId);

    List<VideoInfo> selectAllVideo();

    List<VideoInfo> selectInuseVideo();

    VideoInfo selectVideoById(String videoId);

    List<VideoInfo> selectVideoByMold(String bigMold, String smallMold);

    List<VideoInfo> selectVideoByBigMold(String bigMold);

    List<VideoInfo> selectVideoByBigMoldLimit(String bigMold);

    List<VideoInfo> selectVideoBySmallMold(String smallMold);

    List<VideoInfo> selectVideoBySmallMoldLimit(String smallMold);

    List<VideoInfo> selectVideoByMoldId(String moldId);

    List<VideoInfo> selectVideoByVideoName(String videoName);

    List<VideoInfo> selectVideoByTag(String videoTag);

    List<VideoInfo> selectVideoByTime(Date beginTime, Date endTime);

    List<VideoInfo> selectVideoByDes(String videoDescribe);

    int updateBatchVideoServer(List<VideoInfo> videoInfoList);

    int updateBatchVideoMold(List<VideoInfo> videoInfoList);

}