package com.neuedu.service;

import com.neuedu.entity.SysUser;
import com.neuedu.entity.UllUserLoginLogoutLog;

public interface SysUserService {
    public SysUser login(String uname,String pwd);

    public int upLoginInfo(SysUser sysUser);

    public int logOutLog(UllUserLoginLogoutLog log);

    public int allUpta(SysUser sysUser);
}
