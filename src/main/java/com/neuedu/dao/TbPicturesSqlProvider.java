package com.neuedu.dao;

import com.neuedu.entity.TbPictures;
import org.apache.ibatis.jdbc.SQL;

public class TbPicturesSqlProvider {
    public String insertSelective(TbPictures record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("tb_pictures");
        
        if (record.getPicturesId() != null) {
            sql.VALUES("PICTURES_ID", "#{picturesId,jdbcType=VARCHAR}");
        }
        
        if (record.getTitle() != null) {
            sql.VALUES("TITLE", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("NAME", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getPath() != null) {
            sql.VALUES("PATH", "#{path,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatetime() != null) {
            sql.VALUES("CREATETIME", "#{createtime,jdbcType=VARCHAR}");
        }
        
        if (record.getMasterId() != null) {
            sql.VALUES("MASTER_ID", "#{masterId,jdbcType=VARCHAR}");
        }
        
        if (record.getBz() != null) {
            sql.VALUES("BZ", "#{bz,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TbPictures record) {
        SQL sql = new SQL();
        sql.UPDATE("tb_pictures");
        
        if (record.getTitle() != null) {
            sql.SET("TITLE = #{title,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.SET("NAME = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getPath() != null) {
            sql.SET("PATH = #{path,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatetime() != null) {
            sql.SET("CREATETIME = #{createtime,jdbcType=VARCHAR}");
        }
        
        if (record.getMasterId() != null) {
            sql.SET("MASTER_ID = #{masterId,jdbcType=VARCHAR}");
        }
        
        if (record.getBz() != null) {
            sql.SET("BZ = #{bz,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("PICTURES_ID = #{picturesId,jdbcType=VARCHAR}");
        
        return sql.toString();
    }
}