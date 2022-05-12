package com.neuedu.dao;

import com.neuedu.entity.SysUser;
import org.apache.ibatis.jdbc.SQL;

public class SysUserSqlProvider {
    public String insertSelective(SysUser record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sys_user");
        
        if (record.getUserId() != null) {
            sql.VALUES("USER_ID", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            sql.VALUES("USERNAME", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.VALUES("PASSWORD", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("NAME", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getRights() != null) {
            sql.VALUES("RIGHTS", "#{rights,jdbcType=VARCHAR}");
        }
        
        if (record.getRoleId() != null) {
            sql.VALUES("ROLE_ID", "#{roleId,jdbcType=VARCHAR}");
        }
        
        if (record.getLastLogin() != null) {
            sql.VALUES("LAST_LOGIN", "#{lastLogin,jdbcType=VARCHAR}");
        }
        
        if (record.getIp() != null) {
            sql.VALUES("IP", "#{ip,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("STATUS", "#{status,jdbcType=VARCHAR}");
        }
        
        if (record.getBz() != null) {
            sql.VALUES("BZ", "#{bz,jdbcType=VARCHAR}");
        }
        
        if (record.getSkin() != null) {
            sql.VALUES("SKIN", "#{skin,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.VALUES("EMAIL", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getNumber() != null) {
            sql.VALUES("NUMBER", "#{number,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            sql.VALUES("PHONE", "#{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getManBuyerId() != null) {
            sql.VALUES("MAN_BUYER_ID", "#{manBuyerId,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(SysUser record) {
        SQL sql = new SQL();
        sql.UPDATE("sys_user");
        
        if (record.getUsername() != null) {
            sql.SET("USERNAME = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.SET("PASSWORD = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.SET("NAME = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getRights() != null) {
            sql.SET("RIGHTS = #{rights,jdbcType=VARCHAR}");
        }
        
        if (record.getRoleId() != null) {
            sql.SET("ROLE_ID = #{roleId,jdbcType=VARCHAR}");
        }
        
        if (record.getLastLogin() != null) {
            sql.SET("LAST_LOGIN = #{lastLogin,jdbcType=VARCHAR}");
        }
        
        if (record.getIp() != null) {
            sql.SET("IP = #{ip,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("STATUS = #{status,jdbcType=VARCHAR}");
        }
        
        if (record.getBz() != null) {
            sql.SET("BZ = #{bz,jdbcType=VARCHAR}");
        }
        
        if (record.getSkin() != null) {
            sql.SET("SKIN = #{skin,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("EMAIL = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getNumber() != null) {
            sql.SET("NUMBER = #{number,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            sql.SET("PHONE = #{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getManBuyerId() != null) {
            sql.SET("MAN_BUYER_ID = #{manBuyerId,jdbcType=INTEGER}");
        }
        
        sql.WHERE("USER_ID = #{userId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}