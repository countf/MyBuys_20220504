package com.neuedu.dao;

import com.neuedu.entity.CdmCodeMaster;
import org.apache.ibatis.jdbc.SQL;

public class CdmCodeMasterSqlProvider {
    public String insertSelective(CdmCodeMaster record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("cdm_code_master");
        
        if (record.getCdmId() != null) {
            sql.VALUES("CDM_ID", "#{cdmId,jdbcType=INTEGER}");
        }
        
        if (record.getCodeType() != null) {
            sql.VALUES("CODE_TYPE", "#{codeType,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            sql.VALUES("DESCRIPTION", "#{description,jdbcType=VARCHAR}");
        }
        
        if (record.getTypeCd() != null) {
            sql.VALUES("TYPE_CD", "#{typeCd,jdbcType=VARCHAR}");
        }
        
        if (record.getCodeVal() != null) {
            sql.VALUES("CODE_VAL", "#{codeVal,jdbcType=VARCHAR}");
        }
        
        if (record.getSeqNo() != null) {
            sql.VALUES("SEQ_NO", "#{seqNo,jdbcType=INTEGER}");
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

    public String updateByPrimaryKeySelective(CdmCodeMaster record) {
        SQL sql = new SQL();
        sql.UPDATE("cdm_code_master");
        
        if (record.getCodeType() != null) {
            sql.SET("CODE_TYPE = #{codeType,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            sql.SET("DESCRIPTION = #{description,jdbcType=VARCHAR}");
        }
        
        if (record.getTypeCd() != null) {
            sql.SET("TYPE_CD = #{typeCd,jdbcType=VARCHAR}");
        }
        
        if (record.getCodeVal() != null) {
            sql.SET("CODE_VAL = #{codeVal,jdbcType=VARCHAR}");
        }
        
        if (record.getSeqNo() != null) {
            sql.SET("SEQ_NO = #{seqNo,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedBy() != null) {
            sql.SET("CREATED_BY = #{createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getCreationDate() != null) {
            sql.SET("CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastUpdateBy() != null) {
            sql.SET("LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR}");
        }
        
        if (record.getLastUpdateDate() != null) {
            sql.SET("LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCallCnt() != null) {
            sql.SET("CALL_CNT = #{callCnt,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("REMARK = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getStsCd() != null) {
            sql.SET("STS_CD = #{stsCd,jdbcType=CHAR}");
        }
        
        sql.WHERE("CDM_ID = #{cdmId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}