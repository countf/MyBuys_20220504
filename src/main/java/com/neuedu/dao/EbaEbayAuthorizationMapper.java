package com.neuedu.dao;

import com.neuedu.entity.EbaEbayAuthorization;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface EbaEbayAuthorizationMapper {
    @Delete({
        "delete from eba_ebay_authorization",
        "where EBA_ID = #{ebaId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer ebaId);

    @Insert({
        "insert into eba_ebay_authorization (EBA_ID, STR_ID, ",
        "APP_ID, SECRET_KEY, ",
        "CREATED_BY, CREATION_DATE, ",
        "LAST_UPDATE_BY, LAST_UPDATE_DATE, ",
        "CALL_CNT, REMARK, ",
        "STS_CD, EXP_DATE, CANCLE_DATE, ",
        "ACCOUNT_ID, TOKEN)",
        "values (#{ebaId,jdbcType=INTEGER}, #{strId,jdbcType=INTEGER}, ",
        "#{appId,jdbcType=VARCHAR}, #{secretKey,jdbcType=VARCHAR}, ",
        "#{createdBy,jdbcType=VARCHAR}, #{creationDate,jdbcType=TIMESTAMP}, ",
        "#{lastUpdateBy,jdbcType=VARCHAR}, #{lastUpdateDate,jdbcType=TIMESTAMP}, ",
        "#{callCnt,jdbcType=INTEGER}, #{remark,jdbcType=VARCHAR}, ",
        "#{stsCd,jdbcType=CHAR}, #{expDate,jdbcType=TIMESTAMP}, #{cancleDate,jdbcType=TIMESTAMP}, ",
        "#{accountId,jdbcType=VARCHAR}, #{token,jdbcType=LONGVARCHAR})"
    })
    int insert(EbaEbayAuthorization record);

    @InsertProvider(type=EbaEbayAuthorizationSqlProvider.class, method="insertSelective")
    int insertSelective(EbaEbayAuthorization record);

    @Select({
        "select",
        "EBA_ID, STR_ID, APP_ID, SECRET_KEY, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, ",
        "LAST_UPDATE_DATE, CALL_CNT, REMARK, STS_CD, EXP_DATE, CANCLE_DATE, ACCOUNT_ID, ",
        "TOKEN",
        "from eba_ebay_authorization",
        "where EBA_ID = #{ebaId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="EBA_ID", property="ebaId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="STR_ID", property="strId", jdbcType=JdbcType.INTEGER),
        @Result(column="APP_ID", property="appId", jdbcType=JdbcType.VARCHAR),
        @Result(column="SECRET_KEY", property="secretKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATION_DATE", property="creationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_UPDATE_BY", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATE_DATE", property="lastUpdateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALL_CNT", property="callCnt", jdbcType=JdbcType.INTEGER),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.CHAR),
        @Result(column="EXP_DATE", property="expDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CANCLE_DATE", property="cancleDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ACCOUNT_ID", property="accountId", jdbcType=JdbcType.VARCHAR),
        @Result(column="TOKEN", property="token", jdbcType=JdbcType.LONGVARCHAR)
    })
    EbaEbayAuthorization selectByPrimaryKey(Integer ebaId);

    @UpdateProvider(type=EbaEbayAuthorizationSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(EbaEbayAuthorization record);

    @Update({
        "update eba_ebay_authorization",
        "set STR_ID = #{strId,jdbcType=INTEGER},",
          "APP_ID = #{appId,jdbcType=VARCHAR},",
          "SECRET_KEY = #{secretKey,jdbcType=VARCHAR},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR},",
          "EXP_DATE = #{expDate,jdbcType=TIMESTAMP},",
          "CANCLE_DATE = #{cancleDate,jdbcType=TIMESTAMP},",
          "ACCOUNT_ID = #{accountId,jdbcType=VARCHAR},",
          "TOKEN = #{token,jdbcType=LONGVARCHAR}",
        "where EBA_ID = #{ebaId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(EbaEbayAuthorization record);

    @Update({
        "update eba_ebay_authorization",
        "set STR_ID = #{strId,jdbcType=INTEGER},",
          "APP_ID = #{appId,jdbcType=VARCHAR},",
          "SECRET_KEY = #{secretKey,jdbcType=VARCHAR},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR},",
          "EXP_DATE = #{expDate,jdbcType=TIMESTAMP},",
          "CANCLE_DATE = #{cancleDate,jdbcType=TIMESTAMP},",
          "ACCOUNT_ID = #{accountId,jdbcType=VARCHAR}",
        "where EBA_ID = #{ebaId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(EbaEbayAuthorization record);
}