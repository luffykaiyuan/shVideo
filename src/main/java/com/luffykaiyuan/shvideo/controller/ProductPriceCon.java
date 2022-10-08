package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.po.ProductPrice;
import com.luffykaiyuan.shvideo.service.ProductPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductPriceCon {

    @Autowired
    ProductPriceService productPriceService;

    @GetMapping("/selectProduct")
    public List<ProductPrice> selectProduct() {
        return productPriceService.selectProduct();
    }
}
