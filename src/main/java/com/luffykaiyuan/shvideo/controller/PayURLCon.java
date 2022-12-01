package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.po.PayURL;
import com.luffykaiyuan.shvideo.service.PayURLService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "支付接口编辑")
public class PayURLCon {

    @Autowired
    PayURLService payURLService;

    @PostMapping("/insertPayURL")
    @ApiOperation(value = "新增支付接口")
    public int insertPayURL(PayURL payURL) {
        return payURLService.insertPayURL(payURL);
    }

    @PostMapping("/updatePayURL")
    @ApiOperation(value = "修改支付接口")
    public int updatePayURL(PayURL payURL) {
        return payURLService.updatePayURL(payURL);
    }

    @GetMapping("/chooseOnePayURL")
    @ApiOperation(value = "选择一个有效的支付接口")
    public int chooseOnePayURL(String payId) {
        payURLService.removeAllPayURL();
        return payURLService.chooseOnePayURL(payId);
    }

    @GetMapping("/delpayURL")
    @ApiOperation(value = "删除支付接口")
    public int delpayURL(String payId) {
        return payURLService.delpayURL(payId);
    }

    @GetMapping("/selectInusePayURL")
    @ApiOperation(value = "查询所有有效支付接口")
    public List<PayURL> selectInusePayURL() {
        return payURLService.selectInusePayURL();
    }

    @GetMapping("/selectAllPayURL")
    @ApiOperation(value = "查询所有支付接口")
    public List<PayURL> selectAllPayURL() {
        return payURLService.selectAllPayURL();
    }

//    @GetMapping("/selectPayURLById")
//    public List<PayURL> selectPayURLById(String payId) {
//        return payURLService.selectPayURLById(payId);
//    }
}
