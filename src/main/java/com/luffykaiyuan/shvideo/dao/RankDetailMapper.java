package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.RankDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RankDetailMapper {

    List<RankDetail> selectRankRule();

//    int deleteByPrimaryKey(String rankId);
//
//    int insert(RankDetail record);
//
//    int insertSelective(RankDetail record);
//
//    RankDetail selectByPrimaryKey(String rankId);
//
//    int updateByPrimaryKeySelective(RankDetail record);
//
//    int updateByPrimaryKey(RankDetail record);
}