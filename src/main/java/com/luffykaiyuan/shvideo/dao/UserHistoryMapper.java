package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.UserHistory;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface UserHistoryMapper {

    int insertHistory(UserHistory userHistory);

    void deleteOutTimeHistory(Date endTime);

    List<UserHistory> selectByUsername(String username);

    int updateHistory(UserHistory userHistory);
}