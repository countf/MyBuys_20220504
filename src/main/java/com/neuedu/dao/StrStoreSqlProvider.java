package com.neuedu.dao;

import com.neuedu.entity.StrStore;
import org.apache.ibatis.jdbc.SQL;

public class StrStoreSqlProvider {
    public String insertSelective(StrStore record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("str_store");
        
        if (record.getStrId() != null) {
            sql.VALUES("STR_ID", "#{strId,jdbcType=INTEGER}");
        }
        
        if (record.getDsrId() != null) {
            sql.VALUES("DSR_ID", "#{dsrId,jdbcType=INTEGER}");
        }
        
        if (record.getPlataeformType() != null) {
            sql.VALUES("PLATAEFORM_TYPE", "#{plataeformType,jdbcType=VARCHAR}");
        }
        
        if (record.getStoreName() != null) {
            sql.VALUES("STORE_NAME", "#{storeName,jdbcType=VARCHAR}");
        }
        
        if (record.getStoreStsCd() != null) {
            sql.VALUES("STORE_STS_CD", "#{storeStsCd,jdbcType=VARCHAR}");
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
        
        if (record.getStsCd() != null) {
            sql.VALUES("STS_CD", "#{stsCd,jdbcType=CHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("REMARK", "#{remark,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(StrStore record) {
        SQL sql = new SQL();
        sql.UPDATE("str_store");
        
        if (record.getDsrId() != null) {
            sql.SET("DSR_ID = #{dsrId,jdbcType=INTEGER}");
        }
        
        if (record.getPlataeformType() != null) {
            sql.SET("PLATAEFORM_TYPE = #{plataeformType,jdbcType=VARCHAR}");
        }
        
        if (record.getStoreName() != null) {
            sql.SET("STORE_NAME = #{storeName,jdbcType=VARCHAR}");
        }
        
        if (record.getStoreStsCd() != null) {
            sql.SET("STORE_STS_CD = #{storeStsCd,jdbcType=VARCHAR}");
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
        
        if (record.getStsCd() != null) {
            sql.SET("STS_CD = #{stsCd,jdbcType=CHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("REMARK = #{remark,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("STR_ID = #{strId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}