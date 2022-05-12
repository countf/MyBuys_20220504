package com.neuedu.dao;

import com.neuedu.entity.TbPictures;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TbPicturesMapper {
    @Delete({
        "delete from tb_pictures",
        "where PICTURES_ID = #{picturesId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String picturesId);

    @Insert({
        "insert into tb_pictures (PICTURES_ID, TITLE, ",
        "NAME, PATH, CREATETIME, ",
        "MASTER_ID, BZ)",
        "values (#{picturesId,jdbcType=VARCHAR}, #{title,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{path,jdbcType=VARCHAR}, #{createtime,jdbcType=VARCHAR}, ",
        "#{masterId,jdbcType=VARCHAR}, #{bz,jdbcType=VARCHAR})"
    })
    int insert(TbPictures record);

    @InsertProvider(type=TbPicturesSqlProvider.class, method="insertSelective")
    int insertSelective(TbPictures record);

    @Select({
        "select",
        "PICTURES_ID, TITLE, NAME, PATH, CREATETIME, MASTER_ID, BZ",
        "from tb_pictures",
        "where PICTURES_ID = #{picturesId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="PICTURES_ID", property="picturesId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="TITLE", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="PATH", property="path", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATETIME", property="createtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="MASTER_ID", property="masterId", jdbcType=JdbcType.VARCHAR),
        @Result(column="BZ", property="bz", jdbcType=JdbcType.VARCHAR)
    })
    TbPictures selectByPrimaryKey(String picturesId);

    @UpdateProvider(type=TbPicturesSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TbPictures record);

    @Update({
        "update tb_pictures",
        "set TITLE = #{title,jdbcType=VARCHAR},",
          "NAME = #{name,jdbcType=VARCHAR},",
          "PATH = #{path,jdbcType=VARCHAR},",
          "CREATETIME = #{createtime,jdbcType=VARCHAR},",
          "MASTER_ID = #{masterId,jdbcType=VARCHAR},",
          "BZ = #{bz,jdbcType=VARCHAR}",
        "where PICTURES_ID = #{picturesId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TbPictures record);
}