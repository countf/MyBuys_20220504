package com.neuedu.dao;

import com.neuedu.entity.SysUser;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface SysUserMapper {
    @Delete({
        "delete from sys_user",
        "where USER_ID = #{userId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer userId);

    @Insert({
        "insert into sys_user (USER_ID, USERNAME, ",
        "PASSWORD, NAME, ",
        "RIGHTS, ROLE_ID, ",
        "LAST_LOGIN, IP, STATUS, ",
        "BZ, SKIN, EMAIL, ",
        "NUMBER, PHONE, MAN_BUYER_ID)",
        "values (#{userId,jdbcType=INTEGER}, #{username,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{rights,jdbcType=VARCHAR}, #{roleId,jdbcType=VARCHAR}, ",
        "#{lastLogin,jdbcType=VARCHAR}, #{ip,jdbcType=VARCHAR}, #{status,jdbcType=VARCHAR}, ",
        "#{bz,jdbcType=VARCHAR}, #{skin,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, ",
        "#{number,jdbcType=VARCHAR}, #{phone,jdbcType=VARCHAR}, #{manBuyerId,jdbcType=INTEGER})"
    })
    int insert(SysUser record);

    @InsertProvider(type=SysUserSqlProvider.class, method="insertSelective")
    int insertSelective(SysUser record);


    @Insert({
            "insert into sys_user (USERNAME, ",
            "PASSWORD, EMAIL,NAME,PHONE,MAN_BUYER_ID,ROLE_ID)",
            "values (#{username,jdbcType=VARCHAR}, ",
            "#{password,jdbcType=VARCHAR},#{email,jdbcType=VARCHAR},#{name,jdbcType=VARCHAR},",
            "#{phone,jdbcType=VARCHAR}, #{manBuyerId,jdbcType=INTEGER},'2')"
    })
    int register(SysUser record);

    @Select({
        "select",
        "USER_ID, USERNAME, PASSWORD, NAME, RIGHTS, ROLE_ID, LAST_LOGIN, IP, STATUS, ",
        "BZ, SKIN, EMAIL, NUMBER, PHONE, MAN_BUYER_ID",
        "from sys_user",
        "where USER_ID = #{userId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="USERNAME", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="PASSWORD", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="RIGHTS", property="rights", jdbcType=JdbcType.VARCHAR),
        @Result(column="ROLE_ID", property="roleId", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_LOGIN", property="lastLogin", jdbcType=JdbcType.VARCHAR),
        @Result(column="IP", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="BZ", property="bz", jdbcType=JdbcType.VARCHAR),
        @Result(column="SKIN", property="skin", jdbcType=JdbcType.VARCHAR),
        @Result(column="EMAIL", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="NUMBER", property="number", jdbcType=JdbcType.VARCHAR),
        @Result(column="PHONE", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="MAN_BUYER_ID", property="manBuyerId", jdbcType=JdbcType.INTEGER)
    })
    SysUser selectByPrimaryKey(Integer userId);



    @Select({
            "select",
            "USER_ID, USERNAME, NAME, RIGHTS, ROLE_ID, LAST_LOGIN, IP, STATUS,  ",
            "BZ, SKIN, EMAIL, NUMBER, PHONE, MAN_BUYER_ID ",
            "from sys_user ",
            "where USERNAME=#{uname,jdbcType=VARCHAR} and PASSWORD = #{pwd,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="USER_ID", property="userId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="USERNAME", property="username", jdbcType=JdbcType.VARCHAR),
            @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
            @Result(column="RIGHTS", property="rights", jdbcType=JdbcType.VARCHAR),
            @Result(column="ROLE_ID", property="roleId", jdbcType=JdbcType.VARCHAR),
            @Result(column="LAST_LOGIN", property="lastLogin", jdbcType=JdbcType.VARCHAR),
            @Result(column="IP", property="ip", jdbcType=JdbcType.VARCHAR),
            @Result(column="STATUS", property="status", jdbcType=JdbcType.VARCHAR),
            @Result(column="BZ", property="bz", jdbcType=JdbcType.VARCHAR),
            @Result(column="SKIN", property="skin", jdbcType=JdbcType.VARCHAR),
            @Result(column="EMAIL", property="email", jdbcType=JdbcType.VARCHAR),
            @Result(column="NUMBER", property="number", jdbcType=JdbcType.VARCHAR),
            @Result(column="PHONE", property="phone", jdbcType=JdbcType.VARCHAR),
            @Result(column="MAN_BUYER_ID", property="manBuyerId", jdbcType=JdbcType.INTEGER)
    })
    SysUser selectByUnameAndPwd(@Param("uname") String uname, @Param("pwd") String pwd);





    @UpdateProvider(type=SysUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysUser record);


    @Update({
            "update sys_user",
            "set LAST_LOGIN = now(),",
            "IP = #{ip,jdbcType=VARCHAR} ",
            "where USER_ID = #{userId,jdbcType=INTEGER} "
    })
    int updateLoginInfo(SysUser record);

    @Update({
        "update sys_user",
        "set USERNAME = #{username,jdbcType=VARCHAR},",
          "PASSWORD = #{password,jdbcType=VARCHAR},",
          "NAME = #{name,jdbcType=VARCHAR},",
          "RIGHTS = #{rights,jdbcType=VARCHAR},",
          "ROLE_ID = #{roleId,jdbcType=VARCHAR},",
          "LAST_LOGIN = #{lastLogin,jdbcType=VARCHAR},",
          "IP = #{ip,jdbcType=VARCHAR},",
          "STATUS = #{status,jdbcType=VARCHAR},",
          "BZ = #{bz,jdbcType=VARCHAR},",
          "SKIN = #{skin,jdbcType=VARCHAR},",
          "EMAIL = #{email,jdbcType=VARCHAR},",
          "NUMBER = #{number,jdbcType=VARCHAR},",
          "PHONE = #{phone,jdbcType=VARCHAR},",
          "MAN_BUYER_ID = #{manBuyerId,jdbcType=INTEGER}",
        "where USER_ID = #{userId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SysUser record);

    @Update({
            "update sys_user",
            "set USERNAME = #{username,jdbcType=VARCHAR},",
            "NAME = #{name,jdbcType=VARCHAR},",
            "RIGHTS = #{rights,jdbcType=VARCHAR},",
            "ROLE_ID = #{roleId,jdbcType=VARCHAR},",
            "LAST_LOGIN = #{lastLogin,jdbcType=VARCHAR},",
            "IP = #{ip,jdbcType=VARCHAR},",
            "STATUS = #{status,jdbcType=VARCHAR},",
            "BZ = #{bz,jdbcType=VARCHAR},",
            "SKIN = #{skin,jdbcType=VARCHAR},",
            "EMAIL = #{email,jdbcType=VARCHAR},",
            "NUMBER = #{number,jdbcType=VARCHAR},",
            "PHONE = #{phone,jdbcType=VARCHAR},",
            "MAN_BUYER_ID = #{manBuyerId,jdbcType=INTEGER}",
            "where USER_ID = #{userId,jdbcType=INTEGER}"
    })
    int updateMAN_BUYER_ID(SysUser record);
}