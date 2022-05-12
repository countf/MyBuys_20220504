package com.neuedu.dao;

import com.neuedu.entity.SolStoreOrderLineItem;
import org.apache.ibatis.jdbc.SQL;

public class SolStoreOrderLineItemSqlProvider {
    public String insertSelective(SolStoreOrderLineItem record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sol_store_order_line_item");
        
        if (record.getSolId() != null) {
            sql.VALUES("SOL_ID", "#{solId,jdbcType=INTEGER}");
        }
        
        if (record.getOrderItemId() != null) {
            sql.VALUES("ORDER_ITEM_ID", "#{orderItemId,jdbcType=VARCHAR}");
        }
        
        if (record.getStoId() != null) {
            sql.VALUES("STO_ID", "#{stoId,jdbcType=INTEGER}");
        }
        
        if (record.getSalesPrice() != null) {
            sql.VALUES("SALES_PRICE", "#{salesPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getQty() != null) {
            sql.VALUES("QTY", "#{qty,jdbcType=INTEGER}");
        }
        
        if (record.getSkuNo() != null) {
            sql.VALUES("SKU_NO", "#{skuNo,jdbcType=VARCHAR}");
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
        
        if (record.getBuyerCheckoutMessage() != null) {
            sql.VALUES("BUYER_CHECKOUT_MESSAGE", "#{buyerCheckoutMessage,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(SolStoreOrderLineItem record) {
        SQL sql = new SQL();
        sql.UPDATE("sol_store_order_line_item");
        
        if (record.getOrderItemId() != null) {
            sql.SET("ORDER_ITEM_ID = #{orderItemId,jdbcType=VARCHAR}");
        }
        
        if (record.getStoId() != null) {
            sql.SET("STO_ID = #{stoId,jdbcType=INTEGER}");
        }
        
        if (record.getSalesPrice() != null) {
            sql.SET("SALES_PRICE = #{salesPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getQty() != null) {
            sql.SET("QTY = #{qty,jdbcType=INTEGER}");
        }
        
        if (record.getSkuNo() != null) {
            sql.SET("SKU_NO = #{skuNo,jdbcType=VARCHAR}");
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
        
        if (record.getBuyerCheckoutMessage() != null) {
            sql.SET("BUYER_CHECKOUT_MESSAGE = #{buyerCheckoutMessage,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("SOL_ID = #{solId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}