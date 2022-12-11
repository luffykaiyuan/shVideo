package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.ProductPrice;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductPriceMapper {
    int deleteByPrimaryKey(String productId);

    int insert(ProductPrice record);

    int insertSelective(ProductPrice record);

    ProductPrice selectByPrimaryKey(String productId);

    int updateByPrimaryKeySelective(ProductPrice record);

    int updateByPrimaryKey(ProductPrice record);
}