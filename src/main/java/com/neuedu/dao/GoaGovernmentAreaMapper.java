package com.neuedu.dao;

import com.neuedu.entity.GoaGovernmentArea;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface GoaGovernmentAreaMapper {
    @Delete({
        "delete from goa_government_area",
        "where GOA_ID = #{goaId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer goaId);

    @Insert({
        "insert into goa_government_area (GOA_ID, ZIP_CODE, ",
        "STATE, STATE_SHORTHAND, ",
        "CITY, CREATED_BY, ",
        "CREATION_DATE, LAST_UPDATE_BY, ",
        "CALL_CNT, LAST_UPDATE_DATE, ",
        "REMARK, STS_CD)",
        "values (#{goaId,jdbcType=INTEGER}, #{zipCode,jdbcType=VARCHAR}, ",
        "#{state,jdbcType=VARCHAR}, #{stateShorthand,jdbcType=VARCHAR}, ",
        "#{city,jdbcType=VARCHAR}, #{createdBy,jdbcType=VARCHAR}, ",
        "#{creationDate,jdbcType=TIMESTAMP}, #{lastUpdateBy,jdbcType=VARCHAR}, ",
        "#{callCnt,jdbcType=INTEGER}, #{lastUpdateDate,jdbcType=TIMESTAMP}, ",
        "#{remark,jdbcType=VARCHAR}, #{stsCd,jdbcType=CHAR})"
    })
    int insert(GoaGovernmentArea record);

    @InsertProvider(type=GoaGovernmentAreaSqlProvider.class, method="insertSelective")
    int insertSelective(GoaGovernmentArea record);

    @Select({
        "select",
        "GOA_ID, ZIP_CODE, STATE, STATE_SHORTHAND, CITY, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, ",
        "CALL_CNT, LAST_UPDATE_DATE, REMARK, STS_CD",
        "from goa_government_area",
        "where GOA_ID = #{goaId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="GOA_ID", property="goaId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ZIP_CODE", property="zipCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATE", property="state", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATE_SHORTHAND", property="stateShorthand", jdbcType=JdbcType.VARCHAR),
        @Result(column="CITY", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATION_DATE", property="creationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_UPDATE_BY", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="CALL_CNT", property="callCnt", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_UPDATE_DATE", property="lastUpdateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.CHAR)
    })
    GoaGovernmentArea selectByPrimaryKey(Integer goaId);

    @UpdateProvider(type=GoaGovernmentAreaSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(GoaGovernmentArea record);

    @Update({
        "update goa_government_area",
        "set ZIP_CODE = #{zipCode,jdbcType=VARCHAR},",
          "STATE = #{state,jdbcType=VARCHAR},",
          "STATE_SHORTHAND = #{stateShorthand,jdbcType=VARCHAR},",
          "CITY = #{city,jdbcType=VARCHAR},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR}",
        "where GOA_ID = #{goaId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(GoaGovernmentArea record);
}