package com.neuedu.dao;

import com.neuedu.entity.FreFreightTemplate;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface FreFreightTemplateMapper {
    @Delete({
        "delete from fre_freight_template",
        "where FRE_ID = #{freId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer freId);

    @Insert({
        "insert into fre_freight_template (FRE_ID, FRE_COMPANY, ",
        "WAR_ID, DES_COUNTRY, ",
        "DES_COUNTRY_ID, DES_PROVINCE, ",
        "DES_PROVINCE_ID, FRE_FEE, ",
        "STS_CD)",
        "values (#{freId,jdbcType=INTEGER}, #{freCompany,jdbcType=VARCHAR}, ",
        "#{warId,jdbcType=INTEGER}, #{desCountry,jdbcType=VARCHAR}, ",
        "#{desCountryId,jdbcType=VARCHAR}, #{desProvince,jdbcType=VARCHAR}, ",
        "#{desProvinceId,jdbcType=VARCHAR}, #{freFee,jdbcType=DECIMAL}, ",
        "#{stsCd,jdbcType=CHAR})"
    })
    int insert(FreFreightTemplate record);

    @InsertProvider(type=FreFreightTemplateSqlProvider.class, method="insertSelective")
    int insertSelective(FreFreightTemplate record);

    @Select({
        "select",
        "FRE_ID, FRE_COMPANY, WAR_ID, DES_COUNTRY, DES_COUNTRY_ID, DES_PROVINCE, DES_PROVINCE_ID, ",
        "FRE_FEE, STS_CD",
        "from fre_freight_template",
        "where FRE_ID = #{freId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="FRE_ID", property="freId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="FRE_COMPANY", property="freCompany", jdbcType=JdbcType.VARCHAR),
        @Result(column="WAR_ID", property="warId", jdbcType=JdbcType.INTEGER),
        @Result(column="DES_COUNTRY", property="desCountry", jdbcType=JdbcType.VARCHAR),
        @Result(column="DES_COUNTRY_ID", property="desCountryId", jdbcType=JdbcType.VARCHAR),
        @Result(column="DES_PROVINCE", property="desProvince", jdbcType=JdbcType.VARCHAR),
        @Result(column="DES_PROVINCE_ID", property="desProvinceId", jdbcType=JdbcType.VARCHAR),
        @Result(column="FRE_FEE", property="freFee", jdbcType=JdbcType.DECIMAL),
        @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.CHAR)
    })
    FreFreightTemplate selectByPrimaryKey(Integer freId);

    @UpdateProvider(type=FreFreightTemplateSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FreFreightTemplate record);

    @Update({
        "update fre_freight_template",
        "set FRE_COMPANY = #{freCompany,jdbcType=VARCHAR},",
          "WAR_ID = #{warId,jdbcType=INTEGER},",
          "DES_COUNTRY = #{desCountry,jdbcType=VARCHAR},",
          "DES_COUNTRY_ID = #{desCountryId,jdbcType=VARCHAR},",
          "DES_PROVINCE = #{desProvince,jdbcType=VARCHAR},",
          "DES_PROVINCE_ID = #{desProvinceId,jdbcType=VARCHAR},",
          "FRE_FEE = #{freFee,jdbcType=DECIMAL},",
          "STS_CD = #{stsCd,jdbcType=CHAR}",
        "where FRE_ID = #{freId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FreFreightTemplate record);
}