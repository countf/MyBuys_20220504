package com.neuedu.dao;

import com.neuedu.entity.BrdBrand;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import java.util.ArrayList;

@Mapper
public interface BrdBrandMapper {
    @Delete({
        "delete from brd_brand",
        "where BRD_ID = #{brdId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer brdId);

    @Insert({
        "insert into brd_brand (MAN_ID, ",
        "NAME_EN, NAME_CN, ",
        "CREATED_BY, CREATION_DATE, ",
        "CALL_CNT, REMARK, ",
        "STS_CD)",
        "values (#{manId,jdbcType=INTEGER}, ",
        "#{nameEn,jdbcType=VARCHAR}, #{nameCn,jdbcType=VARCHAR}, ",
        "#{createdBy,jdbcType=VARCHAR}, #{creationDate,jdbcType=TIMESTAMP}, ",
        "#{lastUpdateBy,jdbcType=VARCHAR}, #{lastUpdateDate,jdbcType=TIMESTAMP}, ",
        "#{callCnt,jdbcType=INTEGER}, #{remark,jdbcType=VARCHAR}, ",
        "'A')"
    })

    @Options(useGeneratedKeys = true,keyProperty = "brdId",keyColumn = "BRD_ID")
    int insert(BrdBrand record);

    @InsertProvider(type=BrdBrandSqlProvider.class, method="insertSelective")
    int insertSelective(BrdBrand record);

    @Select({
        "select",
        "BRD_ID, MAN_ID, NAME_EN, NAME_CN, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, ",
        "LAST_UPDATE_DATE, CALL_CNT, REMARK, STS_CD",
        "from brd_brand",
        "where BRD_ID = #{brdId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="BRD_ID", property="brdId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="MAN_ID", property="manId", jdbcType=JdbcType.INTEGER),
        @Result(column="NAME_EN", property="nameEn", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME_CN", property="nameCn", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATION_DATE", property="creationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_UPDATE_BY", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATE_DATE", property="lastUpdateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALL_CNT", property="callCnt", jdbcType=JdbcType.INTEGER),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.CHAR)
    })
    BrdBrand selectByPrimaryKey(Integer brdId);




    @Select({
            "select",
            "BRD_ID, MAN_ID, NAME_EN, NAME_CN, CREATED_BY, CREATION_DATE, LAST_UPDATE_BY, ",
            "LAST_UPDATE_DATE, CALL_CNT, REMARK, STS_CD",
            "from brd_brand",
            "where MAN_ID = #{mid,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="BRD_ID", property="brdId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="MAN_ID", property="manId", jdbcType=JdbcType.INTEGER),
            @Result(column="NAME_EN", property="nameEn", jdbcType=JdbcType.VARCHAR),
            @Result(column="NAME_CN", property="nameCn", jdbcType=JdbcType.VARCHAR),
            @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
            @Result(column="CREATION_DATE", property="creationDate", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="LAST_UPDATE_BY", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
            @Result(column="LAST_UPDATE_DATE", property="lastUpdateDate", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="CALL_CNT", property="callCnt", jdbcType=JdbcType.INTEGER),
            @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
            @Result(column="STS_CD", property="stsCd", jdbcType=JdbcType.CHAR)
    })
    ArrayList<BrdBrand> selectByMId(Integer mid);

    @UpdateProvider(type=BrdBrandSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(BrdBrand record);

    @Update({
        "update brd_brand",
        "set NAME_EN = #{nameEn,jdbcType=VARCHAR},",
          "NAME_CN = #{nameCn,jdbcType=VARCHAR},",
          "LAST_UPDATE_BY = #{lastUpdateBy,jdbcType=VARCHAR},",
          "LAST_UPDATE_DATE = #{lastUpdateDate,jdbcType=TIMESTAMP},",
          "CALL_CNT = #{callCnt,jdbcType=INTEGER},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "STS_CD = #{stsCd,jdbcType=CHAR}",
        "where BRD_ID = #{brdId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(BrdBrand record);

    @Update({
            "update brd_brand",
            "set STS_CD = #{stsCd,jdbcType=CHAR}",
            "where BRD_ID = #{brdId,jdbcType=INTEGER}"
    })
    int updateSTSByBId(@Param("brdId") int brdId,@Param("stsCd") String stsCd);
}