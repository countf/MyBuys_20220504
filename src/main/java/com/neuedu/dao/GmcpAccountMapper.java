package com.neuedu.dao;

import com.neuedu.entity.GmcpAccount;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface GmcpAccountMapper {
    @Delete({
        "delete from gmcp$account",
        "where buyer_id = #{buyerId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer buyerId);

    @Insert({
        "insert into gmcp$account (buyer_id, account_name, ",
        "email, password, ",
        "active_time, is_active, ",
        "status, create_by, ",
        "create_time, last_update_by, ",
        "last_update_time, account_type, ",
        "hold_order_time, auto_pay_status)",
        "values (#{buyerId,jdbcType=INTEGER}, #{accountName,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{activeTime,jdbcType=TIMESTAMP}, #{isActive,jdbcType=CHAR}, ",
        "#{status,jdbcType=TINYINT}, #{createBy,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{lastUpdateBy,jdbcType=VARCHAR}, ",
        "#{lastUpdateTime,jdbcType=TIMESTAMP}, #{accountType,jdbcType=INTEGER}, ",
        "#{holdOrderTime,jdbcType=CHAR}, #{autoPayStatus,jdbcType=VARCHAR})"
    })
    int insert(GmcpAccount record);

    @InsertProvider(type=GmcpAccountSqlProvider.class, method="insertSelective")
    int insertSelective(GmcpAccount record);

    @Select({
        "select",
        "buyer_id, account_name, email, password, active_time, is_active, status, create_by, ",
        "create_time, last_update_by, last_update_time, account_type, hold_order_time, ",
        "auto_pay_status",
        "from gmcp$account",
        "where buyer_id = #{buyerId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="buyer_id", property="buyerId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="account_name", property="accountName", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="active_time", property="activeTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_active", property="isActive", jdbcType=JdbcType.CHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="create_by", property="createBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_update_by", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_update_time", property="lastUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="account_type", property="accountType", jdbcType=JdbcType.INTEGER),
        @Result(column="hold_order_time", property="holdOrderTime", jdbcType=JdbcType.CHAR),
        @Result(column="auto_pay_status", property="autoPayStatus", jdbcType=JdbcType.VARCHAR)
    })
    GmcpAccount selectByPrimaryKey(Integer buyerId);

    @UpdateProvider(type=GmcpAccountSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(GmcpAccount record);

    @Update({
        "update gmcp$account",
        "set account_name = #{accountName,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "active_time = #{activeTime,jdbcType=TIMESTAMP},",
          "is_active = #{isActive,jdbcType=CHAR},",
          "status = #{status,jdbcType=TINYINT},",
          "create_by = #{createBy,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "last_update_by = #{lastUpdateBy,jdbcType=VARCHAR},",
          "last_update_time = #{lastUpdateTime,jdbcType=TIMESTAMP},",
          "account_type = #{accountType,jdbcType=INTEGER},",
          "hold_order_time = #{holdOrderTime,jdbcType=CHAR},",
          "auto_pay_status = #{autoPayStatus,jdbcType=VARCHAR}",
        "where buyer_id = #{buyerId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(GmcpAccount record);
}