package com.neuedu.dao;

import com.neuedu.entity.SalSalesOrderLineItem;
import org.apache.ibatis.jdbc.SQL;

public class SalSalesOrderLineItemSqlProvider {
    public String insertSelective(SalSalesOrderLineItem record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sal_sales_order_line_item");
        
        if (record.getSalId() != null) {
            sql.VALUES("SAL_ID", "#{salId,jdbcType=INTEGER}");
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
        
        if (record.getSaoId() != null) {
            sql.VALUES("SAO_ID", "#{saoId,jdbcType=INTEGER}");
        }
        
        if (record.getProId() != null) {
            sql.VALUES("PRO_ID", "#{proId,jdbcType=INTEGER}");
        }
        
        if (record.getQty() != null) {
            sql.VALUES("QTY", "#{qty,jdbcType=INTEGER}");
        }
        
        if (record.getPrice() != null) {
            sql.VALUES("PRICE", "#{price,jdbcType=DECIMAL}");
        }
        
        if (record.getSolId() != null) {
            sql.VALUES("SOL_ID", "#{solId,jdbcType=INTEGER}");
        }
        
        if (record.getTrackingNo() != null) {
            sql.VALUES("TRACKING_NO", "#{trackingNo,jdbcType=VARCHAR}");
        }
        
        if (record.getWspName() != null) {
            sql.VALUES("WSP_NAME", "#{wspName,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(SalSalesOrderLineItem record) {
        SQL sql = new SQL();
        sql.UPDATE("sal_sales_order_line_item");
        
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
        
        if (record.getSaoId() != null) {
            sql.SET("SAO_ID = #{saoId,jdbcType=INTEGER}");
        }
        
        if (record.getProId() != null) {
            sql.SET("PRO_ID = #{proId,jdbcType=INTEGER}");
        }
        
        if (record.getQty() != null) {
            sql.SET("QTY = #{qty,jdbcType=INTEGER}");
        }
        
        if (record.getPrice() != null) {
            sql.SET("PRICE = #{price,jdbcType=DECIMAL}");
        }
        
        if (record.getSolId() != null) {
            sql.SET("SOL_ID = #{solId,jdbcType=INTEGER}");
        }
        
        if (record.getTrackingNo() != null) {
            sql.SET("TRACKING_NO = #{trackingNo,jdbcType=VARCHAR}");
        }
        
        if (record.getWspName() != null) {
            sql.SET("WSP_NAME = #{wspName,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("SAL_ID = #{salId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}