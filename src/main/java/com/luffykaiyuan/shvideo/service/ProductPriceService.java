package com.luffykaiyuan.shvideo.service;

import com.luffykaiyuan.shvideo.dao.ProductPriceMapper;
import com.luffykaiyuan.shvideo.po.ProductPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductPriceService implements ProductPriceMapper {

    @Autowired
    ProductPriceMapper productPriceMapper;

    public List<ProductPrice> selectProduct() {
        return productPriceMapper.selectProduct();
    }
}
