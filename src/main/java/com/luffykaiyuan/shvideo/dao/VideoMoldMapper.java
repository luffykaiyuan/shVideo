package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.VideoMold;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VideoMoldMapper {

    int insertMold(VideoMold videoMold);

    int updateMold(VideoMold videoMold);

    int delMold(String moldId);

    int delSmallMold(String belongMoldId);

    List<VideoMold> selectAllMold();

    List<VideoMold> selectInuseMold();

    List<VideoMold> selectAllBigMold();

    List<VideoMold> selectInuseBigMold();

    List<VideoMold> selectAllSmallMold();

    List<VideoMold> selectInuseSmallMold();

    List<VideoMold> selectSmallMoldByBig(String belongMoldId);

    VideoMold selectMoldById(String moldId);

    List<VideoMold> selectMoldByName(String moldName);

}