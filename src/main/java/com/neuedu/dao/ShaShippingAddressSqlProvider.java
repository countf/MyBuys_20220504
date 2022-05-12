package com.neuedu.dao;

import com.neuedu.entity.ShaShippingAddress;
import org.apache.ibatis.jdbc.SQL;

public class ShaShippingAddressSqlProvider {
    public String insertSelective(ShaShippingAddress record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sha_shipping_address");
        
        if (record.getCreatedBy() != null) {
            sql.VALUES("CREATED_BY", "#{createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getCreationDate() != null) {
            sql.VALUES("CREATION_DATE", "#{creationDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastUpdateBy() != null) {
            sql.VALUES("LAST_UPDATE_BY", "#{lastUpdateBy,jdbcType=VARCHAR}");
        }
        
        if (record.getLastUpdateDate() != null) {
            sql.VALUES("LAST_UPDATE_DATE", "#{lastUpdateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCallCnt() != null) {
            sql.VALUES("CALL_CNT", "#{callCnt,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("REMARK", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getStsCd() != null) {
            sql.VALUES("STS_CD", "#{stsCd,jdbcType=CHAR}");
        }
        
        if (record.getFamilyName() != null) {
            sql.VALUES("FAMILY_NAME", "#{familyName,jdbcType=VARCHAR}");
        }
        
        if (record.getGivenName() != null) {
            sql.VALUES("GIVEN_NAME", "#{givenName,jdbcType=VARCHAR}");
        }
        
        if (record.getCountryName() != null) {
            sql.VALUES("COUNTRY_NAME", "#{countryName,jdbcType=VARCHAR}");
        }
        
        if (record.getCountryIsoCd() != null) {
            sql.VALUES("COUNTRY_ISO_CD", "#{countryIsoCd,jdbcType=VARCHAR}");
        }
        
        if (record.getStateOrProvinceName() != null) {
            sql.VALUES("STATE_OR_PROVINCE_NAME", "#{stateOrProvinceName,jdbcType=VARCHAR}");
        }
        
        if (record.getStateOrProvinceCd() != null) {
            sql.VALUES("STATE_OR_PROVINCE_CD", "#{stateOrProvinceCd,jdbcType=VARCHAR}");
        }
        
        if (record.getCityName() != null) {
            sql.VALUES("CITY_NAME", "#{cityName,jdbcType=VARCHAR}");
        }
        
        if (record.getAddressLine1() != null) {
            sql.VALUES("ADDRESS_LINE1", "#{addressLine1,jdbcType=VARCHAR}");
        }
        
        if (record.getAddressLine2() != null) {
            sql.VALUES("ADDRESS_LINE2", "#{addressLine2,jdbcType=VARCHAR}");
        }
        
        if (record.getAddressLine3() != null) {
            sql.VALUES("ADDRESS_LINE3", "#{addressLine3,jdbcType=VARCHAR}");
        }
        
        if (record.getPostalCd() != null) {
            sql.VALUES("POSTAL_CD", "#{postalCd,jdbcType=VARCHAR}");
        }
        
        if (record.getContactPhoneNo() != null) {
            sql.VALUES("CONTACT_PHONE_NO", "#{contactPhoneNo,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.VALUES("EMAIL", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getStoId() != null) {
            sql.VALUES("STO_ID", "#{stoId,jdbcType=INTEGER}");
        }
        
        if (record.getCarrierName() != null) {
            sql.VALUES("CARRIER_NAME", "#{carrierName,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }
}