package com.luffykaiyuan.shvideo.service;

import com.luffykaiyuan.shvideo.dao.ServerLocationMapper;
import com.luffykaiyuan.shvideo.po.ServerLocation;
import com.luffykaiyuan.shvideo.util.GetNowDate;
import com.luffykaiyuan.shvideo.util.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServerLocationService implements ServerLocationMapper {

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

    public List<ServerLocation> selectInuseImgServer() {
        return serverLocationMapper.selectInuseImgServer();
    }

    public List<ServerLocation> selectAllImgServer() {
        return serverLocationMapper.selectAllImgServer();
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

    public List<ServerLocation> selectInuseVideoServer() {
        return serverLocationMapper.selectInuseVideoServer();
    }

    public List<ServerLocation> selectAllVideoServer() {
        return serverLocationMapper.selectAllVideoServer();
    }

    public int updateVideoServer(ServerLocation serverLocation) {
        return serverLocationMapper.updateVideoServer(serverLocation);
    }
}
