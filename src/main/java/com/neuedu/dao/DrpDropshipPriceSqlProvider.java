package com.neuedu.dao;

import com.neuedu.entity.DrpDropshipPrice;
import org.apache.ibatis.jdbc.SQL;

public class DrpDropshipPriceSqlProvider {
    public String insertSelective(DrpDropshipPrice record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("drp_dropship_price");
        
        if (record.getDrpId() != null) {
            sql.VALUES("DRP_ID", "#{drpId,jdbcType=INTEGER}");
        }
        
        if (record.getOfpId() != null) {
            sql.VALUES("OFP_ID", "#{ofpId,jdbcType=INTEGER}");
        }
        
        if (record.getDsrId() != null) {
            sql.VALUES("DSR_ID", "#{dsrId,jdbcType=INTEGER}");
        }
        
        if (record.getWarId() != null) {
            sql.VALUES("WAR_ID", "#{warId,jdbcType=INTEGER}");
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

    public String updateByPrimaryKeySelective(DrpDropshipPrice record) {
        SQL sql = new SQL();
        sql.UPDATE("drp_dropship_price");
        
        if (record.getOfpId() != null) {
            sql.SET("OFP_ID = #{ofpId,jdbcType=INTEGER}");
        }
        
        if (record.getDsrId() != null) {
            sql.SET("DSR_ID = #{dsrId,jdbcType=INTEGER}");
        }
        
        if (record.getWarId() != null) {
            sql.SET("WAR_ID = #{warId,jdbcType=INTEGER}");
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
        
        sql.WHERE("DRP_ID = #{drpId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}