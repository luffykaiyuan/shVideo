package com.luffykaiyuan.shvideo.po;

import java.util.Date;

public class VideoInfo {
    private String videoId;

    private String videoName;

    private String videoCover;

    private String videoSource;

    private String bigMold;

    private String smallMold;

    private Date addTime;

    private String status;

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId == null ? null : videoId.trim();
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    public String getVideoCover() {
        return videoCover;
    }

    public void setVideoCover(String videoCover) {
        this.videoCover = videoCover == null ? null : videoCover.trim();
    }

    public String getVideoSource() {
        return videoSource;
    }

    public void setVideoSource(String videoSource) {
        this.videoSource = videoSource == null ? null : videoSource.trim();
    }

    public String getBigMold() {
        return bigMold;
    }

    public void setBigMold(String bigMold) {
        this.bigMold = bigMold == null ? null : bigMold.trim();
    }

    public String getSmallMold() {
        return smallMold;
    }

    public void setSmallMold(String smallMold) {
        this.smallMold = smallMold == null ? null : smallMold.trim();
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