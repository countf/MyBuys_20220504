package com.neuedu.dao;

import com.neuedu.entity.SdiStoreDropshipItem;
import org.apache.ibatis.jdbc.SQL;

public class SdiStoreDropshipItemSqlProvider {
    public String insertSelective(SdiStoreDropshipItem record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sdi_store_dropship_item");
        
        if (record.getDilId() != null) {
            sql.VALUES("DIL_ID", "#{dilId,jdbcType=INTEGER}");
        }
        
        if (record.getProId() != null) {
            sql.VALUES("PRO_ID", "#{proId,jdbcType=INTEGER}");
        }
        
        if (record.getStrId() != null) {
            sql.VALUES("STR_ID", "#{strId,jdbcType=INTEGER}");
        }
        
        if (record.getStoreRetention() != null) {
            sql.VALUES("STORE_RETENTION", "#{storeRetention,jdbcType=INTEGER}");
        }
        
        if (record.getDropshipPrice() != null) {
            sql.VALUES("DROPSHIP_PRICE", "#{dropshipPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getDropshipStatus() != null) {
            sql.VALUES("DROPSHIP_STATUS", "#{dropshipStatus,jdbcType=VARCHAR}");
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
        
        if (record.getShelfStock() != null) {
            sql.VALUES("SHELF_STOCK", "#{shelfStock,jdbcType=INTEGER}");
        }
        
        if (record.getPreferDate() != null) {
            sql.VALUES("PREFER_DATE", "#{preferDate,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(SdiStoreDropshipItem record) {
        SQL sql = new SQL();
        sql.UPDATE("sdi_store_dropship_item");
        
        if (record.getProId() != null) {
            sql.SET("PRO_ID = #{proId,jdbcType=INTEGER}");
        }
        
        if (record.getStrId() != null) {
            sql.SET("STR_ID = #{strId,jdbcType=INTEGER}");
        }
        
        if (record.getStoreRetention() != null) {
            sql.SET("STORE_RETENTION = #{storeRetention,jdbcType=INTEGER}");
        }
        
        if (record.getDropshipPrice() != null) {
            sql.SET("DROPSHIP_PRICE = #{dropshipPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getDropshipStatus() != null) {
            sql.SET("DROPSHIP_STATUS = #{dropshipStatus,jdbcType=VARCHAR}");
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
        
        if (record.getShelfStock() != null) {
            sql.SET("SHELF_STOCK = #{shelfStock,jdbcType=INTEGER}");
        }
        
        if (record.getPreferDate() != null) {
            sql.SET("PREFER_DATE = #{preferDate,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("DIL_ID = #{dilId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}