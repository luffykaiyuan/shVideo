package com.luffykaiyuan.shvideo.service;

import com.luffykaiyuan.shvideo.dao.RankDetailMapper;
import com.luffykaiyuan.shvideo.po.RankDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankDetailService implements RankDetailMapper{

    @Autowired
    RankDetailMapper rankDetailMapper;

    public List<RankDetail> selectRankRule() {
        return rankDetailMapper.selectRankRule();
    }
}
