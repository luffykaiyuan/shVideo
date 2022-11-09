package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.dao.VideoSourceMapper;
import com.luffykaiyuan.shvideo.po.VideoInfo;
import com.luffykaiyuan.shvideo.po.VideoSource;
import com.luffykaiyuan.shvideo.service.VideoInfoService;
import com.luffykaiyuan.shvideo.util.QRCodeUtils;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.cache.RedisCache;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class Hello {

    @Autowired
    VideoSourceMapper videoSourceMapper;

    @Autowired
    VideoInfoService videoInfoService;

    @GetMapping("/hello")
    public BufferedImage hello() throws ParseException {
//        测试时间查询
//        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        String input ="2022-10-21 18:00:00";
//        Date beginTime = ft.parse(input);
//        String out ="2022-11-21 18:00:00";
//        Date endTime = ft.parse(out);
//        List<VideoInfo> l = videoInfoService.selectVideoByTime(beginTime, endTime);
//        for (int i = 0; i < l.size(); i++) {
//            System.out.println(l.get(i).getVideoName());
//        }

//        测试二维码生成
//        File file = new File("C:/codes");
//        QRCodeUtils.createCodeToFile("www.baidu.com",file,"1.png");

//        测试解析txt
//        try {
//            String path = "C:\\Users\\Luffykaiyuan\\Desktop\\com.bean.BusinessMov_40004.txt";
//            File file = new File(path);
//            InputStreamReader isr = new InputStreamReader(new FileInputStream(file),"utf-8");
//            BufferedReader br = new BufferedReader(isr);
//            String content = br.readLine() ;
//            br.close();
//            isr.close();
//
//            JSONObject jsonObj = JSONObject.fromObject(content);
//            VideoSource videoSource = new VideoSource();
//            videoSource.setId(jsonObj.getString("identCode"));
//            videoSource.setName(jsonObj.getString("name"));
//            videoSource.setContent(jsonObj.getString("content"));
//            videoSource.setCover(jsonObj.getString("cover"));
//            videoSource.setSecretCover(jsonObj.getString("secretCover"));
//            videoSource.setSecretCoverText(jsonObj.getString("secretCoverTxt"));
//            videoSource.setRatio(jsonObj.getString("ratio"));
//            videoSource.setSize(jsonObj.getInt("size"));
//            videoSource.setHttpContent(jsonObj.getString("httpContent"));
//            videoSource.setDuration(jsonObj.getInt("duration"));
//            videoSource.setServerIp(jsonObj.getString("serverIp"));
//            videoSource.setXvalue(jsonObj.getString("xvalue"));
//            videoSource.setXkey(jsonObj.getString("xkey"));
//
//            videoSourceMapper.insert(videoSource);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        return null;
    }


}
