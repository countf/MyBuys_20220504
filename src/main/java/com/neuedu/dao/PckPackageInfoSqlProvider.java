package com.neuedu.dao;

import com.neuedu.entity.PckPackageInfo;
import org.apache.ibatis.jdbc.SQL;

public class PckPackageInfoSqlProvider {
    public String insertSelective(PckPackageInfo record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("pck_package_info");
        
        if (record.getPckId() != null) {
            sql.VALUES("PCK_ID", "#{pckId,jdbcType=INTEGER}");
        }
        
        if (record.getWarId() != null) {
            sql.VALUES("WAR_ID", "#{warId,jdbcType=INTEGER}");
        }
        
        if (record.getProId() != null) {
            sql.VALUES("PRO_ID", "#{proId,jdbcType=INTEGER}");
        }
        
        if (record.getTypeCd() != null) {
            sql.VALUES("TYPE_CD", "#{typeCd,jdbcType=CHAR}");
        }
        
        if (record.getWidth() != null) {
            sql.VALUES("WIDTH", "#{width,jdbcType=DECIMAL}");
        }
        
        if (record.getHeight() != null) {
            sql.VALUES("HEIGHT", "#{height,jdbcType=DECIMAL}");
        }
        
        if (record.getLength() != null) {
            sql.VALUES("LENGTH", "#{length,jdbcType=DECIMAL}");
        }
        
        if (record.getWeight() != null) {
            sql.VALUES("WEIGHT", "#{weight,jdbcType=DECIMAL}");
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
        
        if (record.getHeavyCargo() != null) {
            sql.VALUES("HEAVY_CARGO", "#{heavyCargo,jdbcType=VARCHAR}");
        }
        
        if (record.getLogisticsCompany() != null) {
            sql.VALUES("LOGISTICS_COMPANY", "#{logisticsCompany,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(PckPackageInfo record) {
        SQL sql = new SQL();
        sql.UPDATE("pck_package_info");
        
        if (record.getWarId() != null) {
            sql.SET("WAR_ID = #{warId,jdbcType=INTEGER}");
        }
        
        if (record.getProId() != null) {
            sql.SET("PRO_ID = #{proId,jdbcType=INTEGER}");
        }
        
        if (record.getTypeCd() != null) {
            sql.SET("TYPE_CD = #{typeCd,jdbcType=CHAR}");
        }
        
        if (record.getWidth() != null) {
            sql.SET("WIDTH = #{width,jdbcType=DECIMAL}");
        }
        
        if (record.getHeight() != null) {
            sql.SET("HEIGHT = #{height,jdbcType=DECIMAL}");
        }
        
        if (record.getLength() != null) {
            sql.SET("LENGTH = #{length,jdbcType=DECIMAL}");
        }
        
        if (record.getWeight() != null) {
            sql.SET("WEIGHT = #{weight,jdbcType=DECIMAL}");
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
        
        if (record.getHeavyCargo() != null) {
            sql.SET("HEAVY_CARGO = #{heavyCargo,jdbcType=VARCHAR}");
        }
        
        if (record.getLogisticsCompany() != null) {
            sql.SET("LOGISTICS_COMPANY = #{logisticsCompany,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("PCK_ID = #{pckId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}