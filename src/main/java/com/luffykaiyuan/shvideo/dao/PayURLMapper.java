package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.PayURL;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PayURLMapper {

    int insertPayURL(PayURL payURL);

    int updatePayURL(PayURL payURL);

    int delpayURL(String payId);

    List<PayURL> selectInusePayURL();

    List<PayURL> selectAllPayURL();

    PayURL selectPayURLById(String payId);

    int removeAllPayURL();

    int chooseOnePayURL(String payId);

}