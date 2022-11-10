package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.ProductData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductDataMapper {

    int insertProductData(ProductData productData);

    int updateProductData(ProductData productData);

    List<ProductData> selectInuseProductData();

    List<ProductData> selectProductDataByTime(String beginTime, String endTime);

    List<ProductData> selectProductDataByUsername(String username);

    List<ProductData> selectProductDataByName(String productName);

}