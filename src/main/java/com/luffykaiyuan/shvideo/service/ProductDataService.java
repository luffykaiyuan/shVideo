package com.luffykaiyuan.shvideo.service;

import com.luffykaiyuan.shvideo.dao.ProductDataMapper;
import com.luffykaiyuan.shvideo.po.ProductData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDataService implements ProductDataMapper {

    @Autowired
    ProductDataMapper productDataMapper;

    public int insertProductData(ProductData productData) {
        return productDataMapper.insertProductData(productData);
    }

    public int updateProductData(ProductData productData) {
        return productDataMapper.updateProductData(productData);
    }

    public List<ProductData> selectInuseProductData() {
        return productDataMapper.selectInuseProductData();
    }

    public List<ProductData> selectProductDataByUsername(String username) {
        return productDataMapper.selectProductDataByUsername(username);
    }
}
