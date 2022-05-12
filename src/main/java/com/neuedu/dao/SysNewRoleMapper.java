package com.neuedu.dao;

import com.neuedu.entity.SysNewRole;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface SysNewRoleMapper {
    @Delete({
        "delete from sys_new_role",
        "where ROLE_ID = #{roleId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer roleId);

    @Insert({
        "insert into sys_new_role (ROLE_ID, ROLE_NAME, ",
        "VISIBLE_MENU_ID, PARENT_ID, ",
        "CREATED_BY, CREATION_DATE, ",
        "LAST_UPDATE_BY, LAST_UPDATE_DATE, ",
        "CALL_CNT, REMARK, ",
        "STS_CD)",
        "values (#{roleId,jdbcType=INTEGER}, #{roleName,jdbcType=VARCHAR}, ",
        "#{visibleMenuId,jdbcType=VARCHAR}, #{parentId,jdbcType=INTEGER}, ",
        "#{createdBy,jdbcType=VARCHAR}, #{creationDate,jdbcType=TIMESTAMP}, ",
        "#{lastUpdateBy,jdbcType=VARCHAR}, #{lastUpdateDate,jdbcType=TIMESTAMP}, ",
        "#{callCnt,jdbcType=INTEGER}, #{remark,jdbcType=VARCHAR}, ",
        "#{stsCd,jdbcType=CHAR})"
    })
    int insert(SysNewRole record);

    @InsertProvider(type=SysNewRoleSqlProvider.class, method="insertSelective")
    int insertSelective(SysNewRole record);

    @Select({
        "select",
        "ROLE_ID, ROLE_NAME, VISIBLE_MENU_ID, PARENT_ID, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, ",
        "LAST_UPDATE_DATE, CALL_CNT, REMARK, STS_CD",
        "from sys_new_role",
        "where ROLE_ID = #{roleId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ROLE_ID", property="roleId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ROLE_NAME", property="roleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="VISIBLE_MENU_ID", property="visibleMenuId", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARENT_ID", property="parentId", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATION_DATE", property="creationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_UPDATE_BY", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATE_DATE", property="lastUpdateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALL_CNT", property="callCnt", jdbcType=JdbcType.INTEGER),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.CHAR)
    })
    SysNewRole selectByPrimaryKey(Integer roleId);

    @UpdateProvider(type=SysNewRoleSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysNewRole record);

    @Update({
        "update sys_new_role",
        "set ROLE_NAME = #{roleName,jdbcType=VARCHAR},",
          "VISIBLE_MENU_ID = #{visibleMenuId,jdbcType=VARCHAR},",
          "PARENT_ID = #{parentId,jdbcType=INTEGER},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR}",
        "where ROLE_ID = #{roleId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SysNewRole record);
}