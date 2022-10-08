package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.po.RankDetail;
import com.luffykaiyuan.shvideo.service.RankDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RankDetailCon {

    @Autowired
    RankDetailService rankDetailService;

    @GetMapping("/selectRankRule")
    public List<RankDetail> selectRankRule() {
        return rankDetailService.selectRankRule();
    }
}