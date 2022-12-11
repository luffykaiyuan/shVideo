package com.luffykaiyuan.shvideo.po;

import java.util.Date;

public class ProductData {
    private String productDataId;

    private String productName;

    private String username;

    private String rankId;

    private Date addTime;

    private String status;

    public String getProductDataId() {
        return productDataId;
    }

    public void setProductDataId(String productDataId) {
        this.productDataId = productDataId == null ? null : productDataId.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getRankId() {
        return rankId;
    }

    public void setRankId(String rankId) {
        this.rankId = rankId == null ? null : rankId.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}