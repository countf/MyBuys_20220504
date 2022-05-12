package com.neuedu.dao;

import com.neuedu.entity.StoStoreOrder;
import org.apache.ibatis.jdbc.SQL;

public class StoStoreOrderSqlProvider {
    public String insertSelective(StoStoreOrder record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sto_store_order");
        
        if (record.getStoId() != null) {
            sql.VALUES("STO_ID", "#{stoId,jdbcType=INTEGER}");
        }
        
        if (record.getStrId() != null) {
            sql.VALUES("STR_ID", "#{strId,jdbcType=INTEGER}");
        }
        
        if (record.getOrderId() != null) {
            sql.VALUES("ORDER_ID", "#{orderId,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderCreatedTime() != null) {
            sql.VALUES("ORDER_CREATED_TIME", "#{orderCreatedTime,jdbcType=VARCHAR}");
        }
        
        if (record.getPaidTime() != null) {
            sql.VALUES("PAID_TIME", "#{paidTime,jdbcType=VARCHAR}");
        }
        
        if (record.getLastModifiedTime() != null) {
            sql.VALUES("LAST_MODIFIED_TIME", "#{lastModifiedTime,jdbcType=VARCHAR}");
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
        
        if (record.getPlateformType() != null) {
            sql.VALUES("PLATEFORM_TYPE", "#{plateformType,jdbcType=VARCHAR}");
        }
        
        if (record.getCancelCompleteDate() != null) {
            sql.VALUES("CANCEL_COMPLETE_DATE", "#{cancelCompleteDate,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(StoStoreOrder record) {
        SQL sql = new SQL();
        sql.UPDATE("sto_store_order");
        
        if (record.getStrId() != null) {
            sql.SET("STR_ID = #{strId,jdbcType=INTEGER}");
        }
        
        if (record.getOrderId() != null) {
            sql.SET("ORDER_ID = #{orderId,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderCreatedTime() != null) {
            sql.SET("ORDER_CREATED_TIME = #{orderCreatedTime,jdbcType=VARCHAR}");
        }
        
        if (record.getPaidTime() != null) {
            sql.SET("PAID_TIME = #{paidTime,jdbcType=VARCHAR}");
        }
        
        if (record.getLastModifiedTime() != null) {
            sql.SET("LAST_MODIFIED_TIME = #{lastModifiedTime,jdbcType=VARCHAR}");
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
        
        if (record.getPlateformType() != null) {
            sql.SET("PLATEFORM_TYPE = #{plateformType,jdbcType=VARCHAR}");
        }
        
        if (record.getCancelCompleteDate() != null) {
            sql.SET("CANCEL_COMPLETE_DATE = #{cancelCompleteDate,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("STO_ID = #{stoId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}