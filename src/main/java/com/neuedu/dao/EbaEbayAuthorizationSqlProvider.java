package com.neuedu.dao;

import com.neuedu.entity.EbaEbayAuthorization;
import org.apache.ibatis.jdbc.SQL;

public class EbaEbayAuthorizationSqlProvider {
    public String insertSelective(EbaEbayAuthorization record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("eba_ebay_authorization");
        
        if (record.getEbaId() != null) {
            sql.VALUES("EBA_ID", "#{ebaId,jdbcType=INTEGER}");
        }
        
        if (record.getStrId() != null) {
            sql.VALUES("STR_ID", "#{strId,jdbcType=INTEGER}");
        }
        
        if (record.getAppId() != null) {
            sql.VALUES("APP_ID", "#{appId,jdbcType=VARCHAR}");
        }
        
        if (record.getSecretKey() != null) {
            sql.VALUES("SECRET_KEY", "#{secretKey,jdbcType=VARCHAR}");
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
        
        if (record.getExpDate() != null) {
            sql.VALUES("EXP_DATE", "#{expDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCancleDate() != null) {
            sql.VALUES("CANCLE_DATE", "#{cancleDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAccountId() != null) {
            sql.VALUES("ACCOUNT_ID", "#{accountId,jdbcType=VARCHAR}");
        }
        
        if (record.getToken() != null) {
            sql.VALUES("TOKEN", "#{token,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(EbaEbayAuthorization record) {
        SQL sql = new SQL();
        sql.UPDATE("eba_ebay_authorization");
        
        if (record.getStrId() != null) {
            sql.SET("STR_ID = #{strId,jdbcType=INTEGER}");
        }
        
        if (record.getAppId() != null) {
            sql.SET("APP_ID = #{appId,jdbcType=VARCHAR}");
        }
        
        if (record.getSecretKey() != null) {
            sql.SET("SECRET_KEY = #{secretKey,jdbcType=VARCHAR}");
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
        
        if (record.getExpDate() != null) {
            sql.SET("EXP_DATE = #{expDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCancleDate() != null) {
            sql.SET("CANCLE_DATE = #{cancleDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAccountId() != null) {
            sql.SET("ACCOUNT_ID = #{accountId,jdbcType=VARCHAR}");
        }
        
        if (record.getToken() != null) {
            sql.SET("TOKEN = #{token,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("EBA_ID = #{ebaId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}