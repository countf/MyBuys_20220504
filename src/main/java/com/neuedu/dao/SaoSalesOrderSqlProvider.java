package com.neuedu.dao;

import com.neuedu.entity.SaoSalesOrder;
import org.apache.ibatis.jdbc.SQL;

public class SaoSalesOrderSqlProvider {
    public String insertSelective(SaoSalesOrder record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sao_sales_order");
        
        if (record.getSaoId() != null) {
            sql.VALUES("SAO_ID", "#{saoId,jdbcType=INTEGER}");
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
        
        if (record.getManId() != null) {
            sql.VALUES("MAN_ID", "#{manId,jdbcType=INTEGER}");
        }
        
        if (record.getWarId() != null) {
            sql.VALUES("WAR_ID", "#{warId,jdbcType=INTEGER}");
        }
        
        if (record.getSyncDate() != null) {
            sql.VALUES("SYNC_DATE", "#{syncDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPaymentDate() != null) {
            sql.VALUES("PAYMENT_DATE", "#{paymentDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPushDate() != null) {
            sql.VALUES("PUSH_DATE", "#{pushDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTrackNoDate() != null) {
            sql.VALUES("TRACK_NO_DATE", "#{trackNoDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFulfillmentDate() != null) {
            sql.VALUES("FULFILLMENT_DATE", "#{fulfillmentDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSettlementDate() != null) {
            sql.VALUES("SETTLEMENT_DATE", "#{settlementDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getProductAmount() != null) {
            sql.VALUES("PRODUCT_AMOUNT", "#{productAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getFreightCost() != null) {
            sql.VALUES("FREIGHT_COST", "#{freightCost,jdbcType=DECIMAL}");
        }
        
        if (record.getHandlingFee() != null) {
            sql.VALUES("HANDLING_FEE", "#{handlingFee,jdbcType=DECIMAL}");
        }
        
        if (record.getCustomerRemark() != null) {
            sql.VALUES("CUSTOMER_REMARK", "#{customerRemark,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderNo() != null) {
            sql.VALUES("ORDER_NO", "#{orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderSts() != null) {
            sql.VALUES("ORDER_STS", "#{orderSts,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundSts() != null) {
            sql.VALUES("REFUND_STS", "#{refundSts,jdbcType=VARCHAR}");
        }
        
        if (record.getDeliverySts() != null) {
            sql.VALUES("DELIVERY_STS", "#{deliverySts,jdbcType=VARCHAR}");
        }
        
        if (record.getStoId() != null) {
            sql.VALUES("STO_ID", "#{stoId,jdbcType=INTEGER}");
        }
        
        if (record.getLastFreightCost() != null) {
            sql.VALUES("LAST_FREIGHT_COST", "#{lastFreightCost,jdbcType=DECIMAL}");
        }
        
        if (record.getCancleTime() != null) {
            sql.VALUES("CANCLE_TIME", "#{cancleTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAutoPayStatus() != null) {
            sql.VALUES("AUTO_PAY_STATUS", "#{autoPayStatus,jdbcType=CHAR}");
        }
        
        if (record.getAutoPayTime() != null) {
            sql.VALUES("AUTO_PAY_TIME", "#{autoPayTime,jdbcType=VARCHAR}");
        }
        
        if (record.getBuyerCheckoutMessage() != null) {
            sql.VALUES("BUYER_CHECKOUT_MESSAGE", "#{buyerCheckoutMessage,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(SaoSalesOrder record) {
        SQL sql = new SQL();
        sql.UPDATE("sao_sales_order");
        
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
        
        if (record.getManId() != null) {
            sql.SET("MAN_ID = #{manId,jdbcType=INTEGER}");
        }
        
        if (record.getWarId() != null) {
            sql.SET("WAR_ID = #{warId,jdbcType=INTEGER}");
        }
        
        if (record.getSyncDate() != null) {
            sql.SET("SYNC_DATE = #{syncDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPaymentDate() != null) {
            sql.SET("PAYMENT_DATE = #{paymentDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPushDate() != null) {
            sql.SET("PUSH_DATE = #{pushDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTrackNoDate() != null) {
            sql.SET("TRACK_NO_DATE = #{trackNoDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFulfillmentDate() != null) {
            sql.SET("FULFILLMENT_DATE = #{fulfillmentDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSettlementDate() != null) {
            sql.SET("SETTLEMENT_DATE = #{settlementDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getProductAmount() != null) {
            sql.SET("PRODUCT_AMOUNT = #{productAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getFreightCost() != null) {
            sql.SET("FREIGHT_COST = #{freightCost,jdbcType=DECIMAL}");
        }
        
        if (record.getHandlingFee() != null) {
            sql.SET("HANDLING_FEE = #{handlingFee,jdbcType=DECIMAL}");
        }
        
        if (record.getCustomerRemark() != null) {
            sql.SET("CUSTOMER_REMARK = #{customerRemark,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderNo() != null) {
            sql.SET("ORDER_NO = #{orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderSts() != null) {
            sql.SET("ORDER_STS = #{orderSts,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundSts() != null) {
            sql.SET("REFUND_STS = #{refundSts,jdbcType=VARCHAR}");
        }
        
        if (record.getDeliverySts() != null) {
            sql.SET("DELIVERY_STS = #{deliverySts,jdbcType=VARCHAR}");
        }
        
        if (record.getStoId() != null) {
            sql.SET("STO_ID = #{stoId,jdbcType=INTEGER}");
        }
        
        if (record.getLastFreightCost() != null) {
            sql.SET("LAST_FREIGHT_COST = #{lastFreightCost,jdbcType=DECIMAL}");
        }
        
        if (record.getCancleTime() != null) {
            sql.SET("CANCLE_TIME = #{cancleTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAutoPayStatus() != null) {
            sql.SET("AUTO_PAY_STATUS = #{autoPayStatus,jdbcType=CHAR}");
        }
        
        if (record.getAutoPayTime() != null) {
            sql.SET("AUTO_PAY_TIME = #{autoPayTime,jdbcType=VARCHAR}");
        }
        
        if (record.getBuyerCheckoutMessage() != null) {
            sql.SET("BUYER_CHECKOUT_MESSAGE = #{buyerCheckoutMessage,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("SAO_ID = #{saoId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}