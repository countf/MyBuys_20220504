package com.neuedu.dao;

import com.neuedu.entity.UllUserLoginLogoutLog;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface UllUserLoginLogoutLogMapper {
    @Delete({
        "delete from ull_user_login_logout_log",
        "where ULL_ID = #{ullId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer ullId);

    @Insert({
        "insert into ull_user_login_logout_log (ULL_ID, USI_ID, ",
        "TOKEN, TERMINAL_TYPE, ",
        "OPERATING_TYPE, OPERATING_DATE, ",
        "CREATED_BY, CREATION_DATE, ",
        "LAST_UPDATE_BY, LAST_UPDATE_DATE, ",
        "CALL_CNT, REMARK, ",
        "STS_CD)",
        "values (#{ullId,jdbcType=INTEGER}, #{usiId,jdbcType=VARCHAR}, ",
        "#{token,jdbcType=VARCHAR}, #{terminalType,jdbcType=VARCHAR}, ",
        "#{operatingType,jdbcType=VARCHAR}, #{operatingDate,jdbcType=TIMESTAMP}, ",
        "#{createdBy,jdbcType=VARCHAR}, #{creationDate,jdbcType=TIMESTAMP}, ",
        "#{lastUpdateBy,jdbcType=VARCHAR}, #{lastUpdateDate,jdbcType=TIMESTAMP}, ",
        "#{callCnt,jdbcType=INTEGER}, #{remark,jdbcType=VARCHAR}, ",
        "#{stsCd,jdbcType=CHAR})"
    })
    int insert(UllUserLoginLogoutLog record);

    @InsertProvider(type=UllUserLoginLogoutLogSqlProvider.class, method="insertSelective")
    int insertSelective(UllUserLoginLogoutLog record);

    @Select({
        "select",
        "ULL_ID, USI_ID, TOKEN, TERMINAL_TYPE, OPERATING_TYPE, OPERATING_DATE, CREATED_BY, ",
        "CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, CALL_CNT, REMARK, STS_CD",
        "from ull_user_login_logout_log",
        "where ULL_ID = #{ullId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ULL_ID", property="ullId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="USI_ID", property="usiId", jdbcType=JdbcType.VARCHAR),
        @Result(column="TOKEN", property="token", jdbcType=JdbcType.VARCHAR),
        @Result(column="TERMINAL_TYPE", property="terminalType", jdbcType=JdbcType.VARCHAR),
        @Result(column="OPERATING_TYPE", property="operatingType", jdbcType=JdbcType.VARCHAR),
        @Result(column="OPERATING_DATE", property="operatingDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATION_DATE", property="creationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_UPDATE_BY", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATE_DATE", property="lastUpdateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALL_CNT", property="callCnt", jdbcType=JdbcType.INTEGER),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.CHAR)
    })
    UllUserLoginLogoutLog selectByPrimaryKey(Integer ullId);

    @UpdateProvider(type=UllUserLoginLogoutLogSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UllUserLoginLogoutLog record);

    @Update({
        "update ull_user_login_logout_log",
        "set USI_ID = #{usiId,jdbcType=VARCHAR},",
          "TOKEN = #{token,jdbcType=VARCHAR},",
          "TERMINAL_TYPE = #{terminalType,jdbcType=VARCHAR},",
          "OPERATING_TYPE = #{operatingType,jdbcType=VARCHAR},",
          "OPERATING_DATE = #{operatingDate,jdbcType=TIMESTAMP},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR}",
        "where ULL_ID = #{ullId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UllUserLoginLogoutLog record);
}