package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.ProductPrice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductPriceMapper {

    List<ProductPrice> selectProduct();

//    int deleteByPrimaryKey(String productId);
//
//    int insert(ProductPrice record);
//
//    int insertSelective(ProductPrice record);
//
//    ProductPrice selectByPrimaryKey(String productId);
//
//    int updateByPrimaryKeySelective(ProductPrice record);
//
//    int updateByPrimaryKey(ProductPrice record);
}