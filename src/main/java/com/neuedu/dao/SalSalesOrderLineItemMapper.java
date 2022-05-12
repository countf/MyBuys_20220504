package com.neuedu.dao;

import com.neuedu.entity.SalSalesOrderLineItem;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface SalSalesOrderLineItemMapper {
    @Delete({
        "delete from sal_sales_order_line_item",
        "where SAL_ID = #{salId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer salId);

    @Insert({
        "insert into sal_sales_order_line_item (SAL_ID, CREATED_BY, ",
        "CREATION_DATE, LAST_UPDATE_BY, ",
        "LAST_UPDATE_DATE, CALL_CNT, ",
        "REMARK, STS_CD, SAO_ID, ",
        "PRO_ID, QTY, PRICE, ",
        "SOL_ID, TRACKING_NO, ",
        "WSP_NAME)",
        "values (#{salId,jdbcType=INTEGER}, #{createdBy,jdbcType=VARCHAR}, ",
        "#{creationDate,jdbcType=TIMESTAMP}, #{lastUpdateBy,jdbcType=VARCHAR}, ",
        "#{lastUpdateDate,jdbcType=TIMESTAMP}, #{callCnt,jdbcType=INTEGER}, ",
        "#{remark,jdbcType=VARCHAR}, #{stsCd,jdbcType=CHAR}, #{saoId,jdbcType=INTEGER}, ",
        "#{proId,jdbcType=INTEGER}, #{qty,jdbcType=INTEGER}, #{price,jdbcType=DECIMAL}, ",
        "#{solId,jdbcType=INTEGER}, #{trackingNo,jdbcType=VARCHAR}, ",
        "#{wspName,jdbcType=VARCHAR})"
    })
    int insert(SalSalesOrderLineItem record);

    @InsertProvider(type=SalSalesOrderLineItemSqlProvider.class, method="insertSelective")
    int insertSelective(SalSalesOrderLineItem record);

    @Select({
        "select",
        "SAL_ID, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, CALL_CNT, ",
        "REMARK, STS_CD, SAO_ID, PRO_ID, QTY, PRICE, SOL_ID, TRACKING_NO, WSP_NAME",
        "from sal_sales_order_line_item",
        "where SAL_ID = #{salId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="SAL_ID", property="salId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATION_DATE", property="creationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_UPDATE_BY", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATE_DATE", property="lastUpdateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALL_CNT", property="callCnt", jdbcType=JdbcType.INTEGER),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.CHAR),
        @Result(column="SAO_ID", property="saoId", jdbcType=JdbcType.INTEGER),
        @Result(column="PRO_ID", property="proId", jdbcType=JdbcType.INTEGER),
        @Result(column="QTY", property="qty", jdbcType=JdbcType.INTEGER),
        @Result(column="PRICE", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="SOL_ID", property="solId", jdbcType=JdbcType.INTEGER),
        @Result(column="TRACKING_NO", property="trackingNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="WSP_NAME", property="wspName", jdbcType=JdbcType.VARCHAR)
    })
    SalSalesOrderLineItem selectByPrimaryKey(Integer salId);

    @UpdateProvider(type=SalSalesOrderLineItemSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SalSalesOrderLineItem record);

    @Update({
        "update sal_sales_order_line_item",
        "set CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR},",
          "SAO_ID = #{saoId,jdbcType=INTEGER},",
          "PRO_ID = #{proId,jdbcType=INTEGER},",
          "QTY = #{qty,jdbcType=INTEGER},",
          "PRICE = #{price,jdbcType=DECIMAL},",
          "SOL_ID = #{solId,jdbcType=INTEGER},",
          "TRACKING_NO = #{trackingNo,jdbcType=VARCHAR},",
          "WSP_NAME = #{wspName,jdbcType=VARCHAR}",
        "where SAL_ID = #{salId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SalSalesOrderLineItem record);
}