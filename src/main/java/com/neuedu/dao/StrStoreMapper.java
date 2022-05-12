package com.neuedu.dao;

import com.neuedu.entity.StrStore;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface StrStoreMapper {
    @Delete({
        "delete from str_store",
        "where STR_ID = #{strId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer strId);

    @Insert({
        "insert into str_store (STR_ID, DSR_ID, ",
        "PLATAEFORM_TYPE, STORE_NAME, ",
        "STORE_STS_CD, CREATED_BY, ",
        "CREATION_DATE, LAST_UPDATE_BY, ",
        "LAST_UPDATE_DATE, CALL_CNT, ",
        "STS_CD, REMARK)",
        "values (#{strId,jdbcType=INTEGER}, #{dsrId,jdbcType=INTEGER}, ",
        "#{plataeformType,jdbcType=VARCHAR}, #{storeName,jdbcType=VARCHAR}, ",
        "#{storeStsCd,jdbcType=VARCHAR}, #{createdBy,jdbcType=VARCHAR}, ",
        "#{creationDate,jdbcType=TIMESTAMP}, #{lastUpdateBy,jdbcType=VARCHAR}, ",
        "#{lastUpdateDate,jdbcType=TIMESTAMP}, #{callCnt,jdbcType=INTEGER}, ",
        "#{stsCd,jdbcType=CHAR}, #{remark,jdbcType=VARCHAR})"
    })
    int insert(StrStore record);

    @InsertProvider(type=StrStoreSqlProvider.class, method="insertSelective")
    int insertSelective(StrStore record);

    @Select({
        "select",
        "STR_ID, DSR_ID, PLATAEFORM_TYPE, STORE_NAME, STORE_STS_CD, CREATED_BY, CREATION_DATE, ",
        "LAST_UPDATE_BY, LAST_UPDATE_DATE, CALL_CNT, STS_CD, REMARK",
        "from str_store",
        "where STR_ID = #{strId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="STR_ID", property="strId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DSR_ID", property="dsrId", jdbcType=JdbcType.INTEGER),
        @Result(column="PLATAEFORM_TYPE", property="plataeformType", jdbcType=JdbcType.VARCHAR),
        @Result(column="STORE_NAME", property="storeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="STORE_STS_CD", property="storeStsCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATION_DATE", property="creationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_UPDATE_BY", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATE_DATE", property="lastUpdateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALL_CNT", property="callCnt", jdbcType=JdbcType.INTEGER),
        @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.CHAR),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    StrStore selectByPrimaryKey(Integer strId);

    @UpdateProvider(type=StrStoreSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(StrStore record);

    @Update({
        "update str_store",
        "set DSR_ID = #{dsrId,jdbcType=INTEGER},",
          "PLATAEFORM_TYPE = #{plataeformType,jdbcType=VARCHAR},",
          "STORE_NAME = #{storeName,jdbcType=VARCHAR},",
          "STORE_STS_CD = #{storeStsCd,jdbcType=VARCHAR},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "STS_CD = #{stsCd,jdbcType=CHAR},",
          "REMARK = #{remark,jdbcType=VARCHAR}",
        "where STR_ID = #{strId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(StrStore record);
}