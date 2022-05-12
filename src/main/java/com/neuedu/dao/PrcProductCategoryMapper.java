package com.neuedu.dao;

import com.neuedu.entity.PrcProductCategory;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface PrcProductCategoryMapper {
    @Delete({
        "delete from prc_product_category",
        "where PRC_ID = #{prcId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer prcId);

    @Insert({
        "insert into prc_product_category (PRC_ID, PRO_ID, ",
        "CATEGORY_ID, CATEGORY_NAME, ",
        "CATEGORY_PATH, CREATED_BY, ",
        "CREATION_DATE, LAST_UPDATE_BY, ",
        "LAST_UPDATE_DATE, CALL_CNT, ",
        "REMARK, STS_CD, PLATEFORM_TYPE)",
        "values (#{prcId,jdbcType=INTEGER}, #{proId,jdbcType=INTEGER}, ",
        "#{categoryId,jdbcType=VARCHAR}, #{categoryName,jdbcType=VARCHAR}, ",
        "#{categoryPath,jdbcType=VARCHAR}, #{createdBy,jdbcType=VARCHAR}, ",
        "#{creationDate,jdbcType=TIMESTAMP}, #{lastUpdateBy,jdbcType=VARCHAR}, ",
        "#{lastUpdateDate,jdbcType=TIMESTAMP}, #{callCnt,jdbcType=INTEGER}, ",
        "#{remark,jdbcType=VARCHAR}, #{stsCd,jdbcType=CHAR}, #{plateformType,jdbcType=VARCHAR})"
    })
    int insert(PrcProductCategory record);

    @InsertProvider(type=PrcProductCategorySqlProvider.class, method="insertSelective")
    int insertSelective(PrcProductCategory record);

    @Select({
        "select",
        "PRC_ID, PRO_ID, CATEGORY_ID, CATEGORY_NAME, CATEGORY_PATH, CREATED_BY, CREATION_DATE, ",
        "LAST_UPDATE_BY, LAST_UPDATE_DATE, CALL_CNT, REMARK, STS_CD, PLATEFORM_TYPE",
        "from prc_product_category",
        "where PRC_ID = #{prcId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="PRC_ID", property="prcId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="PRO_ID", property="proId", jdbcType=JdbcType.INTEGER),
        @Result(column="CATEGORY_ID", property="categoryId", jdbcType=JdbcType.VARCHAR),
        @Result(column="CATEGORY_NAME", property="categoryName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CATEGORY_PATH", property="categoryPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATION_DATE", property="creationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_UPDATE_BY", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATE_DATE", property="lastUpdateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALL_CNT", property="callCnt", jdbcType=JdbcType.INTEGER),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.CHAR),
        @Result(column="PLATEFORM_TYPE", property="plateformType", jdbcType=JdbcType.VARCHAR)
    })
    PrcProductCategory selectByPrimaryKey(Integer prcId);

    @UpdateProvider(type=PrcProductCategorySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PrcProductCategory record);

    @Update({
        "update prc_product_category",
        "set PRO_ID = #{proId,jdbcType=INTEGER},",
          "CATEGORY_ID = #{categoryId,jdbcType=VARCHAR},",
          "CATEGORY_NAME = #{categoryName,jdbcType=VARCHAR},",
          "CATEGORY_PATH = #{categoryPath,jdbcType=VARCHAR},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR},",
          "PLATEFORM_TYPE = #{plateformType,jdbcType=VARCHAR}",
        "where PRC_ID = #{prcId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PrcProductCategory record);
}