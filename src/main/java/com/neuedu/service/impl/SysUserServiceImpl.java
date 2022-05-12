package com.neuedu.service.impl;

import com.neuedu.dao.SysUserMapper;
import com.neuedu.entity.SysUser;
import com.neuedu.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {

    //�������ݷ��ʶ��󣬲�����Զ�ע��ע��
    @Autowired
    private SysUserMapper sysUserMapper;


    @Override
    public SysUser login(String uname, String pwd) {
        return sysUserMapper.selectByUnameAndPwd(uname,pwd);
    }

}
