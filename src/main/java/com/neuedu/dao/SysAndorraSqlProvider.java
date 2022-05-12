package com.neuedu.dao;

import com.neuedu.entity.SysAndorra;
import org.apache.ibatis.jdbc.SQL;

public class SysAndorraSqlProvider {
    public String insertSelective(SysAndorra record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sys_andorra");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getTitle() != null) {
            sql.VALUES("title", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getContent() != null) {
            sql.VALUES("content", "#{content,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=CHAR}");
        }
        
        if (record.getAdurl() != null) {
            sql.VALUES("adurl", "#{adurl,jdbcType=VARCHAR}");
        }
        
        if (record.getPublisher() != null) {
            sql.VALUES("publisher", "#{publisher,jdbcType=VARCHAR}");
        }
        
        if (record.getAddtime() != null) {
            sql.VALUES("addtime", "#{addtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUptime() != null) {
            sql.VALUES("uptime", "#{uptime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStarttime() != null) {
            sql.VALUES("starttime", "#{starttime,jdbcType=VARCHAR}");
        }
        
        if (record.getEndtime() != null) {
            sql.VALUES("endtime", "#{endtime,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=CHAR}");
        }
        
        if (record.getTourl() != null) {
            sql.VALUES("tourl", "#{tourl,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(SysAndorra record) {
        SQL sql = new SQL();
        sql.UPDATE("sys_andorra");
        
        if (record.getTitle() != null) {
            sql.SET("title = #{title,jdbcType=VARCHAR}");
        }
        
        if (record.getContent() != null) {
            sql.SET("content = #{content,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{type,jdbcType=CHAR}");
        }
        
        if (record.getAdurl() != null) {
            sql.SET("adurl = #{adurl,jdbcType=VARCHAR}");
        }
        
        if (record.getPublisher() != null) {
            sql.SET("publisher = #{publisher,jdbcType=VARCHAR}");
        }
        
        if (record.getAddtime() != null) {
            sql.SET("addtime = #{addtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUptime() != null) {
            sql.SET("uptime = #{uptime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStarttime() != null) {
            sql.SET("starttime = #{starttime,jdbcType=VARCHAR}");
        }
        
        if (record.getEndtime() != null) {
            sql.SET("endtime = #{endtime,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=CHAR}");
        }
        
        if (record.getTourl() != null) {
            sql.SET("tourl = #{tourl,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }
}