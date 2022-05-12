package com.neuedu.dao;

import com.neuedu.entity.SpaSpecificAttribute;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface SpaSpecificAttributeMapper {
    @Delete({
        "delete from spa_specific_attribute",
        "where SPA_ID = #{spaId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer spaId);

    @Insert({
        "insert into spa_specific_attribute (SPA_ID, PRO_ID, ",
        "NAME_EN, NAME_CN, ",
        "SEQ_NO, CREATED_BY, ",
        "CREATION_DATE, LAST_UPDATE_BY, ",
        "LAST_UPDATE_DATE, CALL_CNT, ",
        "REMARK, STS_CD)",
        "values (#{spaId,jdbcType=INTEGER}, #{proId,jdbcType=INTEGER}, ",
        "#{nameEn,jdbcType=VARCHAR}, #{nameCn,jdbcType=VARCHAR}, ",
        "#{seqNo,jdbcType=INTEGER}, #{createdBy,jdbcType=VARCHAR}, ",
        "#{creationDate,jdbcType=TIMESTAMP}, #{lastUpdateBy,jdbcType=VARCHAR}, ",
        "#{lastUpdateDate,jdbcType=TIMESTAMP}, #{callCnt,jdbcType=INTEGER}, ",
        "#{remark,jdbcType=VARCHAR}, #{stsCd,jdbcType=CHAR})"
    })
    int insert(SpaSpecificAttribute record);

    @InsertProvider(type=SpaSpecificAttributeSqlProvider.class, method="insertSelective")
    int insertSelective(SpaSpecificAttribute record);

    @Select({
        "select",
        "SPA_ID, PRO_ID, NAME_EN, NAME_CN, SEQ_NO, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, ",
        "LAST_UPDATE_DATE, CALL_CNT, REMARK, STS_CD",
        "from spa_specific_attribute",
        "where SPA_ID = #{spaId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="SPA_ID", property="spaId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="PRO_ID", property="proId", jdbcType=JdbcType.INTEGER),
        @Result(column="NAME_EN", property="nameEn", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME_CN", property="nameCn", jdbcType=JdbcType.VARCHAR),
        @Result(column="SEQ_NO", property="seqNo", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATION_DATE", property="creationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_UPDATE_BY", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATE_DATE", property="lastUpdateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALL_CNT", property="callCnt", jdbcType=JdbcType.INTEGER),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.CHAR)
    })
    SpaSpecificAttribute selectByPrimaryKey(Integer spaId);

    @UpdateProvider(type=SpaSpecificAttributeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SpaSpecificAttribute record);

    @Update({
        "update spa_specific_attribute",
        "set PRO_ID = #{proId,jdbcType=INTEGER},",
          "NAME_EN = #{nameEn,jdbcType=VARCHAR},",
          "NAME_CN = #{nameCn,jdbcType=VARCHAR},",
          "SEQ_NO = #{seqNo,jdbcType=INTEGER},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR}",
        "where SPA_ID = #{spaId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SpaSpecificAttribute record);
}