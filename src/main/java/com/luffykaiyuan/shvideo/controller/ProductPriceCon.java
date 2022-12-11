package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.service.ProductPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductPriceCon {

    @Autowired
    ProductPriceService productPriceService;

//    @GetMapping("/selectProduct")
//    public List<ProductPrice> selectProduct() {
//        return productPriceService.selectProduct();
//    }
}
