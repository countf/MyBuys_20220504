package com.neuedu.service.impl;

import com.neuedu.dao.SysUserMapper;
import com.neuedu.dao.UllUserLoginLogoutLogMapper;
import com.neuedu.entity.SysUser;
import com.neuedu.entity.UllUserLoginLogoutLog;
import com.neuedu.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {

    //声明数据访问对象，并添加自动注入注解
    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private UllUserLoginLogoutLogMapper logoutLogMapper;


    @Override
    public SysUser login(String uname, String pwd) {
        return sysUserMapper.selectByUnameAndPwd(uname,pwd);
    }

    @Override
    public int upLoginInfo(SysUser sysUser) {
        return sysUserMapper.updateLoginInfo(sysUser);
    }

    @Override
    public int logOutLog(UllUserLoginLogoutLog log) {
        return logoutLogMapper.insert(log);
    }

    @Override
    public int allUpta(SysUser sysUser) {
        return sysUserMapper.updateMAN_BUYER_ID(sysUser);
    }

}
