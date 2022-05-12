package com.neuedu.dao;

import com.neuedu.entity.LoaLogisticsAccount;
import org.apache.ibatis.jdbc.SQL;

public class LoaLogisticsAccountSqlProvider {
    public String insertSelective(LoaLogisticsAccount record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("loa_logistics_account");
        
        if (record.getLoaId() != null) {
            sql.VALUES("LOA_ID", "#{loaId,jdbcType=INTEGER}");
        }
        
        if (record.getLogisticsCd() != null) {
            sql.VALUES("LOGISTICS_CD", "#{logisticsCd,jdbcType=VARCHAR}");
        }
        
        if (record.getSupin() != null) {
            sql.VALUES("SUPIN", "#{supin,jdbcType=VARCHAR}");
        }
        
        if (record.getSucode() != null) {
            sql.VALUES("SUCODE", "#{sucode,jdbcType=VARCHAR}");
        }
        
        if (record.getWarehouseCd() != null) {
            sql.VALUES("WAREHOUSE_CD", "#{warehouseCd,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.VALUES("EMAIL", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.VALUES("PASSWORD", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getHirhcode() != null) {
            sql.VALUES("HIRHCODE", "#{hirhcode,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            sql.VALUES("MOBILE", "#{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getNickName() != null) {
            sql.VALUES("NICK_NAME", "#{nickName,jdbcType=VARCHAR}");
        }
        
        if (record.getFirstName() != null) {
            sql.VALUES("FIRST_NAME", "#{firstName,jdbcType=VARCHAR}");
        }
        
        if (record.getLastName() != null) {
            sql.VALUES("LAST_NAME", "#{lastName,jdbcType=VARCHAR}");
        }
        
        if (record.getManId() != null) {
            sql.VALUES("MAN_ID", "#{manId,jdbcType=INTEGER}");
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