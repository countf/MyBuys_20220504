package com.neuedu.dao;

import com.neuedu.entity.Sequence;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface SequenceMapper {
    @Delete({
        "delete from sequence",
        "where name = #{name,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String name);

    @Insert({
        "insert into sequence (name, current_value, ",
        "increment, initial)",
        "values (#{name,jdbcType=VARCHAR}, #{currentValue,jdbcType=INTEGER}, ",
        "#{increment,jdbcType=INTEGER}, #{initial,jdbcType=VARCHAR})"
    })
    int insert(Sequence record);

    @InsertProvider(type=SequenceSqlProvider.class, method="insertSelective")
    int insertSelective(Sequence record);

    @Select({
        "select",
        "name, current_value, increment, initial",
        "from sequence",
        "where name = #{name,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="current_value", property="currentValue", jdbcType=JdbcType.INTEGER),
        @Result(column="increment", property="increment", jdbcType=JdbcType.INTEGER),
        @Result(column="initial", property="initial", jdbcType=JdbcType.VARCHAR)
    })
    Sequence selectByPrimaryKey(String name);

    @UpdateProvider(type=SequenceSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Sequence record);

    @Update({
        "update sequence",
        "set current_value = #{currentValue,jdbcType=INTEGER},",
          "increment = #{increment,jdbcType=INTEGER},",
          "initial = #{initial,jdbcType=VARCHAR}",
        "where name = #{name,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Sequence record);
}