package com.luffykaiyuan.shvideo.po;

import java.util.Date;

public class VideoMold {
    private String moldId;

    private String moldName;

    private String moldType;

    private String belongMoldId;

    private Date addTime;

    private String status;

    public String getMoldId() {
        return moldId;
    }

    public void setMoldId(String moldId) {
        this.moldId = moldId == null ? null : moldId.trim();
    }

    public String getMoldName() {
        return moldName;
    }

    public void setMoldName(String moldName) {
        this.moldName = moldName == null ? null : moldName.trim();
    }

    public String getMoldType() {
        return moldType;
    }

    public void setMoldType(String moldType) {
        this.moldType = moldType == null ? null : moldType.trim();
    }

    public String getBelongMoldId() {
        return belongMoldId;
    }

    public void setBelongMoldId(String belongMoldId) {
        this.belongMoldId = belongMoldId == null ? null : belongMoldId.trim();
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