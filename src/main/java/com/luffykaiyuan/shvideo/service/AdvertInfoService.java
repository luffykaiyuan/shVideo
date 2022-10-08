package com.luffykaiyuan.shvideo.service;

import com.luffykaiyuan.shvideo.dao.AdvertInfoMapper;
import com.luffykaiyuan.shvideo.po.AdvertInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvertInfoService implements AdvertInfoMapper{

    @Autowired
    AdvertInfoMapper advertInfoMapper;

    public int insertAdvert(AdvertInfo advertInfo) {
        return advertInfoMapper.insertAdvert(advertInfo);
    }

    public int updateAdvert(AdvertInfo advertInfo) {
        return advertInfoMapper.updateAdvert(advertInfo);
    }

    public int delAdvertInfo(String advertId) {
        return advertInfoMapper.delAdvertInfo(advertId);
    }

    public List<AdvertInfo> selectAllAdvert() {
        return advertInfoMapper.selectAllAdvert();
    }

    public List<AdvertInfo> selectUsableAdvert() {
        return advertInfoMapper.selectUsableAdvert();
    }

    public List<AdvertInfo> selectInuseAdvert() {
        return advertInfoMapper.selectInuseAdvert();
    }
}
