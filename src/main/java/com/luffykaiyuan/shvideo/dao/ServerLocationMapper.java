package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.ServerLocation;

public interface ServerLocationMapper {
    int deleteByPrimaryKey(String serverId);

    int insert(ServerLocation record);

    int insertSelective(ServerLocation record);

    ServerLocation selectByPrimaryKey(String serverId);

    int updateByPrimaryKeySelective(ServerLocation record);

    int updateByPrimaryKey(ServerLocation record);
}