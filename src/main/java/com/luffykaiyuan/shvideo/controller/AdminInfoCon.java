package com.luffykaiyuan.shvideo.controller;

import com.luffykaiyuan.shvideo.po.AdminInfo;
import com.luffykaiyuan.shvideo.service.AdminInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminInfoCon {

    @Autowired
    AdminInfoService adminInfoService;

    //0.不存在，1.成功，2.密码错误
    @PostMapping("/adminDoLogin")
    public String adminDoLogin(AdminInfo adminInfo){
        return adminInfoService.adminDoLogin(adminInfo);
    }

    @PostMapping("/addAdmin")
    public int addAdmin(AdminInfo adminInfo){

        return adminInfoService.insertAdminInfo(adminInfo);
    }

    @PostMapping("/updateAdmin")
    public int updateAdmin(AdminInfo adminInfo){
        return adminInfoService.updateAdminInfo(adminInfo);
    }

    @GetMapping("/delAdmin")
    public int delAdmin(String adminId){
        return adminInfoService.delAdmin(adminId);
    }

    @GetMapping("/selectAdminById")
    public AdminInfo selectAdminById(String adminId){
        return adminInfoService.selectAdminById(adminId);
    }

    @GetMapping("/selectAdminByAdminName")
    public AdminInfo selectAdminByAdminName(String adminName){
        return adminInfoService.selectAdminByAdminName(adminName);
    }

    @GetMapping("/selectAllAdmin")
    public List<AdminInfo> selectAllAdmin(){
        return adminInfoService.selectAllAdmin();
    }

    @GetMapping("/selectInuseAdmin")
    public List<AdminInfo> selectInuseAdmin(){
        return adminInfoService.selectInuseAdmin();
    }


}
