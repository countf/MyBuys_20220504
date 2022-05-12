package com.neuedu.dao;

import com.neuedu.entity.StoStoreOrder;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface StoStoreOrderMapper {
    @Delete({
        "delete from sto_store_order",
        "where STO_ID = #{stoId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer stoId);

    @Insert({
        "insert into sto_store_order (STO_ID, STR_ID, ",
        "ORDER_ID, ORDER_CREATED_TIME, ",
        "PAID_TIME, LAST_MODIFIED_TIME, ",
        "CREATED_BY, CREATION_DATE, ",
        "LAST_UPDATE_BY, LAST_UPDATE_DATE, ",
        "CALL_CNT, REMARK, ",
        "STS_CD, PLATEFORM_TYPE, ",
        "CANCEL_COMPLETE_DATE)",
        "values (#{stoId,jdbcType=INTEGER}, #{strId,jdbcType=INTEGER}, ",
        "#{orderId,jdbcType=VARCHAR}, #{orderCreatedTime,jdbcType=VARCHAR}, ",
        "#{paidTime,jdbcType=VARCHAR}, #{lastModifiedTime,jdbcType=VARCHAR}, ",
        "#{createdBy,jdbcType=VARCHAR}, #{creationDate,jdbcType=TIMESTAMP}, ",
        "#{lastUpdateBy,jdbcType=VARCHAR}, #{lastUpdateDate,jdbcType=TIMESTAMP}, ",
        "#{callCnt,jdbcType=INTEGER}, #{remark,jdbcType=VARCHAR}, ",
        "#{stsCd,jdbcType=CHAR}, #{plateformType,jdbcType=VARCHAR}, ",
        "#{cancelCompleteDate,jdbcType=VARCHAR})"
    })
    int insert(StoStoreOrder record);

    @InsertProvider(type=StoStoreOrderSqlProvider.class, method="insertSelective")
    int insertSelective(StoStoreOrder record);

    @Select({
        "select",
        "STO_ID, STR_ID, ORDER_ID, ORDER_CREATED_TIME, PAID_TIME, LAST_MODIFIED_TIME, ",
        "CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, CALL_CNT, REMARK, ",
        "STS_CD, PLATEFORM_TYPE, CANCEL_COMPLETE_DATE",
        "from sto_store_order",
        "where STO_ID = #{stoId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="STO_ID", property="stoId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="STR_ID", property="strId", jdbcType=JdbcType.INTEGER),
        @Result(column="ORDER_ID", property="orderId", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORDER_CREATED_TIME", property="orderCreatedTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="PAID_TIME", property="paidTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_MODIFIED_TIME", property="lastModifiedTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATION_DATE", property="creationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_UPDATE_BY", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATE_DATE", property="lastUpdateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALL_CNT", property="callCnt", jdbcType=JdbcType.INTEGER),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.CHAR),
        @Result(column="PLATEFORM_TYPE", property="plateformType", jdbcType=JdbcType.VARCHAR),
        @Result(column="CANCEL_COMPLETE_DATE", property="cancelCompleteDate", jdbcType=JdbcType.VARCHAR)
    })
    StoStoreOrder selectByPrimaryKey(Integer stoId);

    @UpdateProvider(type=StoStoreOrderSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(StoStoreOrder record);

    @Update({
        "update sto_store_order",
        "set STR_ID = #{strId,jdbcType=INTEGER},",
          "ORDER_ID = #{orderId,jdbcType=VARCHAR},",
          "ORDER_CREATED_TIME = #{orderCreatedTime,jdbcType=VARCHAR},",
          "PAID_TIME = #{paidTime,jdbcType=VARCHAR},",
          "LAST_MODIFIED_TIME = #{lastModifiedTime,jdbcType=VARCHAR},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR},",
          "PLATEFORM_TYPE = #{plateformType,jdbcType=VARCHAR},",
          "CANCEL_COMPLETE_DATE = #{cancelCompleteDate,jdbcType=VARCHAR}",
        "where STO_ID = #{stoId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(StoStoreOrder record);
}