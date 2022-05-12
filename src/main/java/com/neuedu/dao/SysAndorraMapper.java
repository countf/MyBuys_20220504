package com.neuedu.dao;

import com.neuedu.entity.SysAndorra;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface SysAndorraMapper {
    @Delete({
        "delete from sys_andorra",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into sys_andorra (id, title, ",
        "content, type, adurl, ",
        "publisher, addtime, ",
        "uptime, starttime, ",
        "endtime, status, tourl)",
        "values (#{id,jdbcType=BIGINT}, #{title,jdbcType=VARCHAR}, ",
        "#{content,jdbcType=VARCHAR}, #{type,jdbcType=CHAR}, #{adurl,jdbcType=VARCHAR}, ",
        "#{publisher,jdbcType=VARCHAR}, #{addtime,jdbcType=TIMESTAMP}, ",
        "#{uptime,jdbcType=TIMESTAMP}, #{starttime,jdbcType=VARCHAR}, ",
        "#{endtime,jdbcType=VARCHAR}, #{status,jdbcType=CHAR}, #{tourl,jdbcType=VARCHAR})"
    })
    int insert(SysAndorra record);

    @InsertProvider(type=SysAndorraSqlProvider.class, method="insertSelective")
    int insertSelective(SysAndorra record);

    @Select({
        "select",
        "id, title, content, type, adurl, publisher, addtime, uptime, starttime, endtime, ",
        "status, tourl",
        "from sys_andorra",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.CHAR),
        @Result(column="adurl", property="adurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="publisher", property="publisher", jdbcType=JdbcType.VARCHAR),
        @Result(column="addtime", property="addtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="uptime", property="uptime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="starttime", property="starttime", jdbcType=JdbcType.VARCHAR),
        @Result(column="endtime", property="endtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="tourl", property="tourl", jdbcType=JdbcType.VARCHAR)
    })
    SysAndorra selectByPrimaryKey(Long id);

    @UpdateProvider(type=SysAndorraSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysAndorra record);

    @Update({
        "update sys_andorra",
        "set title = #{title,jdbcType=VARCHAR},",
          "content = #{content,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=CHAR},",
          "adurl = #{adurl,jdbcType=VARCHAR},",
          "publisher = #{publisher,jdbcType=VARCHAR},",
          "addtime = #{addtime,jdbcType=TIMESTAMP},",
          "uptime = #{uptime,jdbcType=TIMESTAMP},",
          "starttime = #{starttime,jdbcType=VARCHAR},",
          "endtime = #{endtime,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=CHAR},",
          "tourl = #{tourl,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SysAndorra record);
}