package com.neuedu.service.impl;

import com.neuedu.dao.SysUserMapper;
import com.neuedu.entity.SysUser;
import com.neuedu.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("registerService")
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public void register(SysUser sysUser) {
        sysUserMapper.register(sysUser);
    }
}
