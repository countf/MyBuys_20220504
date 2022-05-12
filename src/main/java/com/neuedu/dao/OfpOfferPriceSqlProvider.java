package com.neuedu.dao;

import com.neuedu.entity.OfpOfferPrice;
import org.apache.ibatis.jdbc.SQL;

public class OfpOfferPriceSqlProvider {
    public String insertSelective(OfpOfferPrice record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("ofp_offer_price");
        
        if (record.getOfpId() != null) {
            sql.VALUES("OFP_ID", "#{ofpId,jdbcType=INTEGER}");
        }
        
        if (record.getManId() != null) {
            sql.VALUES("MAN_ID", "#{manId,jdbcType=INTEGER}");
        }
        
        if (record.getEffetiveStartDate() != null) {
            sql.VALUES("EFFETIVE_START_DATE", "#{effetiveStartDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEffectiveEndDate() != null) {
            sql.VALUES("EFFECTIVE_END_DATE", "#{effectiveEndDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getProId() != null) {
            sql.VALUES("PRO_ID", "#{proId,jdbcType=INTEGER}");
        }
        
        if (record.getPrice() != null) {
            sql.VALUES("PRICE", "#{price,jdbcType=DECIMAL}");
        }
        
        if (record.getTypeCd() != null) {
            sql.VALUES("TYPE_CD", "#{typeCd,jdbcType=VARCHAR}");
        }
        
        if (record.getDsrId() != null) {
            sql.VALUES("DSR_ID", "#{dsrId,jdbcType=INTEGER}");
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
        
        if (record.getPeriod() != null) {
            sql.VALUES("PERIOD", "#{period,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(OfpOfferPrice record) {
        SQL sql = new SQL();
        sql.UPDATE("ofp_offer_price");
        
        if (record.getManId() != null) {
            sql.SET("MAN_ID = #{manId,jdbcType=INTEGER}");
        }
        
        if (record.getEffetiveStartDate() != null) {
            sql.SET("EFFETIVE_START_DATE = #{effetiveStartDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEffectiveEndDate() != null) {
            sql.SET("EFFECTIVE_END_DATE = #{effectiveEndDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getProId() != null) {
            sql.SET("PRO_ID = #{proId,jdbcType=INTEGER}");
        }
        
        if (record.getPrice() != null) {
            sql.SET("PRICE = #{price,jdbcType=DECIMAL}");
        }
        
        if (record.getTypeCd() != null) {
            sql.SET("TYPE_CD = #{typeCd,jdbcType=VARCHAR}");
        }
        
        if (record.getDsrId() != null) {
            sql.SET("DSR_ID = #{dsrId,jdbcType=INTEGER}");
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
        
        if (record.getPeriod() != null) {
            sql.SET("PERIOD = #{period,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("OFP_ID = #{ofpId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}