package com.luffykaiyuan.shvideo.po;

import java.util.Date;

public class AdvertInfo {
    private String advertId;

    private String advertSource;

    private String advertLocation;

    private Date addTime;

    private String status;

    public String getAdvertId() {
        return advertId;
    }

    public void setAdvertId(String advertId) {
        this.advertId = advertId == null ? null : advertId.trim();
    }

    public String getAdvertSource() {
        return advertSource;
    }

    public void setAdvertSource(String advertSource) {
        this.advertSource = advertSource == null ? null : advertSource.trim();
    }

    public String getAdvertLocation() {
        return advertLocation;
    }

    public void setAdvertLocation(String advertLocation) {
        this.advertLocation = advertLocation == null ? null : advertLocation.trim();
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