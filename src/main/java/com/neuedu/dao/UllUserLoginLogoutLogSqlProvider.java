package com.neuedu.dao;

import com.neuedu.entity.UllUserLoginLogoutLog;
import org.apache.ibatis.jdbc.SQL;

public class UllUserLoginLogoutLogSqlProvider {
    public String insertSelective(UllUserLoginLogoutLog record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("ull_user_login_logout_log");
        
        if (record.getUllId() != null) {
            sql.VALUES("ULL_ID", "#{ullId,jdbcType=INTEGER}");
        }
        
        if (record.getUsiId() != null) {
            sql.VALUES("USI_ID", "#{usiId,jdbcType=VARCHAR}");
        }
        
        if (record.getToken() != null) {
            sql.VALUES("TOKEN", "#{token,jdbcType=VARCHAR}");
        }
        
        if (record.getTerminalType() != null) {
            sql.VALUES("TERMINAL_TYPE", "#{terminalType,jdbcType=VARCHAR}");
        }
        
        if (record.getOperatingType() != null) {
            sql.VALUES("OPERATING_TYPE", "#{operatingType,jdbcType=VARCHAR}");
        }
        
        if (record.getOperatingDate() != null) {
            sql.VALUES("OPERATING_DATE", "#{operatingDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedBy() != null) {
            sql.VALUES("CREATED_BY", "#{createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getCreationDate() != null) {
            sql.VALUES("CREATION_DATE", "#{creationDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastUpdateBy() != null) {
            sql.VALUES("LAST_UPDATE_BY", "#{lastUpdateBy,jdbcType=VARCHAR}");
        }
        
        if (record.getLastUpdateDate() != null) {
            sql.VALUES("LAST_UPDATE_DATE", "#{lastUpdateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCallCnt() != null) {
            sql.VALUES("CALL_CNT", "#{callCnt,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("REMARK", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getStsCd() != null) {
            sql.VALUES("STS_CD", "#{stsCd,jdbcType=CHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(UllUserLoginLogoutLog record) {
        SQL sql = new SQL();
        sql.UPDATE("ull_user_login_logout_log");
        
        if (record.getUsiId() != null) {
            sql.SET("USI_ID = #{usiId,jdbcType=VARCHAR}");
        }
        
        if (record.getToken() != null) {
            sql.SET("TOKEN = #{token,jdbcType=VARCHAR}");
        }
        
        if (record.getTerminalType() != null) {
            sql.SET("TERMINAL_TYPE = #{terminalType,jdbcType=VARCHAR}");
        }
        
        if (record.getOperatingType() != null) {
            sql.SET("OPERATING_TYPE = #{operatingType,jdbcType=VARCHAR}");
        }
        
        if (record.getOperatingDate() != null) {
            sql.SET("OPERATING_DATE = #{operatingDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedBy() != null) {
            sql.SET("CREATED_BY = #{createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getCreationDate() != null) {
            sql.SET("CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastUpdateBy() != null) {
            sql.SET("LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR}");
        }
        
        if (record.getLastUpdateDate() != null) {
            sql.SET("LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCallCnt() != null) {
            sql.SET("CALL_CNT = #{callCnt,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("REMARK = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getStsCd() != null) {
            sql.SET("STS_CD = #{stsCd,jdbcType=CHAR}");
        }
        
        sql.WHERE("ULL_ID = #{ullId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}