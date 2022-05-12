package com.neuedu.dao;

import com.neuedu.entity.GmcpTransactionAudit;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface GmcpTransactionAuditMapper {
    @Delete({
        "delete from gmcp$transaction_audit",
        "where transaction_audit_id = #{transactionAuditId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer transactionAuditId);

    @Insert({
        "insert into gmcp$transaction_audit (transaction_audit_id, buyer_id, ",
        "transaction_id, available_money_before, ",
        "depositing_money_before, withdrawing_money_before, ",
        "operate_money, operate_type, ",
        "available_money_after, depositing_money_after, ",
        "withdrawing_money_after, operate_by, ",
        "status, create_by, ",
        "create_time, last_update_by, ",
        "last_update_time)",
        "values (#{transactionAuditId,jdbcType=INTEGER}, #{buyerId,jdbcType=INTEGER}, ",
        "#{transactionId,jdbcType=INTEGER}, #{availableMoneyBefore,jdbcType=DECIMAL}, ",
        "#{depositingMoneyBefore,jdbcType=DECIMAL}, #{withdrawingMoneyBefore,jdbcType=DECIMAL}, ",
        "#{operateMoney,jdbcType=DECIMAL}, #{operateType,jdbcType=TINYINT}, ",
        "#{availableMoneyAfter,jdbcType=DECIMAL}, #{depositingMoneyAfter,jdbcType=DECIMAL}, ",
        "#{withdrawingMoneyAfter,jdbcType=DECIMAL}, #{operateBy,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=TINYINT}, #{createBy,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{lastUpdateBy,jdbcType=VARCHAR}, ",
        "#{lastUpdateTime,jdbcType=TIMESTAMP})"
    })
    int insert(GmcpTransactionAudit record);

    @InsertProvider(type=GmcpTransactionAuditSqlProvider.class, method="insertSelective")
    int insertSelective(GmcpTransactionAudit record);

    @Select({
        "select",
        "transaction_audit_id, buyer_id, transaction_id, available_money_before, depositing_money_before, ",
        "withdrawing_money_before, operate_money, operate_type, available_money_after, ",
        "depositing_money_after, withdrawing_money_after, operate_by, status, create_by, ",
        "create_time, last_update_by, last_update_time",
        "from gmcp$transaction_audit",
        "where transaction_audit_id = #{transactionAuditId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="transaction_audit_id", property="transactionAuditId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="buyer_id", property="buyerId", jdbcType=JdbcType.INTEGER),
        @Result(column="transaction_id", property="transactionId", jdbcType=JdbcType.INTEGER),
        @Result(column="available_money_before", property="availableMoneyBefore", jdbcType=JdbcType.DECIMAL),
        @Result(column="depositing_money_before", property="depositingMoneyBefore", jdbcType=JdbcType.DECIMAL),
        @Result(column="withdrawing_money_before", property="withdrawingMoneyBefore", jdbcType=JdbcType.DECIMAL),
        @Result(column="operate_money", property="operateMoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="operate_type", property="operateType", jdbcType=JdbcType.TINYINT),
        @Result(column="available_money_after", property="availableMoneyAfter", jdbcType=JdbcType.DECIMAL),
        @Result(column="depositing_money_after", property="depositingMoneyAfter", jdbcType=JdbcType.DECIMAL),
        @Result(column="withdrawing_money_after", property="withdrawingMoneyAfter", jdbcType=JdbcType.DECIMAL),
        @Result(column="operate_by", property="operateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="create_by", property="createBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_update_by", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_update_time", property="lastUpdateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    GmcpTransactionAudit selectByPrimaryKey(Integer transactionAuditId);

    @UpdateProvider(type=GmcpTransactionAuditSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(GmcpTransactionAudit record);

    @Update({
        "update gmcp$transaction_audit",
        "set buyer_id = #{buyerId,jdbcType=INTEGER},",
          "transaction_id = #{transactionId,jdbcType=INTEGER},",
          "available_money_before = #{availableMoneyBefore,jdbcType=DECIMAL},",
          "depositing_money_before = #{depositingMoneyBefore,jdbcType=DECIMAL},",
          "withdrawing_money_before = #{withdrawingMoneyBefore,jdbcType=DECIMAL},",
          "operate_money = #{operateMoney,jdbcType=DECIMAL},",
          "operate_type = #{operateType,jdbcType=TINYINT},",
          "available_money_after = #{availableMoneyAfter,jdbcType=DECIMAL},",
          "depositing_money_after = #{depositingMoneyAfter,jdbcType=DECIMAL},",
          "withdrawing_money_after = #{withdrawingMoneyAfter,jdbcType=DECIMAL},",
          "operate_by = #{operateBy,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=TINYINT},",
          "create_by = #{createBy,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "last_update_by = #{lastUpdateBy,jdbcType=VARCHAR},",
          "last_update_time = #{lastUpdateTime,jdbcType=TIMESTAMP}",
        "where transaction_audit_id = #{transactionAuditId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(GmcpTransactionAudit record);
}