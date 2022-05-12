package com.neuedu.dao;

import com.neuedu.entity.ProProduct;
import org.apache.ibatis.jdbc.SQL;

public class ProProductSqlProvider {
    public String insertSelective(ProProduct record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("pro_product");
        
        if (record.getProId() != null) {
            sql.VALUES("PRO_ID", "#{proId,jdbcType=INTEGER}");
        }
        
        if (record.getSkuCd() != null) {
            sql.VALUES("SKU_CD", "#{skuCd,jdbcType=VARCHAR}");
        }
        
        if (record.getBrdId() != null) {
            sql.VALUES("BRD_ID", "#{brdId,jdbcType=INTEGER}");
        }
        
        if (record.getManId() != null) {
            sql.VALUES("MAN_ID", "#{manId,jdbcType=INTEGER}");
        }
        
        if (record.getTitle() != null) {
            sql.VALUES("TITLE", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getUpc() != null) {
            sql.VALUES("UPC", "#{upc,jdbcType=VARCHAR}");
        }
        
        if (record.getEan() != null) {
            sql.VALUES("EAN", "#{ean,jdbcType=VARCHAR}");
        }
        
        if (record.getModel() != null) {
            sql.VALUES("MODEL", "#{model,jdbcType=VARCHAR}");
        }
        
        if (record.getWarrantyDay() != null) {
            sql.VALUES("WARRANTY_DAY", "#{warrantyDay,jdbcType=VARCHAR}");
        }
        
        if (record.getRetailPrice() != null) {
            sql.VALUES("RETAIL_PRICE", "#{retailPrice,jdbcType=DECIMAL}");
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
        
        if (record.getMininumRetailPrice() != null) {
            sql.VALUES("MININUM_RETAIL_PRICE", "#{mininumRetailPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getReplenishmentPeriod() != null) {
            sql.VALUES("REPLENISHMENT_PERIOD", "#{replenishmentPeriod,jdbcType=INTEGER}");
        }
        
        if (record.getKeyWords() != null) {
            sql.VALUES("KEY_WORDS", "#{keyWords,jdbcType=VARCHAR}");
        }
        
        if (record.getTimeUnit() != null) {
            sql.VALUES("TIME_UNIT", "#{timeUnit,jdbcType=VARCHAR}");
        }
        
        if (record.getStockseting() != null) {
            sql.VALUES("STOCKSETING", "#{stockseting,jdbcType=INTEGER}");
        }
        
        if (record.getWarranty() != null) {
            sql.VALUES("WARRANTY", "#{warranty,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(ProProduct record) {
        SQL sql = new SQL();
        sql.UPDATE("pro_product");
        
        if (record.getSkuCd() != null) {
            sql.SET("SKU_CD = #{skuCd,jdbcType=VARCHAR}");
        }
        
        if (record.getBrdId() != null) {
            sql.SET("BRD_ID = #{brdId,jdbcType=INTEGER}");
        }
        
        if (record.getManId() != null) {
            sql.SET("MAN_ID = #{manId,jdbcType=INTEGER}");
        }
        
        if (record.getTitle() != null) {
            sql.SET("TITLE = #{title,jdbcType=VARCHAR}");
        }
        
        if (record.getUpc() != null) {
            sql.SET("UPC = #{upc,jdbcType=VARCHAR}");
        }
        
        if (record.getEan() != null) {
            sql.SET("EAN = #{ean,jdbcType=VARCHAR}");
        }
        
        if (record.getModel() != null) {
            sql.SET("MODEL = #{model,jdbcType=VARCHAR}");
        }
        
        if (record.getWarrantyDay() != null) {
            sql.SET("WARRANTY_DAY = #{warrantyDay,jdbcType=VARCHAR}");
        }
        
        if (record.getRetailPrice() != null) {
            sql.SET("RETAIL_PRICE = #{retailPrice,jdbcType=DECIMAL}");
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
        
        if (record.getMininumRetailPrice() != null) {
            sql.SET("MININUM_RETAIL_PRICE = #{mininumRetailPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getReplenishmentPeriod() != null) {
            sql.SET("REPLENISHMENT_PERIOD = #{replenishmentPeriod,jdbcType=INTEGER}");
        }
        
        if (record.getKeyWords() != null) {
            sql.SET("KEY_WORDS = #{keyWords,jdbcType=VARCHAR}");
        }
        
        if (record.getTimeUnit() != null) {
            sql.SET("TIME_UNIT = #{timeUnit,jdbcType=VARCHAR}");
        }
        
        if (record.getStockseting() != null) {
            sql.SET("STOCKSETING = #{stockseting,jdbcType=INTEGER}");
        }
        
        if (record.getWarranty() != null) {
            sql.SET("WARRANTY = #{warranty,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("PRO_ID = #{proId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}