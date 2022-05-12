package com.neuedu.dao;

import com.neuedu.entity.SolStoreOrderLineItem;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface SolStoreOrderLineItemMapper {
    @Delete({
        "delete from sol_store_order_line_item",
        "where SOL_ID = #{solId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer solId);

    @Insert({
        "insert into sol_store_order_line_item (SOL_ID, ORDER_ITEM_ID, ",
        "STO_ID, SALES_PRICE, ",
        "QTY, SKU_NO, CREATED_BY, ",
        "CREATION_DATE, LAST_UPDATE_BY, ",
        "LAST_UPDATE_DATE, CALL_CNT, ",
        "REMARK, STS_CD, BUYER_CHECKOUT_MESSAGE)",
        "values (#{solId,jdbcType=INTEGER}, #{orderItemId,jdbcType=VARCHAR}, ",
        "#{stoId,jdbcType=INTEGER}, #{salesPrice,jdbcType=DECIMAL}, ",
        "#{qty,jdbcType=INTEGER}, #{skuNo,jdbcType=VARCHAR}, #{createdBy,jdbcType=VARCHAR}, ",
        "#{creationDate,jdbcType=TIMESTAMP}, #{lastUpdateBy,jdbcType=VARCHAR}, ",
        "#{lastUpdateDate,jdbcType=TIMESTAMP}, #{callCnt,jdbcType=INTEGER}, ",
        "#{remark,jdbcType=VARCHAR}, #{stsCd,jdbcType=CHAR}, #{buyerCheckoutMessage,jdbcType=LONGVARCHAR})"
    })
    int insert(SolStoreOrderLineItem record);

    @InsertProvider(type=SolStoreOrderLineItemSqlProvider.class, method="insertSelective")
    int insertSelective(SolStoreOrderLineItem record);

    @Select({
        "select",
        "SOL_ID, ORDER_ITEM_ID, STO_ID, SALES_PRICE, QTY, SKU_NO, CREATED_BY, CREATION_DATE, ",
        "LAST_UPDATE_BY, LAST_UPDATE_DATE, CALL_CNT, REMARK, STS_CD, BUYER_CHECKOUT_MESSAGE",
        "from sol_store_order_line_item",
        "where SOL_ID = #{solId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="SOL_ID", property="solId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ORDER_ITEM_ID", property="orderItemId", jdbcType=JdbcType.VARCHAR),
        @Result(column="STO_ID", property="stoId", jdbcType=JdbcType.INTEGER),
        @Result(column="SALES_PRICE", property="salesPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="QTY", property="qty", jdbcType=JdbcType.INTEGER),
        @Result(column="SKU_NO", property="skuNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATION_DATE", property="creationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_UPDATE_BY", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATE_DATE", property="lastUpdateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALL_CNT", property="callCnt", jdbcType=JdbcType.INTEGER),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.CHAR),
        @Result(column="BUYER_CHECKOUT_MESSAGE", property="buyerCheckoutMessage", jdbcType=JdbcType.LONGVARCHAR)
    })
    SolStoreOrderLineItem selectByPrimaryKey(Integer solId);

    @UpdateProvider(type=SolStoreOrderLineItemSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SolStoreOrderLineItem record);

    @Update({
        "update sol_store_order_line_item",
        "set ORDER_ITEM_ID = #{orderItemId,jdbcType=VARCHAR},",
          "STO_ID = #{stoId,jdbcType=INTEGER},",
          "SALES_PRICE = #{salesPrice,jdbcType=DECIMAL},",
          "QTY = #{qty,jdbcType=INTEGER},",
          "SKU_NO = #{skuNo,jdbcType=VARCHAR},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR},",
          "BUYER_CHECKOUT_MESSAGE = #{buyerCheckoutMessage,jdbcType=LONGVARCHAR}",
        "where SOL_ID = #{solId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(SolStoreOrderLineItem record);

    @Update({
        "update sol_store_order_line_item",
        "set ORDER_ITEM_ID = #{orderItemId,jdbcType=VARCHAR},",
          "STO_ID = #{stoId,jdbcType=INTEGER},",
          "SALES_PRICE = #{salesPrice,jdbcType=DECIMAL},",
          "QTY = #{qty,jdbcType=INTEGER},",
          "SKU_NO = #{skuNo,jdbcType=VARCHAR},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR}",
        "where SOL_ID = #{solId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SolStoreOrderLineItem record);
}