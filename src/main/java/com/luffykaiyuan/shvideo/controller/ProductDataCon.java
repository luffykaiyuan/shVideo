package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.po.ProductData;
import com.luffykaiyuan.shvideo.service.ProductDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "查询所有订单")
public class ProductDataCon {

    @Autowired
    ProductDataService productDataService;

    @GetMapping("/selectInuseProductData")
    @ApiOperation(value = "查询所有有效订单")
    public List<ProductData> selectInuseProductData() {
        return productDataService.selectInuseProductData();
    }

    @GetMapping("/selectProductDataByTime")
    @ApiOperation(value = "查询所有有效订单 by 时间")
    public List<ProductData> selectProductDataByTime(String beginTime, String endTime) {
        return productDataService.selectProductDataByTime(beginTime, endTime);
    }

    @GetMapping("/selectProductDataByUsername")
    @ApiOperation(value = "查询所有有效订单 by 用户名")
    public List<ProductData> selectProductDataByUsername(String username) {
        return productDataService.selectProductDataByUsername(username);
    }

    @GetMapping("/selectProductDataByName")
    @ApiOperation(value = "查询所有有效订单 by 产品名")
    public List<ProductData> selectProductDataByName(String productName) {
        return productDataService.selectProductDataByName(productName);
    }


}
