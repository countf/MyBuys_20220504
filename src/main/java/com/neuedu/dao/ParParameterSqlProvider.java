package com.neuedu.dao;

import com.neuedu.entity.ParParameter;
import org.apache.ibatis.jdbc.SQL;

public class ParParameterSqlProvider {
    public String insertSelective(ParParameter record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("par_parameter");
        
        if (record.getParId() != null) {
            sql.VALUES("PAR_ID", "#{parId,jdbcType=INTEGER}");
        }
        
        if (record.getParamCd() != null) {
            sql.VALUES("PARAM_CD", "#{paramCd,jdbcType=VARCHAR}");
        }
        
        if (record.getParamValue() != null) {
            sql.VALUES("PARAM_VALUE", "#{paramValue,jdbcType=VARCHAR}");
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
        
        if (record.getDescription() != null) {
            sql.VALUES("DESCRIPTION", "#{description,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(ParParameter record) {
        SQL sql = new SQL();
        sql.UPDATE("par_parameter");
        
        if (record.getParamCd() != null) {
            sql.SET("PARAM_CD = #{paramCd,jdbcType=VARCHAR}");
        }
        
        if (record.getParamValue() != null) {
            sql.SET("PARAM_VALUE = #{paramValue,jdbcType=VARCHAR}");
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
        
        if (record.getDescription() != null) {
            sql.SET("DESCRIPTION = #{description,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("PAR_ID = #{parId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}