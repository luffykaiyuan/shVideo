package com.luffykaiyuan.shvideo.service.impl;

import com.luffykaiyuan.shvideo.dao.UserDao;
import com.luffykaiyuan.shvideo.po.UserPo;
import com.luffykaiyuan.shvideo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public List<UserPo> get(){
        return userDao.get();
    }
}
