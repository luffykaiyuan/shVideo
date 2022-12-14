package com.luffykaiyuan.shvideo.service;

import com.luffykaiyuan.shvideo.dao.ProductDataMapper;
import com.luffykaiyuan.shvideo.dao.ProductPriceMapper;
import com.luffykaiyuan.shvideo.dao.UserInfoMapper;
import com.luffykaiyuan.shvideo.po.ProductData;
import com.luffykaiyuan.shvideo.po.ProductPrice;
import com.luffykaiyuan.shvideo.po.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductDataService implements ProductDataMapper {

    @Autowired
    ProductDataMapper productDataMapper;

    @Autowired
    UserInfoMapper userInfoMapper;

    @Autowired
    ProductPriceMapper productPriceMapper;

    public int insertProductData(ProductData productData) {
        UserInfo userInfo = userInfoMapper.selectUserByName(productData.getUsername());
        ProductPrice productPrice = productPriceMapper.selectProductByName(productData.getProductName());
        BigDecimal userBig = new BigDecimal(Float.toString(userInfo.getMoney()));
        BigDecimal productBig = new BigDecimal(Float.toString(productPrice.getPrice()));
        userInfo.setMoney(userBig.subtract(productBig).floatValue());
        userInfo.setRemainDay(productPrice.getValidTime());
        userInfo.setCardType(productPrice.getProductName());
        userInfo.setLookNum(99999);
        userInfo.setOrginRank(userInfo.getRankId());
        userInfo.setRankId(productPrice.getProductId());
        userInfoMapper.updateUser(userInfo);
        return productDataMapper.insertProductData(productData);
    }

    public int updateProductData(ProductData productData) {
        return productDataMapper.updateProductData(productData);
    }

    public List<ProductData> selectInuseProductData() {
        return productDataMapper.selectInuseProductData();
    }

    public List<ProductData> selectProductDataByTime(String beginTime, String endTime) {
        return productDataMapper.selectProductDataByTime(beginTime, endTime);
    }

    public List<ProductData> selectProductDataByUsername(String username) {
        return productDataMapper.selectProductDataByUsername(username);
    }

    public List<ProductData> selectProductDataByName(String productName) {
        return productDataMapper.selectProductDataByName(productName);
    }
}
