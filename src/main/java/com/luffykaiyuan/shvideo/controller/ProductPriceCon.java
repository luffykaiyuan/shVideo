package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.po.ProductPrice;
import com.luffykaiyuan.shvideo.service.ProductPriceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "产品价目表操作")
public class ProductPriceCon {

    @Autowired
    ProductPriceService productPriceService;

    @GetMapping("/selectProduct")
    @ApiOperation(value = "查询所有价目")
    public List<ProductPrice> selectProduct(){
        return productPriceService.selectProduct();
    }

    @GetMapping("/selectProductByName")
    @ApiOperation(value = "通过产品名查单个价目")
    public ProductPrice selectProductByName(String productName){
        return productPriceService.selectProductByName(productName);
    }

    @PostMapping("/updateProduct")
    @ApiOperation(value = "更新产品")
    public int updateProduct(ProductPrice productPrice){
        return productPriceService.updateProduct(productPrice);
    }

}
