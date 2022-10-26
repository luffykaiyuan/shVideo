package com.luffykaiyuan.shvideo.po;

import java.util.Date;

public class UserRebate {
    private String id;

    private String username;

    private String usernameSon;

    private Float rebateNum;

    private Date addTime;

    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUsernameSon() {
        return usernameSon;
    }

    public void setUsernameSon(String usernameSon) {
        this.usernameSon = usernameSon == null ? null : usernameSon.trim();
    }

    public Float getRebateNum() {
        return rebateNum;
    }

    public void setRebateNum(Float rebateNum) {
        this.rebateNum = rebateNum;
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