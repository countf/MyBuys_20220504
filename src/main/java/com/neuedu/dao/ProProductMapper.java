package com.neuedu.dao;

import com.neuedu.entity.ProProduct;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface ProProductMapper {
    @Delete({
        "delete from pro_product",
        "where PRO_ID = #{proId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer proId);

    @Insert({
        "insert into pro_product (PRO_ID, SKU_CD, ",
        "BRD_ID, MAN_ID, TITLE, ",
        "UPC, EAN, MODEL, ",
        "WARRANTY_DAY, RETAIL_PRICE, ",
        "CREATED_BY, CREATION_DATE, ",
        "LAST_UPDATE_BY, LAST_UPDATE_DATE, ",
        "CALL_CNT, REMARK, ",
        "STS_CD, MININUM_RETAIL_PRICE, ",
        "REPLENISHMENT_PERIOD, KEY_WORDS, ",
        "TIME_UNIT, STOCKSETING, ",
        "WARRANTY)",
        "values (#{proId,jdbcType=INTEGER}, #{skuCd,jdbcType=VARCHAR}, ",
        "#{brdId,jdbcType=INTEGER}, #{manId,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR}, ",
        "#{upc,jdbcType=VARCHAR}, #{ean,jdbcType=VARCHAR}, #{model,jdbcType=VARCHAR}, ",
        "#{warrantyDay,jdbcType=VARCHAR}, #{retailPrice,jdbcType=DECIMAL}, ",
        "#{createdBy,jdbcType=VARCHAR}, #{creationDate,jdbcType=TIMESTAMP}, ",
        "#{lastUpdateBy,jdbcType=VARCHAR}, #{lastUpdateDate,jdbcType=TIMESTAMP}, ",
        "#{callCnt,jdbcType=INTEGER}, #{remark,jdbcType=VARCHAR}, ",
        "#{stsCd,jdbcType=CHAR}, #{mininumRetailPrice,jdbcType=DECIMAL}, ",
        "#{replenishmentPeriod,jdbcType=INTEGER}, #{keyWords,jdbcType=VARCHAR}, ",
        "#{timeUnit,jdbcType=VARCHAR}, #{stockseting,jdbcType=INTEGER}, ",
        "#{warranty,jdbcType=LONGVARCHAR})"
    })
    int insert(ProProduct record);

    @InsertProvider(type=ProProductSqlProvider.class, method="insertSelective")
    int insertSelective(ProProduct record);

    @Select({
        "select",
        "PRO_ID, SKU_CD, BRD_ID, MAN_ID, TITLE, UPC, EAN, MODEL, WARRANTY_DAY, RETAIL_PRICE, ",
        "CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, CALL_CNT, REMARK, ",
        "STS_CD, MININUM_RETAIL_PRICE, REPLENISHMENT_PERIOD, KEY_WORDS, TIME_UNIT, STOCKSETING, ",
        "WARRANTY",
        "from pro_product",
        "where PRO_ID = #{proId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="PRO_ID", property="proId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="SKU_CD", property="skuCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="BRD_ID", property="brdId", jdbcType=JdbcType.INTEGER),
        @Result(column="MAN_ID", property="manId", jdbcType=JdbcType.INTEGER),
        @Result(column="TITLE", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="UPC", property="upc", jdbcType=JdbcType.VARCHAR),
        @Result(column="EAN", property="ean", jdbcType=JdbcType.VARCHAR),
        @Result(column="MODEL", property="model", jdbcType=JdbcType.VARCHAR),
        @Result(column="WARRANTY_DAY", property="warrantyDay", jdbcType=JdbcType.VARCHAR),
        @Result(column="RETAIL_PRICE", property="retailPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATION_DATE", property="creationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_UPDATE_BY", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATE_DATE", property="lastUpdateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALL_CNT", property="callCnt", jdbcType=JdbcType.INTEGER),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.CHAR),
        @Result(column="MININUM_RETAIL_PRICE", property="mininumRetailPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="REPLENISHMENT_PERIOD", property="replenishmentPeriod", jdbcType=JdbcType.INTEGER),
        @Result(column="KEY_WORDS", property="keyWords", jdbcType=JdbcType.VARCHAR),
        @Result(column="TIME_UNIT", property="timeUnit", jdbcType=JdbcType.VARCHAR),
        @Result(column="STOCKSETING", property="stockseting", jdbcType=JdbcType.INTEGER),
        @Result(column="WARRANTY", property="warranty", jdbcType=JdbcType.LONGVARCHAR)
    })
    ProProduct selectByPrimaryKey(Integer proId);

    @UpdateProvider(type=ProProductSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ProProduct record);

    @Update({
        "update pro_product",
        "set SKU_CD = #{skuCd,jdbcType=VARCHAR},",
          "BRD_ID = #{brdId,jdbcType=INTEGER},",
          "MAN_ID = #{manId,jdbcType=INTEGER},",
          "TITLE = #{title,jdbcType=VARCHAR},",
          "UPC = #{upc,jdbcType=VARCHAR},",
          "EAN = #{ean,jdbcType=VARCHAR},",
          "MODEL = #{model,jdbcType=VARCHAR},",
          "WARRANTY_DAY = #{warrantyDay,jdbcType=VARCHAR},",
          "RETAIL_PRICE = #{retailPrice,jdbcType=DECIMAL},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR},",
          "MININUM_RETAIL_PRICE = #{mininumRetailPrice,jdbcType=DECIMAL},",
          "REPLENISHMENT_PERIOD = #{replenishmentPeriod,jdbcType=INTEGER},",
          "KEY_WORDS = #{keyWords,jdbcType=VARCHAR},",
          "TIME_UNIT = #{timeUnit,jdbcType=VARCHAR},",
          "STOCKSETING = #{stockseting,jdbcType=INTEGER},",
          "WARRANTY = #{warranty,jdbcType=LONGVARCHAR}",
        "where PRO_ID = #{proId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(ProProduct record);

    @Update({
        "update pro_product",
        "set SKU_CD = #{skuCd,jdbcType=VARCHAR},",
          "BRD_ID = #{brdId,jdbcType=INTEGER},",
          "MAN_ID = #{manId,jdbcType=INTEGER},",
          "TITLE = #{title,jdbcType=VARCHAR},",
          "UPC = #{upc,jdbcType=VARCHAR},",
          "EAN = #{ean,jdbcType=VARCHAR},",
          "MODEL = #{model,jdbcType=VARCHAR},",
          "WARRANTY_DAY = #{warrantyDay,jdbcType=VARCHAR},",
          "RETAIL_PRICE = #{retailPrice,jdbcType=DECIMAL},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR},",
          "MININUM_RETAIL_PRICE = #{mininumRetailPrice,jdbcType=DECIMAL},",
          "REPLENISHMENT_PERIOD = #{replenishmentPeriod,jdbcType=INTEGER},",
          "KEY_WORDS = #{keyWords,jdbcType=VARCHAR},",
          "TIME_UNIT = #{timeUnit,jdbcType=VARCHAR},",
          "STOCKSETING = #{stockseting,jdbcType=INTEGER}",
        "where PRO_ID = #{proId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ProProduct record);
}