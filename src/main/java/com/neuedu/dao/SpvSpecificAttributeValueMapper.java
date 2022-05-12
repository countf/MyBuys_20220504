package com.neuedu.dao;

import com.neuedu.entity.SpvSpecificAttributeValue;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface SpvSpecificAttributeValueMapper {
    @Delete({
        "delete from spv_specific_attribute_value",
        "where SPV_ID = #{spvId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer spvId);

    @Insert({
        "insert into spv_specific_attribute_value (SPV_ID, SPA_ID, ",
        "NAME_EN, NAME_CN, ",
        "CREATED_BY, CREATION_DATE, ",
        "LAST_UPDATE_BY, LAST_UPDATE_DATE, ",
        "CALL_CNT, REMARK, ",
        "STS_CD)",
        "values (#{spvId,jdbcType=INTEGER}, #{spaId,jdbcType=INTEGER}, ",
        "#{nameEn,jdbcType=VARCHAR}, #{nameCn,jdbcType=VARCHAR}, ",
        "#{createdBy,jdbcType=VARCHAR}, #{creationDate,jdbcType=TIMESTAMP}, ",
        "#{lastUpdateBy,jdbcType=VARCHAR}, #{lastUpdateDate,jdbcType=TIMESTAMP}, ",
        "#{callCnt,jdbcType=INTEGER}, #{remark,jdbcType=VARCHAR}, ",
        "#{stsCd,jdbcType=CHAR})"
    })
    int insert(SpvSpecificAttributeValue record);

    @InsertProvider(type=SpvSpecificAttributeValueSqlProvider.class, method="insertSelective")
    int insertSelective(SpvSpecificAttributeValue record);

    @Select({
        "select",
        "SPV_ID, SPA_ID, NAME_EN, NAME_CN, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, ",
        "LAST_UPDATE_DATE, CALL_CNT, REMARK, STS_CD",
        "from spv_specific_attribute_value",
        "where SPV_ID = #{spvId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="SPV_ID", property="spvId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="SPA_ID", property="spaId", jdbcType=JdbcType.INTEGER),
        @Result(column="NAME_EN", property="nameEn", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME_CN", property="nameCn", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATION_DATE", property="creationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_UPDATE_BY", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATE_DATE", property="lastUpdateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALL_CNT", property="callCnt", jdbcType=JdbcType.INTEGER),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.CHAR)
    })
    SpvSpecificAttributeValue selectByPrimaryKey(Integer spvId);

    @UpdateProvider(type=SpvSpecificAttributeValueSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SpvSpecificAttributeValue record);

    @Update({
        "update spv_specific_attribute_value",
        "set SPA_ID = #{spaId,jdbcType=INTEGER},",
          "NAME_EN = #{nameEn,jdbcType=VARCHAR},",
          "NAME_CN = #{nameCn,jdbcType=VARCHAR},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR}",
        "where SPV_ID = #{spvId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SpvSpecificAttributeValue record);
}