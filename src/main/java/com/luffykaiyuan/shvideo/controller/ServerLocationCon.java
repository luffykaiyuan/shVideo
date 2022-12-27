package com.luffykaiyuan.shvideo.controller;

import com.github.pagehelper.PageInfo;
import com.luffykaiyuan.shvideo.po.ServerLocation;
import com.luffykaiyuan.shvideo.service.ServerLocationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "管理员编辑服务器地址")
public class ServerLocationCon {

    @Autowired
    ServerLocationService serverLocationService;

    @PostMapping("/insertImgServer")
    @ApiOperation(value = "新增图片服务器地址")
    public int insertImgServer(ServerLocation serverLocation) {
        return serverLocationService.insertImgServer(serverLocation);
    }

    @GetMapping("/deleteImgServerById")
    @ApiOperation(value = "删除图片服务器地址")
    public int deleteImgServerById(String serverId) {
        return serverLocationService.deleteImgServerById(serverId);
    }

    @GetMapping("/selectInuseImgServer")
    @ApiOperation(value = "查询所有有效图片服务器地址")
    public PageInfo<ServerLocation> selectInuseImgServer(int pageNum, int pageSize) {
        return serverLocationService.selectInuseImgServer(pageNum, pageSize);
    }

    @GetMapping("/selectAllImgServer")
    @ApiOperation(value = "查询所有图片服务器地址")
    public PageInfo<ServerLocation> selectAllImgServer(int pageNum, int pageSize) {
        return serverLocationService.selectAllImgServer(pageNum, pageSize);
    }

    @PostMapping("/updateImgServer")
    @ApiOperation(value = "修改图片服务器地址")
    public int updateImgServer(ServerLocation serverLocation) {
        return serverLocationService.updateImgServer(serverLocation);
    }

    @PostMapping("/insertVideoServer")
    @ApiOperation(value = "新增视频服务器地址")
    public int insertVideoServer(ServerLocation serverLocation) {
        return serverLocationService.insertVideoServer(serverLocation);
    }

    @GetMapping("/deleteVideoServerById")
    @ApiOperation(value = "删除视频服务器地址")
    public int deleteVideoServerById(String serverId) {
        return serverLocationService.deleteVideoServerById(serverId);
    }

    @GetMapping("/selectInuseVideoServer")
    @ApiOperation(value = "查询所有有效视频服务器地址")
    public PageInfo<ServerLocation> selectInuseVideoServer(int pageNum, int pageSize) {
        return serverLocationService.selectInuseVideoServer(pageNum, pageSize);
    }

    @GetMapping("/selectAllVideoServer")
    @ApiOperation(value = "查询所有视频服务器地址")
    public PageInfo<ServerLocation> selectAllVideoServer(int pageNum, int pageSize) {
        return serverLocationService.selectAllVideoServer(pageNum, pageSize);
    }

    @PostMapping("/updateVideoServer")
    @ApiOperation(value = "修改视频服务器地址")
    public int updateVideoServer(ServerLocation serverLocation) {
        return serverLocationService.updateVideoServer(serverLocation);
    }
}
