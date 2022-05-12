package com.neuedu.dao;

import com.neuedu.entity.PrcProductCategory;
import org.apache.ibatis.jdbc.SQL;

public class PrcProductCategorySqlProvider {
    public String insertSelective(PrcProductCategory record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("prc_product_category");
        
        if (record.getPrcId() != null) {
            sql.VALUES("PRC_ID", "#{prcId,jdbcType=INTEGER}");
        }
        
        if (record.getProId() != null) {
            sql.VALUES("PRO_ID", "#{proId,jdbcType=INTEGER}");
        }
        
        if (record.getCategoryId() != null) {
            sql.VALUES("CATEGORY_ID", "#{categoryId,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryName() != null) {
            sql.VALUES("CATEGORY_NAME", "#{categoryName,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryPath() != null) {
            sql.VALUES("CATEGORY_PATH", "#{categoryPath,jdbcType=VARCHAR}");
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
        
        if (record.getPlateformType() != null) {
            sql.VALUES("PLATEFORM_TYPE", "#{plateformType,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(PrcProductCategory record) {
        SQL sql = new SQL();
        sql.UPDATE("prc_product_category");
        
        if (record.getProId() != null) {
            sql.SET("PRO_ID = #{proId,jdbcType=INTEGER}");
        }
        
        if (record.getCategoryId() != null) {
            sql.SET("CATEGORY_ID = #{categoryId,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryName() != null) {
            sql.SET("CATEGORY_NAME = #{categoryName,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryPath() != null) {
            sql.SET("CATEGORY_PATH = #{categoryPath,jdbcType=VARCHAR}");
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
        
        if (record.getPlateformType() != null) {
            sql.SET("PLATEFORM_TYPE = #{plateformType,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("PRC_ID = #{prcId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}