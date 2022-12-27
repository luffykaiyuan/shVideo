package com.luffykaiyuan.shvideo.service.Impl;

import com.github.pagehelper.PageInfo;
import com.luffykaiyuan.shvideo.dao.ServerLocationMapper;
import com.luffykaiyuan.shvideo.po.ServerLocation;
import com.luffykaiyuan.shvideo.service.ServerLocationService;
import com.luffykaiyuan.shvideo.util.GetNowDate;
import com.luffykaiyuan.shvideo.util.ShVideoUtils;
import com.luffykaiyuan.shvideo.util.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ServerLocationServiceImpl implements ServerLocationService {

    @Autowired
    ServerLocationMapper serverLocationMapper;

    public int insertImgServer(ServerLocation serverLocation) {
        serverLocation.setServerId(UUIDUtils.getUUID(16));
        serverLocation.setServerType("2");
        serverLocation.setAddTime(GetNowDate.getDate());
        return serverLocationMapper.insertImgServer(serverLocation);
    }

    public int deleteImgServerById(String serverId) {
        return serverLocationMapper.deleteImgServerById(serverId);
    }

    public PageInfo<ServerLocation> selectInuseImgServer(int pageNum, int pageSize) {
        return ShVideoUtils.doPage(serverLocationMapper.selectInuseImgServer(), pageNum, pageSize);
    }

    public PageInfo<ServerLocation> selectAllImgServer(int pageNum, int pageSize) {
        return ShVideoUtils.doPage(serverLocationMapper.selectAllImgServer(), pageNum, pageSize);
    }

    public int updateImgServer(ServerLocation serverLocation) {
        return serverLocationMapper.updateImgServer(serverLocation);
    }

    public int insertVideoServer(ServerLocation serverLocation) {
        serverLocation.setServerId(UUIDUtils.getUUID(16));
        serverLocation.setServerType("1");
        serverLocation.setAddTime(GetNowDate.getDate());
        return serverLocationMapper.insertVideoServer(serverLocation);
    }

    public int deleteVideoServerById(String serverId) {
        return serverLocationMapper.deleteVideoServerById(serverId);
    }

    public PageInfo<ServerLocation> selectInuseVideoServer(int pageNum, int pageSize) {
        return ShVideoUtils.doPage(serverLocationMapper.selectInuseVideoServer(), pageNum, pageSize);
    }

    public PageInfo<ServerLocation> selectAllVideoServer(int pageNum, int pageSize) {
        return ShVideoUtils.doPage(serverLocationMapper.selectInuseVideoServer(), pageNum, pageSize);
    }

    public int updateVideoServer(ServerLocation serverLocation) {
        return serverLocationMapper.updateVideoServer(serverLocation);
    }
}
