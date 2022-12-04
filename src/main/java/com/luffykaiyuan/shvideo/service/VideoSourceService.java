package com.luffykaiyuan.shvideo.service;

import com.luffykaiyuan.shvideo.dao.VideoSourceMapper;
import com.luffykaiyuan.shvideo.po.VideoSource;
import com.luffykaiyuan.shvideo.util.UUIDUtils;
import com.luffykaiyuan.shvideo.util.VideoUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class VideoSourceService implements VideoSourceMapper {

    @Autowired
    VideoSourceMapper videoSourceMapper;

    @Value("${uploadAddress}")
    private String uploadAddress;

    public List<VideoSource> insertVideoSource(String[] videoAddressList) {
        List<VideoSource> videoSources = new ArrayList<>();
        for (int i = 0; i < videoAddressList.length; i++) {
            VideoSource videoSource = VideoUtils.uploadVideo(videoAddressList[i]);
            videoSource.setHttpContent(VideoUtils.getFullVideoURL(videoSource.getHttpContent()));
            videoSourceMapper.insertVideoSource(videoSource);
            videoSources.add(videoSource);
        }
        return videoSources;
    }

    //上传文件  MultipartFile
    public String uploadFile(MultipartFile file) {
        //获取文件的内容
        try {
            InputStream is = file.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //获取原始文件名
        String originalFilename = file.getOriginalFilename();
        System.out.println(originalFilename);
        //生成一个uuid名称出来
        String uuidFilename = UUIDUtils.getUUID(16);
        File newFile = new File(uploadAddress, uuidFilename);
        //将文件输出到目标的文件中
        try {
            file.transferTo(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //返回上传路径
        return uploadAddress + uuidFilename;
    }



    public int insert(VideoSource record) {
        return 0;
    }

    public int insertVideoSource(VideoSource videoSource) {
        return 0;
    }

    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    public int insertSelective(VideoSource record) {
        return 0;
    }

    public VideoSource selectByPrimaryKey(String id) {
        return null;
    }

    public int updateByPrimaryKeySelective(VideoSource record) {
        return 0;
    }

    public int updateByPrimaryKeyWithBLOBs(VideoSource record) {
        return 0;
    }

    public int updateByPrimaryKey(VideoSource record) {
        return 0;
    }
}
