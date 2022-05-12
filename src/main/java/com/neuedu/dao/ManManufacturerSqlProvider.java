package com.neuedu.dao;

import com.neuedu.entity.ManManufacturer;
import org.apache.ibatis.jdbc.SQL;

public class ManManufacturerSqlProvider {
    public String insertSelective(ManManufacturer record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("man_manufacturer");
        
        if (record.getManId() != null) {
            sql.VALUES("MAN_ID", "#{manId,jdbcType=INTEGER}");
        }
        
        if (record.getNameEn() != null) {
            sql.VALUES("NAME_EN", "#{nameEn,jdbcType=VARCHAR}");
        }
        
        if (record.getNameCn() != null) {
            sql.VALUES("NAME_CN", "#{nameCn,jdbcType=VARCHAR}");
        }
        
        if (record.getGmcReportType() != null) {
            sql.VALUES("GMC_REPORT_TYPE", "#{gmcReportType,jdbcType=VARCHAR}");
        }
        
        if (record.getGmcReportUrl() != null) {
            sql.VALUES("GMC_REPORT_URL", "#{gmcReportUrl,jdbcType=VARCHAR}");
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

    public String updateByPrimaryKeySelective(ManManufacturer record) {
        SQL sql = new SQL();
        sql.UPDATE("man_manufacturer");
        
        if (record.getNameEn() != null) {
            sql.SET("NAME_EN = #{nameEn,jdbcType=VARCHAR}");
        }
        
        if (record.getNameCn() != null) {
            sql.SET("NAME_CN = #{nameCn,jdbcType=VARCHAR}");
        }
        
        if (record.getGmcReportType() != null) {
            sql.SET("GMC_REPORT_TYPE = #{gmcReportType,jdbcType=VARCHAR}");
        }
        
        if (record.getGmcReportUrl() != null) {
            sql.SET("GMC_REPORT_URL = #{gmcReportUrl,jdbcType=VARCHAR}");
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
        
        sql.WHERE("MAN_ID = #{manId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}