package com.neuedu.dao;

import com.neuedu.entity.ShaShippingAddress;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;

public interface ShaShippingAddressMapper {
    @Insert({
        "insert into sha_shipping_address (CREATED_BY, CREATION_DATE, ",
        "LAST_UPDATE_BY, LAST_UPDATE_DATE, ",
        "CALL_CNT, REMARK, ",
        "STS_CD, FAMILY_NAME, ",
        "GIVEN_NAME, COUNTRY_NAME, ",
        "COUNTRY_ISO_CD, STATE_OR_PROVINCE_NAME, ",
        "STATE_OR_PROVINCE_CD, CITY_NAME, ",
        "ADDRESS_LINE1, ADDRESS_LINE2, ",
        "ADDRESS_LINE3, POSTAL_CD, ",
        "CONTACT_PHONE_NO, EMAIL, ",
        "STO_ID, CARRIER_NAME)",
        "values (#{createdBy,jdbcType=VARCHAR}, #{creationDate,jdbcType=TIMESTAMP}, ",
        "#{lastUpdateBy,jdbcType=VARCHAR}, #{lastUpdateDate,jdbcType=TIMESTAMP}, ",
        "#{callCnt,jdbcType=INTEGER}, #{remark,jdbcType=VARCHAR}, ",
        "#{stsCd,jdbcType=CHAR}, #{familyName,jdbcType=VARCHAR}, ",
        "#{givenName,jdbcType=VARCHAR}, #{countryName,jdbcType=VARCHAR}, ",
        "#{countryIsoCd,jdbcType=VARCHAR}, #{stateOrProvinceName,jdbcType=VARCHAR}, ",
        "#{stateOrProvinceCd,jdbcType=VARCHAR}, #{cityName,jdbcType=VARCHAR}, ",
        "#{addressLine1,jdbcType=VARCHAR}, #{addressLine2,jdbcType=VARCHAR}, ",
        "#{addressLine3,jdbcType=VARCHAR}, #{postalCd,jdbcType=VARCHAR}, ",
        "#{contactPhoneNo,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, ",
        "#{stoId,jdbcType=INTEGER}, #{carrierName,jdbcType=VARCHAR})"
    })
    int insert(ShaShippingAddress record);

    @InsertProvider(type=ShaShippingAddressSqlProvider.class, method="insertSelective")
    int insertSelective(ShaShippingAddress record);
}