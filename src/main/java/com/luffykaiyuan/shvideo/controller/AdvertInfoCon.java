package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.po.AdvertInfo;
import com.luffykaiyuan.shvideo.service.AdvertInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "广告编辑")
public class AdvertInfoCon {

    @Autowired
    AdvertInfoService advertInfoService;

    @PostMapping("/insertAdvert")
    @ApiOperation(value = "新增广告")
    public int insertAdvert(AdvertInfo advertInfo) {
        return advertInfoService.insertAdvert(advertInfo);
    }

    @PostMapping("/updateAdvert")
    @ApiOperation(value = "修改广告")
    public int updateAdvert(AdvertInfo advertInfo) {
        return advertInfoService.updateAdvert(advertInfo);
    }

    @GetMapping("/chooseOneAdvert")
    @ApiOperation(value = "修改广告的启用状态")
    public int chooseOneAdvert(String advertLocation, String advertId){
        advertInfoService.removeAllAdvert(advertLocation);
        return advertInfoService.chooseOneAdvert(advertId);
    }

    @GetMapping("/delAdvertInfo")
    @ApiOperation(value = "删除广告")
    public int delAdvertInfo(String advertId) {
        return advertInfoService.delAdvertInfo(advertId);
    }

    @GetMapping("/selectAllAdvert")
    @ApiOperation(value = "查询所有广告")
    public List<AdvertInfo> selectAllAdvert() {
        return advertInfoService.selectAllAdvert();
    }

    @GetMapping("/selectUsableAdvert")
    @ApiOperation(value = "查询所有在使用广告")
    public List<AdvertInfo> selectUsableAdvert() {
        return advertInfoService.selectUsableAdvert();
    }

    @GetMapping("/selectInuseAdvert")
    @ApiOperation(value = "查询所有有效广告")
    public List<AdvertInfo> selectInuseAdvert() {
        return advertInfoService.selectInuseAdvert();
    }

    @GetMapping("/selectAdvertByLocation")
    @ApiOperation(value = "查询广告 by 位置")
    public List<AdvertInfo> selectAdvertByLocation(String advertLocation) {
        return advertInfoService.selectAdvertByLocation(advertLocation);
    }
}
