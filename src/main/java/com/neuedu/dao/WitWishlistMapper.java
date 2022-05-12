package com.neuedu.dao;

import com.neuedu.entity.WitWishlist;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface WitWishlistMapper {
    @Delete({
        "delete from wit_wishlist",
        "where WIT_ID = #{witId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer witId);

    @Insert({
        "insert into wit_wishlist (WIT_ID, DSR_ID, ",
        "PRO_ID, CREATED_BY, ",
        "CREATION_DATE, LAST_UPDATE_BY, ",
        "LAST_UPDATE_DATE, CALL_CNT, ",
        "REMARK, STS_CD)",
        "values (#{witId,jdbcType=INTEGER}, #{dsrId,jdbcType=INTEGER}, ",
        "#{proId,jdbcType=INTEGER}, #{createdBy,jdbcType=VARCHAR}, ",
        "#{creationDate,jdbcType=TIMESTAMP}, #{lastUpdateBy,jdbcType=VARCHAR}, ",
        "#{lastUpdateDate,jdbcType=TIMESTAMP}, #{callCnt,jdbcType=INTEGER}, ",
        "#{remark,jdbcType=VARCHAR}, #{stsCd,jdbcType=CHAR})"
    })
    int insert(WitWishlist record);

    @InsertProvider(type=WitWishlistSqlProvider.class, method="insertSelective")
    int insertSelective(WitWishlist record);

    @Select({
        "select",
        "WIT_ID, DSR_ID, PRO_ID, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, ",
        "CALL_CNT, REMARK, STS_CD",
        "from wit_wishlist",
        "where WIT_ID = #{witId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="WIT_ID", property="witId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DSR_ID", property="dsrId", jdbcType=JdbcType.INTEGER),
        @Result(column="PRO_ID", property="proId", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATION_DATE", property="creationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_UPDATE_BY", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATE_DATE", property="lastUpdateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALL_CNT", property="callCnt", jdbcType=JdbcType.INTEGER),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.CHAR)
    })
    WitWishlist selectByPrimaryKey(Integer witId);

    @UpdateProvider(type=WitWishlistSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(WitWishlist record);

    @Update({
        "update wit_wishlist",
        "set DSR_ID = #{dsrId,jdbcType=INTEGER},",
          "PRO_ID = #{proId,jdbcType=INTEGER},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR}",
        "where WIT_ID = #{witId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(WitWishlist record);
}