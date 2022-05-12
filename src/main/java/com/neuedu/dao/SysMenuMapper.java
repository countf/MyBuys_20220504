package com.neuedu.dao;

import com.neuedu.entity.SysMenu;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface SysMenuMapper {
    @Delete({
        "delete from sys_menu",
        "where MENU_ID = #{menuId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer menuId);

    @Insert({
        "insert into sys_menu (MENU_ID, MENU_NAME, ",
        "MENU_URL, PARENT_ID, ",
        "MENU_ORDER, MENU_ICON, ",
        "MENU_TYPE, CREATED_BY, ",
        "CREATION_DATE, LAST_UPDATE_BY, ",
        "LAST_UPDATE_DATE, CALL_CNT, ",
        "REMARK, STS_CD)",
        "values (#{menuId,jdbcType=INTEGER}, #{menuName,jdbcType=VARCHAR}, ",
        "#{menuUrl,jdbcType=VARCHAR}, #{parentId,jdbcType=INTEGER}, ",
        "#{menuOrder,jdbcType=VARCHAR}, #{menuIcon,jdbcType=VARCHAR}, ",
        "#{menuType,jdbcType=VARCHAR}, #{createdBy,jdbcType=VARCHAR}, ",
        "#{creationDate,jdbcType=TIMESTAMP}, #{lastUpdateBy,jdbcType=VARCHAR}, ",
        "#{lastUpdateDate,jdbcType=TIMESTAMP}, #{callCnt,jdbcType=INTEGER}, ",
        "#{remark,jdbcType=VARCHAR}, #{stsCd,jdbcType=CHAR})"
    })
    int insert(SysMenu record);

    @InsertProvider(type=SysMenuSqlProvider.class, method="insertSelective")
    int insertSelective(SysMenu record);

    @Select({
        "select",
        "MENU_ID, MENU_NAME, MENU_URL, PARENT_ID, MENU_ORDER, MENU_ICON, MENU_TYPE, CREATED_BY, ",
        "CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, CALL_CNT, REMARK, STS_CD",
        "from sys_menu",
        "where MENU_ID = #{menuId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="MENU_ID", property="menuId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="MENU_NAME", property="menuName", jdbcType=JdbcType.VARCHAR),
        @Result(column="MENU_URL", property="menuUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARENT_ID", property="parentId", jdbcType=JdbcType.INTEGER),
        @Result(column="MENU_ORDER", property="menuOrder", jdbcType=JdbcType.VARCHAR),
        @Result(column="MENU_ICON", property="menuIcon", jdbcType=JdbcType.VARCHAR),
        @Result(column="MENU_TYPE", property="menuType", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATION_DATE", property="creationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_UPDATE_BY", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATE_DATE", property="lastUpdateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALL_CNT", property="callCnt", jdbcType=JdbcType.INTEGER),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.CHAR)
    })
    SysMenu selectByPrimaryKey(Integer menuId);

    @UpdateProvider(type=SysMenuSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysMenu record);

    @Update({
        "update sys_menu",
        "set MENU_NAME = #{menuName,jdbcType=VARCHAR},",
          "MENU_URL = #{menuUrl,jdbcType=VARCHAR},",
          "PARENT_ID = #{parentId,jdbcType=INTEGER},",
          "MENU_ORDER = #{menuOrder,jdbcType=VARCHAR},",
          "MENU_ICON = #{menuIcon,jdbcType=VARCHAR},",
          "MENU_TYPE = #{menuType,jdbcType=VARCHAR},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR}",
        "where MENU_ID = #{menuId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SysMenu record);
}