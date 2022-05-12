package com.neuedu.dao;

import com.neuedu.entity.MorMonitorResult;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface MorMonitorResultMapper {
    @Delete({
        "delete from mor_monitor_result",
        "where MOR_ID = #{morId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer morId);

    @Insert({
        "insert into mor_monitor_result (MOR_ID, CLASS_NAME, ",
        "JSON_STRING, CREATE_DATE, ",
        "CREATE_BY, UPDATE_DATE, ",
        "UPDATE_BY, REMARK, ",
        "STS_CD)",
        "values (#{morId,jdbcType=INTEGER}, #{className,jdbcType=VARCHAR}, ",
        "#{jsonString,jdbcType=VARCHAR}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{createBy,jdbcType=VARCHAR}, #{updateDate,jdbcType=TIMESTAMP}, ",
        "#{updateBy,jdbcType=VARCHAR}, #{remark,jdbcType=VARCHAR}, ",
        "#{stsCd,jdbcType=VARCHAR})"
    })
    int insert(MorMonitorResult record);

    @InsertProvider(type=MorMonitorResultSqlProvider.class, method="insertSelective")
    int insertSelective(MorMonitorResult record);

    @Select({
        "select",
        "MOR_ID, CLASS_NAME, JSON_STRING, CREATE_DATE, CREATE_BY, UPDATE_DATE, UPDATE_BY, ",
        "REMARK, STS_CD",
        "from mor_monitor_result",
        "where MOR_ID = #{morId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="MOR_ID", property="morId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CLASS_NAME", property="className", jdbcType=JdbcType.VARCHAR),
        @Result(column="JSON_STRING", property="jsonString", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATE_DATE", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATE_BY", property="createBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="UPDATE_DATE", property="updateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_BY", property="updateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.VARCHAR)
    })
    MorMonitorResult selectByPrimaryKey(Integer morId);

    @UpdateProvider(type=MorMonitorResultSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MorMonitorResult record);

    @Update({
        "update mor_monitor_result",
        "set CLASS_NAME = #{className,jdbcType=VARCHAR},",
          "JSON_STRING = #{jsonString,jdbcType=VARCHAR},",
          "CREATE_DATE = #{createDate,jdbcType=TIMESTAMP},",
          "CREATE_BY = #{createBy,jdbcType=VARCHAR},",
          "UPDATE_DATE = #{updateDate,jdbcType=TIMESTAMP},",
          "UPDATE_BY = #{updateBy,jdbcType=VARCHAR},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=VARCHAR}",
        "where MOR_ID = #{morId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MorMonitorResult record);
}