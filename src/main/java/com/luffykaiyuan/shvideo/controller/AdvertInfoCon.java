package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.po.AdvertInfo;
import com.luffykaiyuan.shvideo.service.AdvertInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdvertInfoCon {

    @Autowired
    AdvertInfoService advertInfoService;

    @PostMapping("/insertAdvert")
    public int insertAdvert(AdvertInfo advertInfo) {
        return advertInfoService.insertAdvert(advertInfo);
    }

    @PostMapping("/updateAdvert")
    public int updateAdvert(AdvertInfo advertInfo) {
        return advertInfoService.updateAdvert(advertInfo);
    }

    @GetMapping("/chooseOneAdvert")
    public int chooseOneAdvert(String advertLocation, String advertId){
        advertInfoService.removeAllAdvert(advertLocation);
        return advertInfoService.chooseOneAdvert(advertId);
    }

    @GetMapping("/delAdvertInfo")
    public int delAdvertInfo(String advertId) {
        return advertInfoService.delAdvertInfo(advertId);
    }

    @GetMapping("/selectAllAdvert")
    public List<AdvertInfo> selectAllAdvert() {
        return advertInfoService.selectAllAdvert();
    }

    @GetMapping("/selectUsableAdvert")
    public List<AdvertInfo> selectUsableAdvert() {
        return advertInfoService.selectUsableAdvert();
    }

    @GetMapping("/selectInuseAdvert")
    public List<AdvertInfo> selectInuseAdvert() {
        return advertInfoService.selectInuseAdvert();
    }

    @GetMapping("/selectAdvertByLocation")
    public List<AdvertInfo> selectAdvertByLocation(String advertLocation) {
        return advertInfoService.selectAdvertByLocation(advertLocation);
    }
}
