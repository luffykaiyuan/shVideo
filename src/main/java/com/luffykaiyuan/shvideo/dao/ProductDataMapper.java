package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.ProductData;

public interface ProductDataMapper {
    int deleteByPrimaryKey(String productDataId);

    int insert(ProductData record);

    int insertSelective(ProductData record);

    ProductData selectByPrimaryKey(String productDataId);

    int updateByPrimaryKeySelective(ProductData record);

    int updateByPrimaryKey(ProductData record);
}