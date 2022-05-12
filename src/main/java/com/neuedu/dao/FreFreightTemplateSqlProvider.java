package com.neuedu.dao;

import com.neuedu.entity.FreFreightTemplate;
import org.apache.ibatis.jdbc.SQL;

public class FreFreightTemplateSqlProvider {
    public String insertSelective(FreFreightTemplate record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("fre_freight_template");
        
        if (record.getFreId() != null) {
            sql.VALUES("FRE_ID", "#{freId,jdbcType=INTEGER}");
        }
        
        if (record.getFreCompany() != null) {
            sql.VALUES("FRE_COMPANY", "#{freCompany,jdbcType=VARCHAR}");
        }
        
        if (record.getWarId() != null) {
            sql.VALUES("WAR_ID", "#{warId,jdbcType=INTEGER}");
        }
        
        if (record.getDesCountry() != null) {
            sql.VALUES("DES_COUNTRY", "#{desCountry,jdbcType=VARCHAR}");
        }
        
        if (record.getDesCountryId() != null) {
            sql.VALUES("DES_COUNTRY_ID", "#{desCountryId,jdbcType=VARCHAR}");
        }
        
        if (record.getDesProvince() != null) {
            sql.VALUES("DES_PROVINCE", "#{desProvince,jdbcType=VARCHAR}");
        }
        
        if (record.getDesProvinceId() != null) {
            sql.VALUES("DES_PROVINCE_ID", "#{desProvinceId,jdbcType=VARCHAR}");
        }
        
        if (record.getFreFee() != null) {
            sql.VALUES("FRE_FEE", "#{freFee,jdbcType=DECIMAL}");
        }
        
        if (record.getStsCd() != null) {
            sql.VALUES("STS_CD", "#{stsCd,jdbcType=CHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(FreFreightTemplate record) {
        SQL sql = new SQL();
        sql.UPDATE("fre_freight_template");
        
        if (record.getFreCompany() != null) {
            sql.SET("FRE_COMPANY = #{freCompany,jdbcType=VARCHAR}");
        }
        
        if (record.getWarId() != null) {
            sql.SET("WAR_ID = #{warId,jdbcType=INTEGER}");
        }
        
        if (record.getDesCountry() != null) {
            sql.SET("DES_COUNTRY = #{desCountry,jdbcType=VARCHAR}");
        }
        
        if (record.getDesCountryId() != null) {
            sql.SET("DES_COUNTRY_ID = #{desCountryId,jdbcType=VARCHAR}");
        }
        
        if (record.getDesProvince() != null) {
            sql.SET("DES_PROVINCE = #{desProvince,jdbcType=VARCHAR}");
        }
        
        if (record.getDesProvinceId() != null) {
            sql.SET("DES_PROVINCE_ID = #{desProvinceId,jdbcType=VARCHAR}");
        }
        
        if (record.getFreFee() != null) {
            sql.SET("FRE_FEE = #{freFee,jdbcType=DECIMAL}");
        }
        
        if (record.getStsCd() != null) {
            sql.SET("STS_CD = #{stsCd,jdbcType=CHAR}");
        }
        
        sql.WHERE("FRE_ID = #{freId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}