package com.luffykaiyuan.shvideo.service;

import com.luffykaiyuan.shvideo.dao.VideoMoldMapper;
import com.luffykaiyuan.shvideo.po.VideoMold;
import com.luffykaiyuan.shvideo.util.GetNowDate;
import com.luffykaiyuan.shvideo.util.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoMoldService implements VideoMoldMapper{

    @Autowired
    VideoMoldMapper videoMoldMapper;

    public int insertMold(VideoMold videoMold) {
        videoMold.setMoldId(UUIDUtils.getUUID(16));
        videoMold.setAddTime(GetNowDate.getDate());
        return videoMoldMapper.insertMold(videoMold);
    }

    public int updateMold(VideoMold videoMold) {
        return videoMoldMapper.updateMold(videoMold);
    }

    public int delMold(String moldId){
        return videoMoldMapper.delMold(moldId);
    }


    public List<VideoMold> selectAllMold() {
        return videoMoldMapper.selectAllMold();
    }

    public List<VideoMold> selectInuseMold() {
        return videoMoldMapper.selectInuseMold();
    }

    public List<VideoMold> selectAllBigMold() {
        return videoMoldMapper.selectAllBigMold();
    }

    public List<VideoMold> selectInuseBigMold() {
        return videoMoldMapper.selectInuseBigMold();
    }

    public List<VideoMold> selectAllSmallMold() {
        return videoMoldMapper.selectAllSmallMold();
    }

    public List<VideoMold> selectInuseSmallMold() {
        return videoMoldMapper.selectInuseSmallMold();
    }

    public VideoMold selectMoldById(String moldId) {
        return videoMoldMapper.selectMoldById(moldId);
    }

    public List<VideoMold> selectMoldByName(String moldName) {
        return videoMoldMapper.selectMoldByName(moldName);
    }
}
