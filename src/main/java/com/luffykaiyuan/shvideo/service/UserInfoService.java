package com.luffykaiyuan.shvideo.service;

import com.luffykaiyuan.shvideo.dao.UserInfoMapper;
import com.luffykaiyuan.shvideo.po.UserInfo;
import com.luffykaiyuan.shvideo.util.GetNowDate;
import com.luffykaiyuan.shvideo.util.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService implements UserInfoMapper {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Autowired
    UserInviteService userInviteService;

    public int insertUser(UserInfo userInfo) {
        userInfo.setUserId(UUIDUtils.getUUID(16));
        userInfo.setAddTime(GetNowDate.getDate());
        userInfo.setInviteCode(userInfo.getUsername());
        if (null != userInfo.getInviteCode()){
            userInviteService.addInviteNum(userInfo.getInviteUsername());
//            UserInvite userInvite = userInviteService.selectUserInvite(userInfo.getInviteUsername());
            UserInfo inviteInfo = userInfoMapper.selectUserByName(userInfo.getInviteUsername());
            inviteInfo.setInviteNum(inviteInfo.getInviteNum() + 1);
            if (inviteInfo.getInviteNum() < 3){
                if (inviteInfo.getInviteNum() == 1){
                    inviteInfo.setLookNum(5);
                    inviteInfo.setRankId("vip1");
                    inviteInfo.setOrginRank("vip1");
                }else if (inviteInfo.getInviteNum() == 2){
                    inviteInfo.setLookNum(7);
                    inviteInfo.setRankId("vip2");
                    inviteInfo.setOrginRank("vip2");
                }else {
                    inviteInfo.setLookNum(9);
                    inviteInfo.setRankId("vip3");
                    inviteInfo.setOrginRank("vip3");
                }
            }
            userInfoMapper.updateUser(inviteInfo);

        }
        userInviteService.insertUserInvite(userInfo.getUsername());
        return userInfoMapper.insertUser(userInfo);
    }

    public boolean doLogin(UserInfo userInfo){
        UserInfo orginUserInfo = userInfoMapper.selectUserByName(userInfo.getUsername());
        if (userInfo.equals(orginUserInfo.getPassword())){
            return true;
        }
        return false;
    }

    public int updateUser(UserInfo userInfo) {
        return userInfoMapper.updateUser(userInfo);
    }

    public int updateList(List<UserInfo> userInfoList) {
        return userInfoMapper.updateList(userInfoList);
    }

    public int deleteUser(String userId) {
        return userInfoMapper.deleteUser(userId);
    }

    public UserInfo selectUserById(String userId) {
        return userInfoMapper.selectUserById(userId);
    }

    public UserInfo selectUserByName(String username) {
        return userInfoMapper.selectUserByName(username);
    }

    public List<UserInfo> selectAllUser() {
        return userInfoMapper.selectAllUser();
    }

    public List<UserInfo> selectInuseUser() {
        return userInfoMapper.selectInuseUser();
    }

    public List<UserInfo> selectUserByTime(String beginTme, String endTime) {
        return userInfoMapper.selectUserByTime(beginTme, endTime);
    }

    public List<UserInfo> selectUserByRank(String rankId) {
        return userInfoMapper.selectUserByRank(rankId);
    }

    public List<UserInfo> selectUserByCard(String cardType) {
        return userInfoMapper.selectUserByCard(cardType);
    }

    public List<UserInfo> selectVipUser(){
        return userInfoMapper.selectVipUser();
    }
}
