package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.ServerLocation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ServerLocationMapper {

    int insertImgServer(ServerLocation serverLocation);

    int deleteImgServerById(String serverId);

    List<ServerLocation> selectInuseImgServer();

    List<ServerLocation> selectAllImgServer();

    int updateImgServer(ServerLocation serverLocation);

    int insertVideoServer(ServerLocation serverLocation);

    int deleteVideoServerById(String serverId);

    List<ServerLocation> selectInuseVideoServer();

    List<ServerLocation> selectAllVideoServer();

    int updateVideoServer(ServerLocation serverLocation);

}