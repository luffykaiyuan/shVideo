package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.AdvertInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdvertInfoMapper {

    int insertAdvert(AdvertInfo advertInfo);

    int updateAdvert(AdvertInfo advertInfo);

    int delAdvertInfo(String advertId);

    List<AdvertInfo> selectAllAdvert();

    List<AdvertInfo> selectUsableAdvert();

    List<AdvertInfo> selectInuseAdvert();

}