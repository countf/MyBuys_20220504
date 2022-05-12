package com.neuedu.service.impl;

import com.neuedu.dao.SysUserMapper;
import com.neuedu.entity.SysUser;
import com.neuedu.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {

    //声明数据访问对象，并添加自动注入注解
    @Autowired
    private SysUserMapper sysUserMapper;


    @Override
    public SysUser login(String uname, String pwd) {
        return sysUserMapper.selectByUnameAndPwd(uname,pwd);
    }

}
