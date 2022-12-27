package com.luffykaiyuan.shvideo.service;

import com.github.pagehelper.PageInfo;
import com.luffykaiyuan.shvideo.dao.ServerLocationMapper;
import com.luffykaiyuan.shvideo.po.ServerLocation;
import com.luffykaiyuan.shvideo.util.GetNowDate;
import com.luffykaiyuan.shvideo.util.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ServerLocationService{

    int insertImgServer(ServerLocation serverLocation);

    int deleteImgServerById(String serverId);

    PageInfo<ServerLocation> selectInuseImgServer(int pageNum, int pageSize);

    PageInfo<ServerLocation> selectAllImgServer(int pageNum, int pageSize);

    int updateImgServer(ServerLocation serverLocation);

    int insertVideoServer(ServerLocation serverLocation);

    int deleteVideoServerById(String serverId);

    PageInfo<ServerLocation> selectInuseVideoServer(int pageNum, int pageSize);

    PageInfo<ServerLocation> selectAllVideoServer(int pageNum, int pageSize);

    int updateVideoServer(ServerLocation serverLocation);
}
