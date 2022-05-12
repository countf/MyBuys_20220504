package com.neuedu.dao;

import com.neuedu.entity.SysMenu;
import org.apache.ibatis.jdbc.SQL;

public class SysMenuSqlProvider {
    public String insertSelective(SysMenu record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sys_menu");
        
        if (record.getMenuId() != null) {
            sql.VALUES("MENU_ID", "#{menuId,jdbcType=INTEGER}");
        }
        
        if (record.getMenuName() != null) {
            sql.VALUES("MENU_NAME", "#{menuName,jdbcType=VARCHAR}");
        }
        
        if (record.getMenuUrl() != null) {
            sql.VALUES("MENU_URL", "#{menuUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getParentId() != null) {
            sql.VALUES("PARENT_ID", "#{parentId,jdbcType=INTEGER}");
        }
        
        if (record.getMenuOrder() != null) {
            sql.VALUES("MENU_ORDER", "#{menuOrder,jdbcType=VARCHAR}");
        }
        
        if (record.getMenuIcon() != null) {
            sql.VALUES("MENU_ICON", "#{menuIcon,jdbcType=VARCHAR}");
        }
        
        if (record.getMenuType() != null) {
            sql.VALUES("MENU_TYPE", "#{menuType,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedBy() != null) {
            sql.VALUES("CREATED_BY", "#{createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getCreationDate() != null) {
            sql.VALUES("CREATION_DATE", "#{creationDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastUpdateBy() != null) {
            sql.VALUES("LAST_UPDATE_BY", "#{lastUpdateBy,jdbcType=VARCHAR}");
        }
        
        if (record.getLastUpdateDate() != null) {
            sql.VALUES("LAST_UPDATE_DATE", "#{lastUpdateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCallCnt() != null) {
            sql.VALUES("CALL_CNT", "#{callCnt,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("REMARK", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getStsCd() != null) {
            sql.VALUES("STS_CD", "#{stsCd,jdbcType=CHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(SysMenu record) {
        SQL sql = new SQL();
        sql.UPDATE("sys_menu");
        
        if (record.getMenuName() != null) {
            sql.SET("MENU_NAME = #{menuName,jdbcType=VARCHAR}");
        }
        
        if (record.getMenuUrl() != null) {
            sql.SET("MENU_URL = #{menuUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getParentId() != null) {
            sql.SET("PARENT_ID = #{parentId,jdbcType=INTEGER}");
        }
        
        if (record.getMenuOrder() != null) {
            sql.SET("MENU_ORDER = #{menuOrder,jdbcType=VARCHAR}");
        }
        
        if (record.getMenuIcon() != null) {
            sql.SET("MENU_ICON = #{menuIcon,jdbcType=VARCHAR}");
        }
        
        if (record.getMenuType() != null) {
            sql.SET("MENU_TYPE = #{menuType,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedBy() != null) {
            sql.SET("CREATED_BY = #{createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getCreationDate() != null) {
            sql.SET("CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastUpdateBy() != null) {
            sql.SET("LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR}");
        }
        
        if (record.getLastUpdateDate() != null) {
            sql.SET("LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCallCnt() != null) {
            sql.SET("CALL_CNT = #{callCnt,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("REMARK = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getStsCd() != null) {
            sql.SET("STS_CD = #{stsCd,jdbcType=CHAR}");
        }
        
        sql.WHERE("MENU_ID = #{menuId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}