package com.neuedu.dao;

import com.neuedu.entity.ParParameter;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface ParParameterMapper {
    @Delete({
        "delete from par_parameter",
        "where PAR_ID = #{parId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer parId);

    @Insert({
        "insert into par_parameter (PAR_ID, PARAM_CD, ",
        "PARAM_VALUE, CREATED_BY, ",
        "CREATION_DATE, LAST_UPDATE_BY, ",
        "LAST_UPDATE_DATE, CALL_CNT, ",
        "REMARK, STS_CD, DESCRIPTION)",
        "values (#{parId,jdbcType=INTEGER}, #{paramCd,jdbcType=VARCHAR}, ",
        "#{paramValue,jdbcType=VARCHAR}, #{createdBy,jdbcType=VARCHAR}, ",
        "#{creationDate,jdbcType=TIMESTAMP}, #{lastUpdateBy,jdbcType=VARCHAR}, ",
        "#{lastUpdateDate,jdbcType=TIMESTAMP}, #{callCnt,jdbcType=INTEGER}, ",
        "#{remark,jdbcType=VARCHAR}, #{stsCd,jdbcType=CHAR}, #{description,jdbcType=LONGVARCHAR})"
    })
    int insert(ParParameter record);

    @InsertProvider(type=ParParameterSqlProvider.class, method="insertSelective")
    int insertSelective(ParParameter record);

    @Select({
        "select",
        "PAR_ID, PARAM_CD, PARAM_VALUE, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, ",
        "CALL_CNT, REMARK, STS_CD, DESCRIPTION",
        "from par_parameter",
        "where PAR_ID = #{parId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="PAR_ID", property="parId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="PARAM_CD", property="paramCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARAM_VALUE", property="paramValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATION_DATE", property="creationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_UPDATE_BY", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATE_DATE", property="lastUpdateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALL_CNT", property="callCnt", jdbcType=JdbcType.INTEGER),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.CHAR),
        @Result(column="DESCRIPTION", property="description", jdbcType=JdbcType.LONGVARCHAR)
    })
    ParParameter selectByPrimaryKey(Integer parId);

    @UpdateProvider(type=ParParameterSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ParParameter record);

    @Update({
        "update par_parameter",
        "set PARAM_CD = #{paramCd,jdbcType=VARCHAR},",
          "PARAM_VALUE = #{paramValue,jdbcType=VARCHAR},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR},",
          "DESCRIPTION = #{description,jdbcType=LONGVARCHAR}",
        "where PAR_ID = #{parId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(ParParameter record);

    @Update({
        "update par_parameter",
        "set PARAM_CD = #{paramCd,jdbcType=VARCHAR},",
          "PARAM_VALUE = #{paramValue,jdbcType=VARCHAR},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR}",
        "where PAR_ID = #{parId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ParParameter record);
}