package com.neuedu.dao;

import com.neuedu.entity.MorMonitorResult;
import org.apache.ibatis.jdbc.SQL;

public class MorMonitorResultSqlProvider {
    public String insertSelective(MorMonitorResult record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("mor_monitor_result");
        
        if (record.getMorId() != null) {
            sql.VALUES("MOR_ID", "#{morId,jdbcType=INTEGER}");
        }
        
        if (record.getClassName() != null) {
            sql.VALUES("CLASS_NAME", "#{className,jdbcType=VARCHAR}");
        }
        
        if (record.getJsonString() != null) {
            sql.VALUES("JSON_STRING", "#{jsonString,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            sql.VALUES("CREATE_DATE", "#{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateBy() != null) {
            sql.VALUES("CREATE_BY", "#{createBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdateDate() != null) {
            sql.VALUES("UPDATE_DATE", "#{updateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateBy() != null) {
            sql.VALUES("UPDATE_BY", "#{updateBy,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("REMARK", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getStsCd() != null) {
            sql.VALUES("STS_CD", "#{stsCd,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(MorMonitorResult record) {
        SQL sql = new SQL();
        sql.UPDATE("mor_monitor_result");
        
        if (record.getClassName() != null) {
            sql.SET("CLASS_NAME = #{className,jdbcType=VARCHAR}");
        }
        
        if (record.getJsonString() != null) {
            sql.SET("JSON_STRING = #{jsonString,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            sql.SET("CREATE_DATE = #{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateBy() != null) {
            sql.SET("CREATE_BY = #{createBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdateDate() != null) {
            sql.SET("UPDATE_DATE = #{updateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateBy() != null) {
            sql.SET("UPDATE_BY = #{updateBy,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("REMARK = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getStsCd() != null) {
            sql.SET("STS_CD = #{stsCd,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("MOR_ID = #{morId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}