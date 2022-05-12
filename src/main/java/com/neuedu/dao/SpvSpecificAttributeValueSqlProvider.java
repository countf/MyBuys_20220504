package com.neuedu.dao;

import com.neuedu.entity.SpvSpecificAttributeValue;
import org.apache.ibatis.jdbc.SQL;

public class SpvSpecificAttributeValueSqlProvider {
    public String insertSelective(SpvSpecificAttributeValue record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("spv_specific_attribute_value");
        
        if (record.getSpvId() != null) {
            sql.VALUES("SPV_ID", "#{spvId,jdbcType=INTEGER}");
        }
        
        if (record.getSpaId() != null) {
            sql.VALUES("SPA_ID", "#{spaId,jdbcType=INTEGER}");
        }
        
        if (record.getNameEn() != null) {
            sql.VALUES("NAME_EN", "#{nameEn,jdbcType=VARCHAR}");
        }
        
        if (record.getNameCn() != null) {
            sql.VALUES("NAME_CN", "#{nameCn,jdbcType=VARCHAR}");
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

    public String updateByPrimaryKeySelective(SpvSpecificAttributeValue record) {
        SQL sql = new SQL();
        sql.UPDATE("spv_specific_attribute_value");
        
        if (record.getSpaId() != null) {
            sql.SET("SPA_ID = #{spaId,jdbcType=INTEGER}");
        }
        
        if (record.getNameEn() != null) {
            sql.SET("NAME_EN = #{nameEn,jdbcType=VARCHAR}");
        }
        
        if (record.getNameCn() != null) {
            sql.SET("NAME_CN = #{nameCn,jdbcType=VARCHAR}");
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
        
        sql.WHERE("SPV_ID = #{spvId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}