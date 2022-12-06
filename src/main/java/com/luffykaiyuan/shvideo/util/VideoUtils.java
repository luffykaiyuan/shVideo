package com.luffykaiyuan.shvideo.util;

import com.luffykaiyuan.shvideo.po.VideoSource;
import net.sf.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class VideoUtils {



    //获取完整视频播放地址
    public static String getFullVideoURL(String orginURL){
        String str = orginURL.substring(orginURL.indexOf("xxx"), orginURL.indexOf(".ts"));
        String[] list = str.split("/");
        String finalURL = "http://";
        for (int i = 0; i < list.length-1; i++) {
            finalURL += list[i];
            finalURL += "/";
        }
        finalURL += "orc/index_relative.m3u8";
        return finalURL;
    }

    //根据地址获取json文件数据封装为对象
    public static VideoSource uploadVideo(String path){
        try {
            File file = new File(path);
            InputStreamReader isr = new InputStreamReader(new FileInputStream(file),"utf-8");
            BufferedReader br = new BufferedReader(isr);
            String content = br.readLine() ;
            br.close();
            isr.close();

            JSONObject jsonObj = JSONObject.fromObject(content);
            VideoSource videoSource = new VideoSource();
            videoSource.setId(jsonObj.getString("identCode"));
            videoSource.setName(jsonObj.getString("name"));
            videoSource.setContent(jsonObj.getString("content"));
            videoSource.setCover(jsonObj.getString("cover"));
            videoSource.setSecretCover(jsonObj.getString("secretCover"));
            videoSource.setSecretCoverText(jsonObj.getString("secretCoverTxt"));
            videoSource.setRatio(jsonObj.getString("ratio"));
            videoSource.setSize(jsonObj.getInt("size"));
            videoSource.setHttpContent(jsonObj.getString("httpContent"));
            videoSource.setDuration(jsonObj.getInt("duration"));
            videoSource.setServerIp(jsonObj.getString("serverIp"));
            videoSource.setXvalue(jsonObj.getString("xvalue"));
            videoSource.setXkey(jsonObj.getString("xkey"));

            return videoSource;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //获取标签
    public static String getTagFromContent(String VideoContent){
        String videoTag = -1 != VideoContent.indexOf("------") ? VideoContent.substring(VideoContent.indexOf("------") + 6 ,VideoContent.length()) :  "";
        return videoTag;
    }
}
