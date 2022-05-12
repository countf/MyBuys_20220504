package com.neuedu.dao;

import com.neuedu.entity.ManManufacturer;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface ManManufacturerMapper {
    @Delete({
        "delete from man_manufacturer",
        "where MAN_ID = #{manId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer manId);

//    @Insert({
//        "insert into man_manufacturer (MAN_ID, NAME_EN, ",
//        "NAME_CN, GMC_REPORT_TYPE, ",
//        "GMC_REPORT_URL, CREATED_BY, ",
//        "CREATION_DATE, LAST_UPDATE_BY, ",
//        "LAST_UPDATE_DATE, CALL_CNT, ",
//        "REMARK, STS_CD, DESCRIPTION)",
//        "values (#{manId,jdbcType=INTEGER}, #{nameEn,jdbcType=VARCHAR}, ",
//        "#{nameCn,jdbcType=VARCHAR}, #{gmcReportType,jdbcType=VARCHAR}, ",
//        "#{gmcReportUrl,jdbcType=VARCHAR}, #{createdBy,jdbcType=VARCHAR}, ",
//        "#{creationDate,jdbcType=TIMESTAMP}, #{lastUpdateBy,jdbcType=VARCHAR}, ",
//        "#{lastUpdateDate,jdbcType=TIMESTAMP}, #{callCnt,jdbcType=INTEGER}, ",
//        "#{remark,jdbcType=VARCHAR}, #{stsCd,jdbcType=CHAR}, #{description,jdbcType=LONGVARCHAR})"
//    })
    @Insert({
            "insert into man_manufacturer (MAN_ID, NAME_EN, ",
            "NAME_CN, GMC_REPORT_TYPE, ",
            "GMC_REPORT_URL, CREATED_BY, ",
            "CREATION_DATE, ",
            "CALL_CNT, ",
            "REMARK, STS_CD, DESCRIPTION)",
            "values (#{manId,jdbcType=INTEGER}, #{nameEn,jdbcType=VARCHAR}, ",
            "#{nameCn,jdbcType=VARCHAR}, #{gmcReportType,jdbcType=VARCHAR}, ",
            "#{gmcReportUrl,jdbcType=VARCHAR}, #{createdBy,jdbcType=VARCHAR}, ",
            "now(), #{callCnt,jdbcType=INTEGER}, ",
            "#{remark,jdbcType=VARCHAR}, 'a', #{description,jdbcType=LONGVARCHAR})"
    })
    @Options(useGeneratedKeys = true,keyProperty = "manId",keyColumn = "MAN_ID")
    int insert(ManManufacturer record);

    @InsertProvider(type=ManManufacturerSqlProvider.class, method="insertSelective")
    int insertSelective(ManManufacturer record);

    @Select({
        "select",
        "MAN_ID, NAME_EN, NAME_CN, GMC_REPORT_TYPE, GMC_REPORT_URL, CREATED_BY, CREATION_DATE, ",
        "LAST_UPDATE_BY, LAST_UPDATE_DATE, CALL_CNT, REMARK, STS_CD, DESCRIPTION",
        "from man_manufacturer",
        "where MAN_ID = #{manId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="MAN_ID", property="manId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="NAME_EN", property="nameEn", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME_CN", property="nameCn", jdbcType=JdbcType.VARCHAR),
        @Result(column="GMC_REPORT_TYPE", property="gmcReportType", jdbcType=JdbcType.VARCHAR),
        @Result(column="GMC_REPORT_URL", property="gmcReportUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATION_DATE", property="creationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_UPDATE_BY", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATE_DATE", property="lastUpdateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALL_CNT", property="callCnt", jdbcType=JdbcType.INTEGER),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.CHAR),
        @Result(column="DESCRIPTION", property="description", jdbcType=JdbcType.LONGVARCHAR)
    })
    ManManufacturer selectByPrimaryKey(Integer manId);

    @UpdateProvider(type=ManManufacturerSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ManManufacturer record);

    @Update({
        "update man_manufacturer",
        "set NAME_EN = #{nameEn,jdbcType=VARCHAR},",
          "NAME_CN = #{nameCn,jdbcType=VARCHAR},",
          "GMC_REPORT_TYPE = #{gmcReportType,jdbcType=VARCHAR},",
          "GMC_REPORT_URL = #{gmcReportUrl,jdbcType=VARCHAR},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = now(),",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR},",
          "DESCRIPTION = #{description,jdbcType=LONGVARCHAR}",
        "where MAN_ID = #{manId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(ManManufacturer record);

    @Update({
        "update man_manufacturer",
        "set NAME_EN = #{nameEn,jdbcType=VARCHAR},",
          "NAME_CN = #{nameCn,jdbcType=VARCHAR},",
          "GMC_REPORT_TYPE = #{gmcReportType,jdbcType=VARCHAR},",
          "GMC_REPORT_URL = #{gmcReportUrl,jdbcType=VARCHAR},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = now(),",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR}",
        "where MAN_ID = #{manId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ManManufacturer record);
}