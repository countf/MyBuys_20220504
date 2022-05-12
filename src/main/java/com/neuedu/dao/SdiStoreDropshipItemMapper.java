package com.neuedu.dao;

import com.neuedu.entity.SdiStoreDropshipItem;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface SdiStoreDropshipItemMapper {
    @Delete({
        "delete from sdi_store_dropship_item",
        "where DIL_ID = #{dilId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer dilId);

    @Insert({
        "insert into sdi_store_dropship_item (DIL_ID, PRO_ID, ",
        "STR_ID, STORE_RETENTION, ",
        "DROPSHIP_PRICE, DROPSHIP_STATUS, ",
        "CREATED_BY, CREATION_DATE, ",
        "LAST_UPDATE_BY, CALL_CNT, ",
        "LAST_UPDATE_DATE, REMARK, ",
        "STS_CD, SHELF_STOCK, ",
        "PREFER_DATE)",
        "values (#{dilId,jdbcType=INTEGER}, #{proId,jdbcType=INTEGER}, ",
        "#{strId,jdbcType=INTEGER}, #{storeRetention,jdbcType=INTEGER}, ",
        "#{dropshipPrice,jdbcType=DECIMAL}, #{dropshipStatus,jdbcType=VARCHAR}, ",
        "#{createdBy,jdbcType=VARCHAR}, #{creationDate,jdbcType=TIMESTAMP}, ",
        "#{lastUpdateBy,jdbcType=VARCHAR}, #{callCnt,jdbcType=INTEGER}, ",
        "#{lastUpdateDate,jdbcType=TIMESTAMP}, #{remark,jdbcType=VARCHAR}, ",
        "#{stsCd,jdbcType=CHAR}, #{shelfStock,jdbcType=INTEGER}, ",
        "#{preferDate,jdbcType=TIMESTAMP})"
    })
    int insert(SdiStoreDropshipItem record);

    @InsertProvider(type=SdiStoreDropshipItemSqlProvider.class, method="insertSelective")
    int insertSelective(SdiStoreDropshipItem record);

    @Select({
        "select",
        "DIL_ID, PRO_ID, STR_ID, STORE_RETENTION, DROPSHIP_PRICE, DROPSHIP_STATUS, CREATED_BY, ",
        "CREATION_DATE, LAST_UPDATE_BY, CALL_CNT, LAST_UPDATE_DATE, REMARK, STS_CD, SHELF_STOCK, ",
        "PREFER_DATE",
        "from sdi_store_dropship_item",
        "where DIL_ID = #{dilId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="DIL_ID", property="dilId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="PRO_ID", property="proId", jdbcType=JdbcType.INTEGER),
        @Result(column="STR_ID", property="strId", jdbcType=JdbcType.INTEGER),
        @Result(column="STORE_RETENTION", property="storeRetention", jdbcType=JdbcType.INTEGER),
        @Result(column="DROPSHIP_PRICE", property="dropshipPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="DROPSHIP_STATUS", property="dropshipStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATION_DATE", property="creationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_UPDATE_BY", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="CALL_CNT", property="callCnt", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_UPDATE_DATE", property="lastUpdateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.CHAR),
        @Result(column="SHELF_STOCK", property="shelfStock", jdbcType=JdbcType.INTEGER),
        @Result(column="PREFER_DATE", property="preferDate", jdbcType=JdbcType.TIMESTAMP)
    })
    SdiStoreDropshipItem selectByPrimaryKey(Integer dilId);

    @UpdateProvider(type=SdiStoreDropshipItemSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SdiStoreDropshipItem record);

    @Update({
        "update sdi_store_dropship_item",
        "set PRO_ID = #{proId,jdbcType=INTEGER},",
          "STR_ID = #{strId,jdbcType=INTEGER},",
          "STORE_RETENTION = #{storeRetention,jdbcType=INTEGER},",
          "DROPSHIP_PRICE = #{dropshipPrice,jdbcType=DECIMAL},",
          "DROPSHIP_STATUS = #{dropshipStatus,jdbcType=VARCHAR},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR},",
          "SHELF_STOCK = #{shelfStock,jdbcType=INTEGER},",
          "PREFER_DATE = #{preferDate,jdbcType=TIMESTAMP}",
        "where DIL_ID = #{dilId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SdiStoreDropshipItem record);
}