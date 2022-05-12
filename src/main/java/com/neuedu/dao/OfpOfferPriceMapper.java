package com.neuedu.dao;

import com.neuedu.entity.OfpOfferPrice;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface OfpOfferPriceMapper {
    @Delete({
        "delete from ofp_offer_price",
        "where OFP_ID = #{ofpId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer ofpId);

    @Insert({
        "insert into ofp_offer_price (OFP_ID, MAN_ID, ",
        "EFFETIVE_START_DATE, EFFECTIVE_END_DATE, ",
        "PRO_ID, PRICE, TYPE_CD, ",
        "DSR_ID, CREATED_BY, ",
        "CREATION_DATE, LAST_UPDATE_BY, ",
        "LAST_UPDATE_DATE, CALL_CNT, ",
        "REMARK, STS_CD, PERIOD)",
        "values (#{ofpId,jdbcType=INTEGER}, #{manId,jdbcType=INTEGER}, ",
        "#{effetiveStartDate,jdbcType=TIMESTAMP}, #{effectiveEndDate,jdbcType=TIMESTAMP}, ",
        "#{proId,jdbcType=INTEGER}, #{price,jdbcType=DECIMAL}, #{typeCd,jdbcType=VARCHAR}, ",
        "#{dsrId,jdbcType=INTEGER}, #{createdBy,jdbcType=VARCHAR}, ",
        "#{creationDate,jdbcType=TIMESTAMP}, #{lastUpdateBy,jdbcType=VARCHAR}, ",
        "#{lastUpdateDate,jdbcType=TIMESTAMP}, #{callCnt,jdbcType=INTEGER}, ",
        "#{remark,jdbcType=VARCHAR}, #{stsCd,jdbcType=CHAR}, #{period,jdbcType=VARCHAR})"
    })
    int insert(OfpOfferPrice record);

    @InsertProvider(type=OfpOfferPriceSqlProvider.class, method="insertSelective")
    int insertSelective(OfpOfferPrice record);

    @Select({
        "select",
        "OFP_ID, MAN_ID, EFFETIVE_START_DATE, EFFECTIVE_END_DATE, PRO_ID, PRICE, TYPE_CD, ",
        "DSR_ID, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, CALL_CNT, ",
        "REMARK, STS_CD, PERIOD",
        "from ofp_offer_price",
        "where OFP_ID = #{ofpId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="OFP_ID", property="ofpId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="MAN_ID", property="manId", jdbcType=JdbcType.INTEGER),
        @Result(column="EFFETIVE_START_DATE", property="effetiveStartDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="EFFECTIVE_END_DATE", property="effectiveEndDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="PRO_ID", property="proId", jdbcType=JdbcType.INTEGER),
        @Result(column="PRICE", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="TYPE_CD", property="typeCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="DSR_ID", property="dsrId", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATION_DATE", property="creationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_UPDATE_BY", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATE_DATE", property="lastUpdateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALL_CNT", property="callCnt", jdbcType=JdbcType.INTEGER),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.CHAR),
        @Result(column="PERIOD", property="period", jdbcType=JdbcType.VARCHAR)
    })
    OfpOfferPrice selectByPrimaryKey(Integer ofpId);

    @UpdateProvider(type=OfpOfferPriceSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(OfpOfferPrice record);

    @Update({
        "update ofp_offer_price",
        "set MAN_ID = #{manId,jdbcType=INTEGER},",
          "EFFETIVE_START_DATE = #{effetiveStartDate,jdbcType=TIMESTAMP},",
          "EFFECTIVE_END_DATE = #{effectiveEndDate,jdbcType=TIMESTAMP},",
          "PRO_ID = #{proId,jdbcType=INTEGER},",
          "PRICE = #{price,jdbcType=DECIMAL},",
          "TYPE_CD = #{typeCd,jdbcType=VARCHAR},",
          "DSR_ID = #{dsrId,jdbcType=INTEGER},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR},",
          "PERIOD = #{period,jdbcType=VARCHAR}",
        "where OFP_ID = #{ofpId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(OfpOfferPrice record);
}