package com.neuedu.dao;

import com.neuedu.entity.GmcpAccount;
import org.apache.ibatis.jdbc.SQL;

public class GmcpAccountSqlProvider {
    public String insertSelective(GmcpAccount record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("gmcp$account");
        
        if (record.getBuyerId() != null) {
            sql.VALUES("buyer_id", "#{buyerId,jdbcType=INTEGER}");
        }
        
        if (record.getAccountName() != null) {
            sql.VALUES("account_name", "#{accountName,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.VALUES("email", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.VALUES("password", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getActiveTime() != null) {
            sql.VALUES("active_time", "#{activeTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIsActive() != null) {
            sql.VALUES("is_active", "#{isActive,jdbcType=CHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=TINYINT}");
        }
        
        if (record.getCreateBy() != null) {
            sql.VALUES("create_by", "#{createBy,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastUpdateBy() != null) {
            sql.VALUES("last_update_by", "#{lastUpdateBy,jdbcType=VARCHAR}");
        }
        
        if (record.getLastUpdateTime() != null) {
            sql.VALUES("last_update_time", "#{lastUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAccountType() != null) {
            sql.VALUES("account_type", "#{accountType,jdbcType=INTEGER}");
        }
        
        if (record.getHoldOrderTime() != null) {
            sql.VALUES("hold_order_time", "#{holdOrderTime,jdbcType=CHAR}");
        }
        
        if (record.getAutoPayStatus() != null) {
            sql.VALUES("auto_pay_status", "#{autoPayStatus,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(GmcpAccount record) {
        SQL sql = new SQL();
        sql.UPDATE("gmcp$account");
        
        if (record.getAccountName() != null) {
            sql.SET("account_name = #{accountName,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("email = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.SET("password = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getActiveTime() != null) {
            sql.SET("active_time = #{activeTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIsActive() != null) {
            sql.SET("is_active = #{isActive,jdbcType=CHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=TINYINT}");
        }
        
        if (record.getCreateBy() != null) {
            sql.SET("create_by = #{createBy,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastUpdateBy() != null) {
            sql.SET("last_update_by = #{lastUpdateBy,jdbcType=VARCHAR}");
        }
        
        if (record.getLastUpdateTime() != null) {
            sql.SET("last_update_time = #{lastUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAccountType() != null) {
            sql.SET("account_type = #{accountType,jdbcType=INTEGER}");
        }
        
        if (record.getHoldOrderTime() != null) {
            sql.SET("hold_order_time = #{holdOrderTime,jdbcType=CHAR}");
        }
        
        if (record.getAutoPayStatus() != null) {
            sql.SET("auto_pay_status = #{autoPayStatus,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("buyer_id = #{buyerId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}