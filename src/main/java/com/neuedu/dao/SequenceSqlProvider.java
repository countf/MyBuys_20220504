package com.neuedu.dao;

import com.neuedu.entity.Sequence;
import org.apache.ibatis.jdbc.SQL;

public class SequenceSqlProvider {
    public String insertSelective(Sequence record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sequence");
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getCurrentValue() != null) {
            sql.VALUES("current_value", "#{currentValue,jdbcType=INTEGER}");
        }
        
        if (record.getIncrement() != null) {
            sql.VALUES("increment", "#{increment,jdbcType=INTEGER}");
        }
        
        if (record.getInitial() != null) {
            sql.VALUES("initial", "#{initial,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Sequence record) {
        SQL sql = new SQL();
        sql.UPDATE("sequence");
        
        if (record.getCurrentValue() != null) {
            sql.SET("current_value = #{currentValue,jdbcType=INTEGER}");
        }
        
        if (record.getIncrement() != null) {
            sql.SET("increment = #{increment,jdbcType=INTEGER}");
        }
        
        if (record.getInitial() != null) {
            sql.SET("initial = #{initial,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("name = #{name,jdbcType=VARCHAR}");
        
        return sql.toString();
    }
}