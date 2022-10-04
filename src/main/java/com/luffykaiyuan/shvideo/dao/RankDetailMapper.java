package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.RankDetail;

public interface RankDetailMapper {
    int deleteByPrimaryKey(String rankId);

    int insert(RankDetail record);

    int insertSelective(RankDetail record);

    RankDetail selectByPrimaryKey(String rankId);

    int updateByPrimaryKeySelective(RankDetail record);

    int updateByPrimaryKey(RankDetail record);
}