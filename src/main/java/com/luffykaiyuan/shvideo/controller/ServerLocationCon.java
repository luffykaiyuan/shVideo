package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.po.ServerLocation;
import com.luffykaiyuan.shvideo.service.ServerLocationService;
import com.luffykaiyuan.shvideo.util.GetNowDate;
import com.luffykaiyuan.shvideo.util.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServerLocationCon {

    @Autowired
    ServerLocationService serverLocationService;

    @PostMapping("/insertImgServer")
    public int insertImgServer(ServerLocation serverLocation) {
        return serverLocationService.insertImgServer(serverLocation);
    }

    @GetMapping("/deleteImgServerById")
    public int deleteImgServerById(String serverId) {
        return serverLocationService.deleteImgServerById(serverId);
    }

    @GetMapping("/selectInuseImgServer")
    public List<ServerLocation> selectInuseImgServer() {
        return serverLocationService.selectInuseImgServer();
    }

    @GetMapping("/selectAllImgServer")
    public List<ServerLocation> selectAllImgServer() {
        return serverLocationService.selectAllImgServer();
    }

    @PostMapping("/updateImgServer")
    public int updateImgServer(ServerLocation serverLocation) {
        return serverLocationService.updateImgServer(serverLocation);
    }

    @PostMapping("/insertVideoServer")
    public int insertVideoServer(ServerLocation serverLocation) {
        return serverLocationService.insertVideoServer(serverLocation);
    }

    @GetMapping("/deleteVideoServerById")
    public int deleteVideoServerById(String serverId) {
        return serverLocationService.deleteVideoServerById(serverId);
    }

    @GetMapping("/selectInuseVideoServer")
    public List<ServerLocation> selectInuseVideoServer() {
        return serverLocationService.selectInuseVideoServer();
    }

    @GetMapping("/selectAllVideoServer")
    public List<ServerLocation> selectAllVideoServer() {
        return serverLocationService.selectAllVideoServer();
    }

    @PostMapping("/updateVideoServer")
    public int updateVideoServer(ServerLocation serverLocation) {
        return serverLocationService.updateVideoServer(serverLocation);
    }
}
