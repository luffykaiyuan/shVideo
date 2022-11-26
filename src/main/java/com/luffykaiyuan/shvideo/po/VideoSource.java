package com.luffykaiyuan.shvideo.po;

public class VideoSource {
    private String id;

    private String name;

    private String content;

    private String tag;

    private String cover;

    private String secretCover;

    private String secretCoverText;

    private String ratio;

    private Integer size;

    private Integer duration;

    private String serverIp;

    private String xvalue;

    private String xkey;

    private String httpContent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public String getSecretCover() {
        return secretCover;
    }

    public void setSecretCover(String secretCover) {
        this.secretCover = secretCover == null ? null : secretCover.trim();
    }

    public String getSecretCoverText() {
        return secretCoverText;
    }

    public void setSecretCoverText(String secretCoverText) {
        this.secretCoverText = secretCoverText == null ? null : secretCoverText.trim();
    }

    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio == null ? null : ratio.trim();
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp == null ? null : serverIp.trim();
    }

    public String getXvalue() {
        return xvalue;
    }

    public void setXvalue(String xvalue) {
        this.xvalue = xvalue == null ? null : xvalue.trim();
    }

    public String getXkey() {
        return xkey;
    }

    public void setXkey(String xkey) {
        this.xkey = xkey == null ? null : xkey.trim();
    }

    public String getHttpContent() {
        return httpContent;
    }

    public void setHttpContent(String httpContent) {
        this.httpContent = httpContent == null ? null : httpContent.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}