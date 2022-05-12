package com.neuedu.dao;

import com.neuedu.entity.LotLogisticsTracking;
import org.apache.ibatis.jdbc.SQL;

public class LotLogisticsTrackingSqlProvider {
    public String insertSelective(LotLogisticsTracking record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lot_logistics_tracking");
        
        if (record.getLotId() != null) {
            sql.VALUES("LOT_ID", "#{lotId,jdbcType=INTEGER}");
        }
        
        if (record.getLogisticsCompanyId() != null) {
            sql.VALUES("LOGISTICS_COMPANY_ID", "#{logisticsCompanyId,jdbcType=VARCHAR}");
        }
        
        if (record.getLogisticsOrderId() != null) {
            sql.VALUES("LOGISTICS_ORDER_ID", "#{logisticsOrderId,jdbcType=VARCHAR}");
        }
        
        if (record.getLogisticsRemark() != null) {
            sql.VALUES("LOGISTICS_REMARK", "#{logisticsRemark,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("STATUS", "#{status,jdbcType=VARCHAR}");
        }
        
        if (record.getTransportAddress() != null) {
            sql.VALUES("TRANSPORT_ADDRESS", "#{transportAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getTransportStatus() != null) {
            sql.VALUES("TRANSPORT_STATUS", "#{transportStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderCreateTime() != null) {
            sql.VALUES("ORDER_CREATE_TIME", "#{orderCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderOccurTime() != null) {
            sql.VALUES("ORDER_OCCUR_TIME", "#{orderOccurTime,jdbcType=TIMESTAMP}");
        }
        
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
        
        return sql.toString();
    }
}