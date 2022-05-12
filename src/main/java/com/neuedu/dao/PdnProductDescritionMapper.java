package com.neuedu.dao;

import com.neuedu.entity.PdnProductDescrition;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface PdnProductDescritionMapper {
    @Delete({
        "delete from pdn_product_descrition",
        "where PDN_ID = #{pdnId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer pdnId);

    @Insert({
        "insert into pdn_product_descrition (PDN_ID, PRO_ID, ",
        "TYPE_CD, CREATED_BY, ",
        "CREATION_DATE, LAST_UPDATE_BY, ",
        "LAST_UPDATE_DATE, CALL_CNT, ",
        "REMARK, STS_CD, DESCRITION)",
        "values (#{pdnId,jdbcType=INTEGER}, #{proId,jdbcType=INTEGER}, ",
        "#{typeCd,jdbcType=VARCHAR}, #{createdBy,jdbcType=VARCHAR}, ",
        "#{creationDate,jdbcType=TIMESTAMP}, #{lastUpdateBy,jdbcType=VARCHAR}, ",
        "#{lastUpdateDate,jdbcType=TIMESTAMP}, #{callCnt,jdbcType=INTEGER}, ",
        "#{remark,jdbcType=VARCHAR}, #{stsCd,jdbcType=CHAR}, #{descrition,jdbcType=LONGVARCHAR})"
    })
    int insert(PdnProductDescrition record);

    @InsertProvider(type=PdnProductDescritionSqlProvider.class, method="insertSelective")
    int insertSelective(PdnProductDescrition record);

    @Select({
        "select",
        "PDN_ID, PRO_ID, TYPE_CD, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, ",
        "CALL_CNT, REMARK, STS_CD, DESCRITION",
        "from pdn_product_descrition",
        "where PDN_ID = #{pdnId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="PDN_ID", property="pdnId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="PRO_ID", property="proId", jdbcType=JdbcType.INTEGER),
        @Result(column="TYPE_CD", property="typeCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATION_DATE", property="creationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_UPDATE_BY", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATE_DATE", property="lastUpdateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALL_CNT", property="callCnt", jdbcType=JdbcType.INTEGER),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.CHAR),
        @Result(column="DESCRITION", property="descrition", jdbcType=JdbcType.LONGVARCHAR)
    })
    PdnProductDescrition selectByPrimaryKey(Integer pdnId);

    @UpdateProvider(type=PdnProductDescritionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PdnProductDescrition record);

    @Update({
        "update pdn_product_descrition",
        "set PRO_ID = #{proId,jdbcType=INTEGER},",
          "TYPE_CD = #{typeCd,jdbcType=VARCHAR},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR},",
          "DESCRITION = #{descrition,jdbcType=LONGVARCHAR}",
        "where PDN_ID = #{pdnId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(PdnProductDescrition record);

    @Update({
        "update pdn_product_descrition",
        "set PRO_ID = #{proId,jdbcType=INTEGER},",
          "TYPE_CD = #{typeCd,jdbcType=VARCHAR},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR}",
        "where PDN_ID = #{pdnId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PdnProductDescrition record);
}