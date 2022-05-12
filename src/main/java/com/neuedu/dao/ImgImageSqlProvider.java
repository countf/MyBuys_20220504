package com.neuedu.dao;

import com.neuedu.entity.ImgImage;
import org.apache.ibatis.jdbc.SQL;

public class ImgImageSqlProvider {
    public String insertSelective(ImgImage record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("img_image");
        
        if (record.getImgId() != null) {
            sql.VALUES("IMG_ID", "#{imgId,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("NAME", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getWidth() != null) {
            sql.VALUES("WIDTH", "#{width,jdbcType=INTEGER}");
        }
        
        if (record.getHeight() != null) {
            sql.VALUES("HEIGHT", "#{height,jdbcType=INTEGER}");
        }
        
        if (record.getUri() != null) {
            sql.VALUES("URI", "#{uri,jdbcType=VARCHAR}");
        }
        
        if (record.getTypeCd() != null) {
            sql.VALUES("TYPE_CD", "#{typeCd,jdbcType=CHAR}");
        }
        
        if (record.getEntityId() != null) {
            sql.VALUES("ENTITY_ID", "#{entityId,jdbcType=INTEGER}");
        }
        
        if (record.getEntityCd() != null) {
            sql.VALUES("ENTITY_CD", "#{entityCd,jdbcType=VARCHAR}");
        }
        
        if (record.getSeqNo() != null) {
            sql.VALUES("SEQ_NO", "#{seqNo,jdbcType=INTEGER}");
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

    public String updateByPrimaryKeySelective(ImgImage record) {
        SQL sql = new SQL();
        sql.UPDATE("img_image");
        
        if (record.getName() != null) {
            sql.SET("NAME = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getWidth() != null) {
            sql.SET("WIDTH = #{width,jdbcType=INTEGER}");
        }
        
        if (record.getHeight() != null) {
            sql.SET("HEIGHT = #{height,jdbcType=INTEGER}");
        }
        
        if (record.getUri() != null) {
            sql.SET("URI = #{uri,jdbcType=VARCHAR}");
        }
        
        if (record.getTypeCd() != null) {
            sql.SET("TYPE_CD = #{typeCd,jdbcType=CHAR}");
        }
        
        if (record.getEntityId() != null) {
            sql.SET("ENTITY_ID = #{entityId,jdbcType=INTEGER}");
        }
        
        if (record.getEntityCd() != null) {
            sql.SET("ENTITY_CD = #{entityCd,jdbcType=VARCHAR}");
        }
        
        if (record.getSeqNo() != null) {
            sql.SET("SEQ_NO = #{seqNo,jdbcType=INTEGER}");
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
        
        sql.WHERE("IMG_ID = #{imgId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}