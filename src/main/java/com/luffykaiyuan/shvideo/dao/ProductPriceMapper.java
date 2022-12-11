package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.ProductPrice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductPriceMapper {

    List<ProductPrice> selectProduct();

    ProductPrice selectProductByName(String productName);

    int updateProduct(ProductPrice productPrice);

}