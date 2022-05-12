package com.neuedu.dao;

import com.neuedu.entity.LotLogisticsTracking;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;

public interface LotLogisticsTrackingMapper {
    @Insert({
        "insert into lot_logistics_tracking (LOT_ID, LOGISTICS_COMPANY_ID, ",
        "LOGISTICS_ORDER_ID, LOGISTICS_REMARK, ",
        "STATUS, TRANSPORT_ADDRESS, ",
        "TRANSPORT_STATUS, ORDER_CREATE_TIME, ",
        "ORDER_OCCUR_TIME, CREATED_BY, ",
        "CREATION_DATE, LAST_UPDATE_BY, ",
        "LAST_UPDATE_DATE, CALL_CNT, ",
        "REMARK, STS_CD)",
        "values (#{lotId,jdbcType=INTEGER}, #{logisticsCompanyId,jdbcType=VARCHAR}, ",
        "#{logisticsOrderId,jdbcType=VARCHAR}, #{logisticsRemark,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=VARCHAR}, #{transportAddress,jdbcType=VARCHAR}, ",
        "#{transportStatus,jdbcType=VARCHAR}, #{orderCreateTime,jdbcType=TIMESTAMP}, ",
        "#{orderOccurTime,jdbcType=TIMESTAMP}, #{createdBy,jdbcType=VARCHAR}, ",
        "#{creationDate,jdbcType=TIMESTAMP}, #{lastUpdateBy,jdbcType=VARCHAR}, ",
        "#{lastUpdateDate,jdbcType=TIMESTAMP}, #{callCnt,jdbcType=INTEGER}, ",
        "#{remark,jdbcType=VARCHAR}, #{stsCd,jdbcType=CHAR})"
    })
    int insert(LotLogisticsTracking record);

    @InsertProvider(type=LotLogisticsTrackingSqlProvider.class, method="insertSelective")
    int insertSelective(LotLogisticsTracking record);
}