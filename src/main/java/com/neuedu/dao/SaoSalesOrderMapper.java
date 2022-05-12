package com.neuedu.dao;

import com.neuedu.entity.SaoSalesOrder;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface SaoSalesOrderMapper {
    @Delete({
        "delete from sao_sales_order",
        "where SAO_ID = #{saoId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer saoId);

    @Insert({
        "insert into sao_sales_order (SAO_ID, CREATED_BY, ",
        "CREATION_DATE, LAST_UPDATE_BY, ",
        "LAST_UPDATE_DATE, CALL_CNT, ",
        "REMARK, STS_CD, MAN_ID, ",
        "WAR_ID, SYNC_DATE, ",
        "PAYMENT_DATE, PUSH_DATE, ",
        "TRACK_NO_DATE, FULFILLMENT_DATE, ",
        "SETTLEMENT_DATE, PRODUCT_AMOUNT, ",
        "FREIGHT_COST, HANDLING_FEE, ",
        "CUSTOMER_REMARK, ORDER_NO, ",
        "ORDER_STS, REFUND_STS, ",
        "DELIVERY_STS, STO_ID, ",
        "LAST_FREIGHT_COST, CANCLE_TIME, ",
        "AUTO_PAY_STATUS, AUTO_PAY_TIME, ",
        "BUYER_CHECKOUT_MESSAGE)",
        "values (#{saoId,jdbcType=INTEGER}, #{createdBy,jdbcType=VARCHAR}, ",
        "#{creationDate,jdbcType=TIMESTAMP}, #{lastUpdateBy,jdbcType=VARCHAR}, ",
        "#{lastUpdateDate,jdbcType=TIMESTAMP}, #{callCnt,jdbcType=INTEGER}, ",
        "#{remark,jdbcType=VARCHAR}, #{stsCd,jdbcType=CHAR}, #{manId,jdbcType=INTEGER}, ",
        "#{warId,jdbcType=INTEGER}, #{syncDate,jdbcType=TIMESTAMP}, ",
        "#{paymentDate,jdbcType=TIMESTAMP}, #{pushDate,jdbcType=TIMESTAMP}, ",
        "#{trackNoDate,jdbcType=TIMESTAMP}, #{fulfillmentDate,jdbcType=TIMESTAMP}, ",
        "#{settlementDate,jdbcType=TIMESTAMP}, #{productAmount,jdbcType=DECIMAL}, ",
        "#{freightCost,jdbcType=DECIMAL}, #{handlingFee,jdbcType=DECIMAL}, ",
        "#{customerRemark,jdbcType=VARCHAR}, #{orderNo,jdbcType=VARCHAR}, ",
        "#{orderSts,jdbcType=VARCHAR}, #{refundSts,jdbcType=VARCHAR}, ",
        "#{deliverySts,jdbcType=VARCHAR}, #{stoId,jdbcType=INTEGER}, ",
        "#{lastFreightCost,jdbcType=DECIMAL}, #{cancleTime,jdbcType=TIMESTAMP}, ",
        "#{autoPayStatus,jdbcType=CHAR}, #{autoPayTime,jdbcType=VARCHAR}, ",
        "#{buyerCheckoutMessage,jdbcType=LONGVARCHAR})"
    })
    int insert(SaoSalesOrder record);

    @InsertProvider(type=SaoSalesOrderSqlProvider.class, method="insertSelective")
    int insertSelective(SaoSalesOrder record);

    @Select({
        "select",
        "SAO_ID, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, CALL_CNT, ",
        "REMARK, STS_CD, MAN_ID, WAR_ID, SYNC_DATE, PAYMENT_DATE, PUSH_DATE, TRACK_NO_DATE, ",
        "FULFILLMENT_DATE, SETTLEMENT_DATE, PRODUCT_AMOUNT, FREIGHT_COST, HANDLING_FEE, ",
        "CUSTOMER_REMARK, ORDER_NO, ORDER_STS, REFUND_STS, DELIVERY_STS, STO_ID, LAST_FREIGHT_COST, ",
        "CANCLE_TIME, AUTO_PAY_STATUS, AUTO_PAY_TIME, BUYER_CHECKOUT_MESSAGE",
        "from sao_sales_order",
        "where SAO_ID = #{saoId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="SAO_ID", property="saoId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATION_DATE", property="creationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_UPDATE_BY", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATE_DATE", property="lastUpdateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALL_CNT", property="callCnt", jdbcType=JdbcType.INTEGER),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.CHAR),
        @Result(column="MAN_ID", property="manId", jdbcType=JdbcType.INTEGER),
        @Result(column="WAR_ID", property="warId", jdbcType=JdbcType.INTEGER),
        @Result(column="SYNC_DATE", property="syncDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="PAYMENT_DATE", property="paymentDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="PUSH_DATE", property="pushDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="TRACK_NO_DATE", property="trackNoDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="FULFILLMENT_DATE", property="fulfillmentDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SETTLEMENT_DATE", property="settlementDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="PRODUCT_AMOUNT", property="productAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="FREIGHT_COST", property="freightCost", jdbcType=JdbcType.DECIMAL),
        @Result(column="HANDLING_FEE", property="handlingFee", jdbcType=JdbcType.DECIMAL),
        @Result(column="CUSTOMER_REMARK", property="customerRemark", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORDER_NO", property="orderNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORDER_STS", property="orderSts", jdbcType=JdbcType.VARCHAR),
        @Result(column="REFUND_STS", property="refundSts", jdbcType=JdbcType.VARCHAR),
        @Result(column="DELIVERY_STS", property="deliverySts", jdbcType=JdbcType.VARCHAR),
        @Result(column="STO_ID", property="stoId", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_FREIGHT_COST", property="lastFreightCost", jdbcType=JdbcType.DECIMAL),
        @Result(column="CANCLE_TIME", property="cancleTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="AUTO_PAY_STATUS", property="autoPayStatus", jdbcType=JdbcType.CHAR),
        @Result(column="AUTO_PAY_TIME", property="autoPayTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="BUYER_CHECKOUT_MESSAGE", property="buyerCheckoutMessage", jdbcType=JdbcType.LONGVARCHAR)
    })
    SaoSalesOrder selectByPrimaryKey(Integer saoId);

    @UpdateProvider(type=SaoSalesOrderSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SaoSalesOrder record);

    @Update({
        "update sao_sales_order",
        "set CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR},",
          "MAN_ID = #{manId,jdbcType=INTEGER},",
          "WAR_ID = #{warId,jdbcType=INTEGER},",
          "SYNC_DATE = #{syncDate,jdbcType=TIMESTAMP},",
          "PAYMENT_DATE = #{paymentDate,jdbcType=TIMESTAMP},",
          "PUSH_DATE = #{pushDate,jdbcType=TIMESTAMP},",
          "TRACK_NO_DATE = #{trackNoDate,jdbcType=TIMESTAMP},",
          "FULFILLMENT_DATE = #{fulfillmentDate,jdbcType=TIMESTAMP},",
          "SETTLEMENT_DATE = #{settlementDate,jdbcType=TIMESTAMP},",
          "PRODUCT_AMOUNT = #{productAmount,jdbcType=DECIMAL},",
          "FREIGHT_COST = #{freightCost,jdbcType=DECIMAL},",
          "HANDLING_FEE = #{handlingFee,jdbcType=DECIMAL},",
          "CUSTOMER_REMARK = #{customerRemark,jdbcType=VARCHAR},",
          "ORDER_NO = #{orderNo,jdbcType=VARCHAR},",
          "ORDER_STS = #{orderSts,jdbcType=VARCHAR},",
          "REFUND_STS = #{refundSts,jdbcType=VARCHAR},",
          "DELIVERY_STS = #{deliverySts,jdbcType=VARCHAR},",
          "STO_ID = #{stoId,jdbcType=INTEGER},",
          "LAST_FREIGHT_COST = #{lastFreightCost,jdbcType=DECIMAL},",
          "CANCLE_TIME = #{cancleTime,jdbcType=TIMESTAMP},",
          "AUTO_PAY_STATUS = #{autoPayStatus,jdbcType=CHAR},",
          "AUTO_PAY_TIME = #{autoPayTime,jdbcType=VARCHAR},",
          "BUYER_CHECKOUT_MESSAGE = #{buyerCheckoutMessage,jdbcType=LONGVARCHAR}",
        "where SAO_ID = #{saoId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(SaoSalesOrder record);

    @Update({
        "update sao_sales_order",
        "set CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR},",
          "MAN_ID = #{manId,jdbcType=INTEGER},",
          "WAR_ID = #{warId,jdbcType=INTEGER},",
          "SYNC_DATE = #{syncDate,jdbcType=TIMESTAMP},",
          "PAYMENT_DATE = #{paymentDate,jdbcType=TIMESTAMP},",
          "PUSH_DATE = #{pushDate,jdbcType=TIMESTAMP},",
          "TRACK_NO_DATE = #{trackNoDate,jdbcType=TIMESTAMP},",
          "FULFILLMENT_DATE = #{fulfillmentDate,jdbcType=TIMESTAMP},",
          "SETTLEMENT_DATE = #{settlementDate,jdbcType=TIMESTAMP},",
          "PRODUCT_AMOUNT = #{productAmount,jdbcType=DECIMAL},",
          "FREIGHT_COST = #{freightCost,jdbcType=DECIMAL},",
          "HANDLING_FEE = #{handlingFee,jdbcType=DECIMAL},",
          "CUSTOMER_REMARK = #{customerRemark,jdbcType=VARCHAR},",
          "ORDER_NO = #{orderNo,jdbcType=VARCHAR},",
          "ORDER_STS = #{orderSts,jdbcType=VARCHAR},",
          "REFUND_STS = #{refundSts,jdbcType=VARCHAR},",
          "DELIVERY_STS = #{deliverySts,jdbcType=VARCHAR},",
          "STO_ID = #{stoId,jdbcType=INTEGER},",
          "LAST_FREIGHT_COST = #{lastFreightCost,jdbcType=DECIMAL},",
          "CANCLE_TIME = #{cancleTime,jdbcType=TIMESTAMP},",
          "AUTO_PAY_STATUS = #{autoPayStatus,jdbcType=CHAR},",
          "AUTO_PAY_TIME = #{autoPayTime,jdbcType=VARCHAR}",
        "where SAO_ID = #{saoId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SaoSalesOrder record);
}