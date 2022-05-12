package com.neuedu.dao;

import com.neuedu.entity.DrpDropshipPrice;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface DrpDropshipPriceMapper {
    @Delete({
        "delete from drp_dropship_price",
        "where DRP_ID = #{drpId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer drpId);

    @Insert({
        "insert into drp_dropship_price (DRP_ID, OFP_ID, ",
        "DSR_ID, WAR_ID, CREATED_BY, ",
        "CREATION_DATE, LAST_UPDATE_BY, ",
        "LAST_UPDATE_DATE, CALL_CNT, ",
        "REMARK, STS_CD)",
        "values (#{drpId,jdbcType=INTEGER}, #{ofpId,jdbcType=INTEGER}, ",
        "#{dsrId,jdbcType=INTEGER}, #{warId,jdbcType=INTEGER}, #{createdBy,jdbcType=VARCHAR}, ",
        "#{creationDate,jdbcType=TIMESTAMP}, #{lastUpdateBy,jdbcType=VARCHAR}, ",
        "#{lastUpdateDate,jdbcType=TIMESTAMP}, #{callCnt,jdbcType=INTEGER}, ",
        "#{remark,jdbcType=VARCHAR}, #{stsCd,jdbcType=CHAR})"
    })
    int insert(DrpDropshipPrice record);

    @InsertProvider(type=DrpDropshipPriceSqlProvider.class, method="insertSelective")
    int insertSelective(DrpDropshipPrice record);

    @Select({
        "select",
        "DRP_ID, OFP_ID, DSR_ID, WAR_ID, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, ",
        "CALL_CNT, REMARK, STS_CD",
        "from drp_dropship_price",
        "where DRP_ID = #{drpId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="DRP_ID", property="drpId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="OFP_ID", property="ofpId", jdbcType=JdbcType.INTEGER),
        @Result(column="DSR_ID", property="dsrId", jdbcType=JdbcType.INTEGER),
        @Result(column="WAR_ID", property="warId", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATION_DATE", property="creationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_UPDATE_BY", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATE_DATE", property="lastUpdateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALL_CNT", property="callCnt", jdbcType=JdbcType.INTEGER),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.CHAR)
    })
    DrpDropshipPrice selectByPrimaryKey(Integer drpId);

    @UpdateProvider(type=DrpDropshipPriceSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DrpDropshipPrice record);

    @Update({
        "update drp_dropship_price",
        "set OFP_ID = #{ofpId,jdbcType=INTEGER},",
          "DSR_ID = #{dsrId,jdbcType=INTEGER},",
          "WAR_ID = #{warId,jdbcType=INTEGER},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR}",
        "where DRP_ID = #{drpId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(DrpDropshipPrice record);
}