package com.neuedu.dao;

import com.neuedu.entity.ImgImage;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface ImgImageMapper {
    @Delete({
        "delete from img_image",
        "where IMG_ID = #{imgId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer imgId);

    @Insert({
        "insert into img_image (IMG_ID, NAME, ",
        "WIDTH, HEIGHT, URI, ",
        "TYPE_CD, ENTITY_ID, ENTITY_CD, ",
        "SEQ_NO, CREATED_BY, ",
        "CREATION_DATE, LAST_UPDATE_BY, ",
        "LAST_UPDATE_DATE, CALL_CNT, ",
        "REMARK, STS_CD)",
        "values (#{imgId,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{width,jdbcType=INTEGER}, #{height,jdbcType=INTEGER}, #{uri,jdbcType=VARCHAR}, ",
        "#{typeCd,jdbcType=CHAR}, #{entityId,jdbcType=INTEGER}, #{entityCd,jdbcType=VARCHAR}, ",
        "#{seqNo,jdbcType=INTEGER}, #{createdBy,jdbcType=VARCHAR}, ",
        "#{creationDate,jdbcType=TIMESTAMP}, #{lastUpdateBy,jdbcType=VARCHAR}, ",
        "#{lastUpdateDate,jdbcType=TIMESTAMP}, #{callCnt,jdbcType=INTEGER}, ",
        "#{remark,jdbcType=VARCHAR}, #{stsCd,jdbcType=CHAR})"
    })
    int insert(ImgImage record);

    @InsertProvider(type=ImgImageSqlProvider.class, method="insertSelective")
    int insertSelective(ImgImage record);

    @Select({
        "select",
        "IMG_ID, NAME, WIDTH, HEIGHT, URI, TYPE_CD, ENTITY_ID, ENTITY_CD, SEQ_NO, CREATED_BY, ",
        "CREATION_DATE, LAST_UPDATE_BY, LAST_UPDATE_DATE, CALL_CNT, REMARK, STS_CD",
        "from img_image",
        "where IMG_ID = #{imgId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="IMG_ID", property="imgId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="WIDTH", property="width", jdbcType=JdbcType.INTEGER),
        @Result(column="HEIGHT", property="height", jdbcType=JdbcType.INTEGER),
        @Result(column="URI", property="uri", jdbcType=JdbcType.VARCHAR),
        @Result(column="TYPE_CD", property="typeCd", jdbcType=JdbcType.CHAR),
        @Result(column="ENTITY_ID", property="entityId", jdbcType=JdbcType.INTEGER),
        @Result(column="ENTITY_CD", property="entityCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="SEQ_NO", property="seqNo", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATION_DATE", property="creationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_UPDATE_BY", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATE_DATE", property="lastUpdateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALL_CNT", property="callCnt", jdbcType=JdbcType.INTEGER),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.CHAR)
    })
    ImgImage selectByPrimaryKey(Integer imgId);

    @UpdateProvider(type=ImgImageSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ImgImage record);

    @Update({
        "update img_image",
        "set NAME = #{name,jdbcType=VARCHAR},",
          "WIDTH = #{width,jdbcType=INTEGER},",
          "HEIGHT = #{height,jdbcType=INTEGER},",
          "URI = #{uri,jdbcType=VARCHAR},",
          "TYPE_CD = #{typeCd,jdbcType=CHAR},",
          "ENTITY_ID = #{entityId,jdbcType=INTEGER},",
          "ENTITY_CD = #{entityCd,jdbcType=VARCHAR},",
          "SEQ_NO = #{seqNo,jdbcType=INTEGER},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "CREATION_DATE = #{creationDate,jdbcType=TIMESTAMP},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR}",
        "where IMG_ID = #{imgId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ImgImage record);
}