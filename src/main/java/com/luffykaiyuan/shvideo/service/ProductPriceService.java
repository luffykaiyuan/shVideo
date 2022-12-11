package com.luffykaiyuan.shvideo.service;

import com.luffykaiyuan.shvideo.dao.ProductPriceMapper;
import com.luffykaiyuan.shvideo.po.ProductPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductPriceService implements ProductPriceMapper {

    @Autowired
    ProductPriceMapper productPriceMapper;

    @Override
    public int deleteByPrimaryKey(String productId) {
        return 0;
    }

    @Override
    public int insert(ProductPrice record) {
        return 0;
    }

    @Override
    public int insertSelective(ProductPrice record) {
        return 0;
    }

    @Override
    public ProductPrice selectByPrimaryKey(String productId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(ProductPrice record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(ProductPrice record) {
        return 0;
    }

//    public List<ProductPrice> selectProduct() {
//        return productPriceMapper.selectProduct();
//    }
}
