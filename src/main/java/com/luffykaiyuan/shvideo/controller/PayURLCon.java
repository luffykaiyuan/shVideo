package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.po.PayURL;
import com.luffykaiyuan.shvideo.service.PayURLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PayURLCon {

    @Autowired
    PayURLService payURLService;

    @PostMapping("/insertPayURL")
    public int insertPayURL(PayURL payURL) {
        return payURLService.insertPayURL(payURL);
    }

    @PostMapping("/updatePayURL")
    public int updatePayURL(PayURL payURL) {
        return payURLService.updatePayURL(payURL);
    }

    @GetMapping("/chooseOnePayURL")
    public int chooseOnePayURL(String payId) {
        payURLService.removeAllPayURL();
        return payURLService.chooseOnePayURL(payId);
    }

    @GetMapping("/delpayURL")
    public int delpayURL(String payId) {
        return payURLService.delpayURL(payId);
    }

    @GetMapping("/selectInusePayURL")
    public List<PayURL> selectInusePayURL() {
        return payURLService.selectInusePayURL();
    }

    @GetMapping("/selectAllPayURL")
    public List<PayURL> selectAllPayURL() {
        return payURLService.selectAllPayURL();
    }

    @GetMapping("/selectPayURLById")
    public List<PayURL> selectPayURLById(String payId) {
        return payURLService.selectPayURLById(payId);
    }
}
