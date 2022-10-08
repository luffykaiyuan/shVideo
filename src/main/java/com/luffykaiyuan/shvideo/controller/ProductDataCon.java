package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.po.ProductData;
import com.luffykaiyuan.shvideo.service.ProductDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductDataCon {

    @Autowired
    ProductDataService productDataService;

    @GetMapping("/selectInuseProductData")
    public List<ProductData> selectInuseProductData() {
        return productDataService.selectInuseProductData();
    }

    @GetMapping("/selectProductDataByUsername")
    public List<ProductData> selectProductDataByUsername(String username) {
        return productDataService.selectProductDataByUsername(username);
    }
}
