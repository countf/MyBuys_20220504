package com.neuedu.dao;

import com.neuedu.entity.CdmCodeMaster;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface CdmCodeMasterMapper {
    @Delete({
        "delete from cdm_code_master",
        "where CDM_ID = #{cdmId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer cdmId);

    @Insert({
        "insert into cdm_code_master (CDM_ID, CODE_TYPE, ",
        "DESCRIPTION, TYPE_CD, ",
        "CODE_VAL, SEQ_NO, ",
        "CREATED_BY, CREATION_DATE, ",
        "LAST_UPDATE_BY, LAST_UPDATE_DATE, ",
        "CALL_CNT, REMARK, ",
        "STS_CD)",
        "values (#{cdmId,jdbcType=INTEGER}, #{codeType,jdbcType=VARCHAR}, ",
        "#{description,jdbcType=VARCHAR}, #{typeCd,jdbcType=VARCHAR}, ",
        "#{codeVal,jdbcType=VARCHAR}, #{seqNo,jdbcType=INTEGER}, ",
        "#{createdBy,jdbcType=VARCHAR}, #{creationDate,jdbcType=TIMESTAMP}, ",
        "#{lastUpdateBy,jdbcType=VARCHAR}, #{lastUpdateDate,jdbcType=TIMESTAMP}, ",
        "#{callCnt,jdbcType=INTEGER}, #{remark,jdbcType=VARCHAR}, ",
        "#{stsCd,jdbcType=CHAR})"
    })
    int insert(CdmCodeMaster record);

    @InsertProvider(type=CdmCodeMasterSqlProvider.class, method="insertSelective")
    int insertSelective(CdmCodeMaster record);

    @Select({
        "select",
        "CDM_ID, CODE_TYPE, DESCRIPTION, TYPE_CD, CODE_VAL, SEQ_NO, CREATED_BY, CREATION_DATE, ",
        "LAST_UPDATE_BY, LAST_UPDATE_DATE, CALL_CNT, REMARK, STS_CD",
        "from cdm_code_master",
        "where CDM_ID = #{cdmId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="CDM_ID", property="cdmId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE_TYPE", property="codeType", jdbcType=JdbcType.VARCHAR),
        @Result(column="DESCRIPTION", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="TYPE_CD", property="typeCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="CODE_VAL", property="codeVal", jdbcType=JdbcType.VARCHAR),
        @Result(column="SEQ_NO", property="seqNo", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATION_DATE", property="creationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_UPDATE_BY", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATE_DATE", property="lastUpdateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALL_CNT", property="callCnt", jdbcType=JdbcType.INTEGER),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.CHAR)
    })
    CdmCodeMaster selectByPrimaryKey(Integer cdmId);

    @UpdateProvider(type=CdmCodeMasterSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CdmCodeMaster record);

    @Update({
        "update cdm_code_master",
        "set CODE_TYPE = #{codeType,jdbcType=VARCHAR},",
          "DESCRIPTION = #{description,jdbcType=VARCHAR},",
          "TYPE_CD = #{typeCd,jdbcType=VARCHAR},",
          "CODE_VAL = #{codeVal,jdbcType=VARCHAR},",
          "SEQ_NO = #{seqNo,jdbcType=INTEGER},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR}",
        "where CDM_ID = #{cdmId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CdmCodeMaster record);
}