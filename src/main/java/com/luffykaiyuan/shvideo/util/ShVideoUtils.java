package com.luffykaiyuan.shvideo.util;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luffykaiyuan.shvideo.po.VideoInfo;

import java.util.List;

public class ShVideoUtils {

    public static boolean checkInviteNum(){
        return true;
    }

    public static PageInfo doPage(List list, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }
}
