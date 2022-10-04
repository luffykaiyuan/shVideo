package com.luffykaiyuan.shvideo.dao;

import com.luffykaiyuan.shvideo.po.AdminInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminInfoMapper {

    int insertAdminInfo(AdminInfo adminInfo);

    int updateAdminInfo(AdminInfo adminInfo);

    int delAdmin(String adminId);

    AdminInfo selectAdminById(String adminId);

    List<AdminInfo> selectAllAdmin();

    AdminInfo selectAdminByAdminName(String adminName);

    List<AdminInfo> selectInuseAdmin();

}