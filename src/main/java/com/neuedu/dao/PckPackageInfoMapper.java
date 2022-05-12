package com.neuedu.dao;

import com.neuedu.entity.PckPackageInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface PckPackageInfoMapper {
    @Delete({
        "delete from pck_package_info",
        "where PCK_ID = #{pckId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer pckId);

    @Insert({
        "insert into pck_package_info (PCK_ID, WAR_ID, ",
        "PRO_ID, TYPE_CD, WIDTH, ",
        "HEIGHT, LENGTH, ",
        "WEIGHT, CREATED_BY, ",
        "CREATION_DATE, LAST_UPDATE_BY, ",
        "LAST_UPDATE_DATE, CALL_CNT, ",
        "REMARK, STS_CD, HEAVY_CARGO, ",
        "LOGISTICS_COMPANY)",
        "values (#{pckId,jdbcType=INTEGER}, #{warId,jdbcType=INTEGER}, ",
        "#{proId,jdbcType=INTEGER}, #{typeCd,jdbcType=CHAR}, #{width,jdbcType=DECIMAL}, ",
        "#{height,jdbcType=DECIMAL}, #{length,jdbcType=DECIMAL}, ",
        "#{weight,jdbcType=DECIMAL}, #{createdBy,jdbcType=VARCHAR}, ",
        "#{creationDate,jdbcType=TIMESTAMP}, #{lastUpdateBy,jdbcType=VARCHAR}, ",
        "#{lastUpdateDate,jdbcType=TIMESTAMP}, #{callCnt,jdbcType=INTEGER}, ",
        "#{remark,jdbcType=VARCHAR}, #{stsCd,jdbcType=CHAR}, #{heavyCargo,jdbcType=VARCHAR}, ",
        "#{logisticsCompany,jdbcType=VARCHAR})"
    })
    int insert(PckPackageInfo record);

    @InsertProvider(type=PckPackageInfoSqlProvider.class, method="insertSelective")
    int insertSelective(PckPackageInfo record);

    @Select({
        "select",
        "PCK_ID, WAR_ID, PRO_ID, TYPE_CD, WIDTH, HEIGHT, LENGTH, WEIGHT, CREATED_BY, ",
        "CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, CALL_CNT, REMARK, STS_CD, HEAVY_CARGO, ",
        "LOGISTICS_COMPANY",
        "from pck_package_info",
        "where PCK_ID = #{pckId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="PCK_ID", property="pckId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="WAR_ID", property="warId", jdbcType=JdbcType.INTEGER),
        @Result(column="PRO_ID", property="proId", jdbcType=JdbcType.INTEGER),
        @Result(column="TYPE_CD", property="typeCd", jdbcType=JdbcType.CHAR),
        @Result(column="WIDTH", property="width", jdbcType=JdbcType.DECIMAL),
        @Result(column="HEIGHT", property="height", jdbcType=JdbcType.DECIMAL),
        @Result(column="LENGTH", property="length", jdbcType=JdbcType.DECIMAL),
        @Result(column="WEIGHT", property="weight", jdbcType=JdbcType.DECIMAL),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATION_DATE", property="creationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_UPDATE_BY", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATE_DATE", property="lastUpdateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALL_CNT", property="callCnt", jdbcType=JdbcType.INTEGER),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.CHAR),
        @Result(column="HEAVY_CARGO", property="heavyCargo", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOGISTICS_COMPANY", property="logisticsCompany", jdbcType=JdbcType.VARCHAR)
    })
    PckPackageInfo selectByPrimaryKey(Integer pckId);

    @UpdateProvider(type=PckPackageInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PckPackageInfo record);

    @Update({
        "update pck_package_info",
        "set WAR_ID = #{warId,jdbcType=INTEGER},",
          "PRO_ID = #{proId,jdbcType=INTEGER},",
          "TYPE_CD = #{typeCd,jdbcType=CHAR},",
          "WIDTH = #{width,jdbcType=DECIMAL},",
          "HEIGHT = #{height,jdbcType=DECIMAL},",
          "LENGTH = #{length,jdbcType=DECIMAL},",
          "WEIGHT = #{weight,jdbcType=DECIMAL},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR},",
          "HEAVY_CARGO = #{heavyCargo,jdbcType=VARCHAR},",
          "LOGISTICS_COMPANY = #{logisticsCompany,jdbcType=VARCHAR}",
        "where PCK_ID = #{pckId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PckPackageInfo record);
}