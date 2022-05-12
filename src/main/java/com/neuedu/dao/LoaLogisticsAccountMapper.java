package com.neuedu.dao;

import com.neuedu.entity.LoaLogisticsAccount;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;

public interface LoaLogisticsAccountMapper {
    @Insert({
        "insert into loa_logistics_account (LOA_ID, LOGISTICS_CD, ",
        "SUPIN, SUCODE, WAREHOUSE_CD, ",
        "EMAIL, PASSWORD, ",
        "HIRHCODE, MOBILE, ",
        "NICK_NAME, FIRST_NAME, ",
        "LAST_NAME, MAN_ID, ",
        "CREATED_BY, CREATION_DATE, ",
        "LAST_UPDATE_BY, LAST_UPDATE_DATE, ",
        "CALL_CNT, REMARK, ",
        "STS_CD)",
        "values (#{loaId,jdbcType=INTEGER}, #{logisticsCd,jdbcType=VARCHAR}, ",
        "#{supin,jdbcType=VARCHAR}, #{sucode,jdbcType=VARCHAR}, #{warehouseCd,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{hirhcode,jdbcType=VARCHAR}, #{mobile,jdbcType=VARCHAR}, ",
        "#{nickName,jdbcType=VARCHAR}, #{firstName,jdbcType=VARCHAR}, ",
        "#{lastName,jdbcType=VARCHAR}, #{manId,jdbcType=INTEGER}, ",
        "#{createdBy,jdbcType=VARCHAR}, #{creationDate,jdbcType=TIMESTAMP}, ",
        "#{lastUpdateBy,jdbcType=VARCHAR}, #{lastUpdateDate,jdbcType=TIMESTAMP}, ",
        "#{callCnt,jdbcType=INTEGER}, #{remark,jdbcType=VARCHAR}, ",
        "#{stsCd,jdbcType=CHAR})"
    })
    int insert(LoaLogisticsAccount record);

    @InsertProvider(type=LoaLogisticsAccountSqlProvider.class, method="insertSelective")
    int insertSelective(LoaLogisticsAccount record);
}