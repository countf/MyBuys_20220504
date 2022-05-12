package com.neuedu.dao;

import com.neuedu.entity.DsrDropshipper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface DsrDropshipperMapper {
    @Delete({
        "delete from dsr_dropshipper",
        "where DSR_ID = #{dsrId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer dsrId);

    @Insert({
        "insert into dsr_dropshipper (DSR_ID, NAME, ",
        "CREATED_BY, CREATION_DATE, ",
        "LAST_UPDATE_BY, LAST_UPDATE_DATE, ",
        "CALL_CNT, REMARK, ",
        "STS_CD, REGISTER_DATE)",
        "values (#{dsrId,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{createdBy,jdbcType=VARCHAR}, #{creationDate,jdbcType=TIMESTAMP}, ",
        "#{lastUpdateBy,jdbcType=VARCHAR}, #{lastUpdateDate,jdbcType=TIMESTAMP}, ",
        "#{callCnt,jdbcType=INTEGER}, #{remark,jdbcType=VARCHAR}, ",
        "#{stsCd,jdbcType=CHAR}, #{registerDate,jdbcType=TIMESTAMP})"
    })
    int insert(DsrDropshipper record);

    @InsertProvider(type=DsrDropshipperSqlProvider.class, method="insertSelective")
    int insertSelective(DsrDropshipper record);

    @Select({
        "select",
        "DSR_ID, NAME, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, CALL_CNT, ",
        "REMARK, STS_CD, REGISTER_DATE",
        "from dsr_dropshipper",
        "where DSR_ID = #{dsrId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="DSR_ID", property="dsrId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATION_DATE", property="creationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_UPDATE_BY", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATE_DATE", property="lastUpdateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALL_CNT", property="callCnt", jdbcType=JdbcType.INTEGER),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.CHAR),
        @Result(column="REGISTER_DATE", property="registerDate", jdbcType=JdbcType.TIMESTAMP)
    })
    DsrDropshipper selectByPrimaryKey(Integer dsrId);

    @UpdateProvider(type=DsrDropshipperSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DsrDropshipper record);

    @Update({
        "update dsr_dropshipper",
        "set NAME = #{name,jdbcType=VARCHAR},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR},",
          "REGISTER_DATE = #{registerDate,jdbcType=TIMESTAMP}",
        "where DSR_ID = #{dsrId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(DsrDropshipper record);
}