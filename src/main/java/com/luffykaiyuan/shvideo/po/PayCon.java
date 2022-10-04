package com.luffykaiyuan.shvideo.po;

import java.util.Date;

public class PayCon {
    private byte[] payId;

    private String payUrl;

    private Date addTime;

    private String status;

    public byte[] getPayId() {
        return payId;
    }

    public void setPayId(byte[] payId) {
        this.payId = payId;
    }

    public String getPayUrl() {
        return payUrl;
    }

    public void setPayUrl(String payUrl) {
        this.payUrl = payUrl == null ? null : payUrl.trim();
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
}