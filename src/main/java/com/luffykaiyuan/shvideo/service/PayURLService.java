package com.luffykaiyuan.shvideo.service;

import com.luffykaiyuan.shvideo.dao.PayURLMapper;
import com.luffykaiyuan.shvideo.po.PayURL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayURLService implements PayURLMapper {

    @Autowired
    PayURLMapper payURLMapper;

    public int insertPayURL(PayURL payURL) {
        return payURLMapper.insertPayURL(payURL);
    }

    public int updatePayURL(PayURL payURL) {
        return payURLMapper.updatePayURL(payURL);
    }

    public int delpayURL(String payId) {
        return payURLMapper.delpayURL(payId);
    }

    public List<PayURL> selectInusePayURL() {
        return payURLMapper.selectInusePayURL();
    }

    public List<PayURL> selectAllPayURL() {
        return payURLMapper.selectAllPayURL();
    }

    public List<PayURL> selectPayURLById(String payId) {
        return payURLMapper.selectPayURLById(payId);
    }

    public int removeAllPayURL() {
        return payURLMapper.removeAllPayURL();
    }

    public int chooseOnePayURL(String payId) {
        return payURLMapper.chooseOnePayURL(payId);
    }
}
