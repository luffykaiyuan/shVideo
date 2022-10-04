package com.luffykaiyuan.shvideo.service;

import com.luffykaiyuan.shvideo.dao.AdminInfoMapper;
import com.luffykaiyuan.shvideo.po.AdminInfo;
import com.luffykaiyuan.shvideo.util.GetNowDate;
import com.luffykaiyuan.shvideo.util.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminInfoService implements AdminInfoMapper {

    @Autowired
    AdminInfoMapper adminInfoMapper;

    public String adminDoLogin(AdminInfo adminInfo){
        AdminInfo getAdmin = adminInfoMapper.selectAdminByAdminName(adminInfo.getAdminName());
        if (getAdmin == null){
            return "0";
        }
        if (getAdmin.getPassword().equals(adminInfo.getPassword())){
            return "1";
        }else {
            return "2";
        }
    }

    public int insertAdminInfo(AdminInfo adminInfo){
        adminInfo.setAdminId(UUIDUtils.getUUID(16));
        adminInfo.setAddTime(GetNowDate.getDate());
        return adminInfoMapper.insertAdminInfo(adminInfo);
    }

    public int updateAdminInfo(AdminInfo adminInfo){
        return adminInfoMapper.updateAdminInfo(adminInfo);
    }

    public int delAdmin(String adminId){
        return adminInfoMapper.delAdmin(adminId);
    }

    public AdminInfo selectAdminById(String adminId){
        return adminInfoMapper.selectAdminById(adminId);
    }

    public List<AdminInfo> selectAllAdmin(){
        return adminInfoMapper.selectAllAdmin();
    }

    public AdminInfo selectAdminByAdminName(String adminName){
        return adminInfoMapper.selectAdminByAdminName(adminName);
    }

    public List<AdminInfo> selectInuseAdmin(){
        return adminInfoMapper.selectInuseAdmin();
    }
}
