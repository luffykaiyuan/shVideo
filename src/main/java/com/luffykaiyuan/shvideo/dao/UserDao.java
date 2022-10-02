package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.UserPo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    List<UserPo> get();
}
