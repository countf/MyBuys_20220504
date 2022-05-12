package com.neuedu.dao;

import com.neuedu.entity.GoaGovernmentArea;
import org.apache.ibatis.jdbc.SQL;

public class GoaGovernmentAreaSqlProvider {
    public String insertSelective(GoaGovernmentArea record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("goa_government_area");
        
        if (record.getGoaId() != null) {
            sql.VALUES("GOA_ID", "#{goaId,jdbcType=INTEGER}");
        }
        
        if (record.getZipCode() != null) {
            sql.VALUES("ZIP_CODE", "#{zipCode,jdbcType=VARCHAR}");
        }
        
        if (record.getState() != null) {
            sql.VALUES("STATE", "#{state,jdbcType=VARCHAR}");
        }
        
        if (record.getStateShorthand() != null) {
            sql.VALUES("STATE_SHORTHAND", "#{stateShorthand,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            sql.VALUES("CITY", "#{city,jdbcType=VARCHAR}");
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
        
        if (record.getCallCnt() != null) {
            sql.VALUES("CALL_CNT", "#{callCnt,jdbcType=INTEGER}");
        }
        
        if (record.getLastUpdateDate() != null) {
            sql.VALUES("LAST_UPDATE_DATE", "#{lastUpdateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("REMARK", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getStsCd() != null) {
            sql.VALUES("STS_CD", "#{stsCd,jdbcType=CHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(GoaGovernmentArea record) {
        SQL sql = new SQL();
        sql.UPDATE("goa_government_area");
        
        if (record.getZipCode() != null) {
            sql.SET("ZIP_CODE = #{zipCode,jdbcType=VARCHAR}");
        }
        
        if (record.getState() != null) {
            sql.SET("STATE = #{state,jdbcType=VARCHAR}");
        }
        
        if (record.getStateShorthand() != null) {
            sql.SET("STATE_SHORTHAND = #{stateShorthand,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            sql.SET("CITY = #{city,jdbcType=VARCHAR}");
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
        
        if (record.getCallCnt() != null) {
            sql.SET("CALL_CNT = #{callCnt,jdbcType=INTEGER}");
        }
        
        if (record.getLastUpdateDate() != null) {
            sql.SET("LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("REMARK = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getStsCd() != null) {
            sql.SET("STS_CD = #{stsCd,jdbcType=CHAR}");
        }
        
        sql.WHERE("GOA_ID = #{goaId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}