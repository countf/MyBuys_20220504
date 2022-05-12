package com.neuedu.dao;

import com.neuedu.entity.GmcpTransactionAudit;
import org.apache.ibatis.jdbc.SQL;

public class GmcpTransactionAuditSqlProvider {
    public String insertSelective(GmcpTransactionAudit record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("gmcp$transaction_audit");
        
        if (record.getTransactionAuditId() != null) {
            sql.VALUES("transaction_audit_id", "#{transactionAuditId,jdbcType=INTEGER}");
        }
        
        if (record.getBuyerId() != null) {
            sql.VALUES("buyer_id", "#{buyerId,jdbcType=INTEGER}");
        }
        
        if (record.getTransactionId() != null) {
            sql.VALUES("transaction_id", "#{transactionId,jdbcType=INTEGER}");
        }
        
        if (record.getAvailableMoneyBefore() != null) {
            sql.VALUES("available_money_before", "#{availableMoneyBefore,jdbcType=DECIMAL}");
        }
        
        if (record.getDepositingMoneyBefore() != null) {
            sql.VALUES("depositing_money_before", "#{depositingMoneyBefore,jdbcType=DECIMAL}");
        }
        
        if (record.getWithdrawingMoneyBefore() != null) {
            sql.VALUES("withdrawing_money_before", "#{withdrawingMoneyBefore,jdbcType=DECIMAL}");
        }
        
        if (record.getOperateMoney() != null) {
            sql.VALUES("operate_money", "#{operateMoney,jdbcType=DECIMAL}");
        }
        
        if (record.getOperateType() != null) {
            sql.VALUES("operate_type", "#{operateType,jdbcType=TINYINT}");
        }
        
        if (record.getAvailableMoneyAfter() != null) {
            sql.VALUES("available_money_after", "#{availableMoneyAfter,jdbcType=DECIMAL}");
        }
        
        if (record.getDepositingMoneyAfter() != null) {
            sql.VALUES("depositing_money_after", "#{depositingMoneyAfter,jdbcType=DECIMAL}");
        }
        
        if (record.getWithdrawingMoneyAfter() != null) {
            sql.VALUES("withdrawing_money_after", "#{withdrawingMoneyAfter,jdbcType=DECIMAL}");
        }
        
        if (record.getOperateBy() != null) {
            sql.VALUES("operate_by", "#{operateBy,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=TINYINT}");
        }
        
        if (record.getCreateBy() != null) {
            sql.VALUES("create_by", "#{createBy,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastUpdateBy() != null) {
            sql.VALUES("last_update_by", "#{lastUpdateBy,jdbcType=VARCHAR}");
        }
        
        if (record.getLastUpdateTime() != null) {
            sql.VALUES("last_update_time", "#{lastUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(GmcpTransactionAudit record) {
        SQL sql = new SQL();
        sql.UPDATE("gmcp$transaction_audit");
        
        if (record.getBuyerId() != null) {
            sql.SET("buyer_id = #{buyerId,jdbcType=INTEGER}");
        }
        
        if (record.getTransactionId() != null) {
            sql.SET("transaction_id = #{transactionId,jdbcType=INTEGER}");
        }
        
        if (record.getAvailableMoneyBefore() != null) {
            sql.SET("available_money_before = #{availableMoneyBefore,jdbcType=DECIMAL}");
        }
        
        if (record.getDepositingMoneyBefore() != null) {
            sql.SET("depositing_money_before = #{depositingMoneyBefore,jdbcType=DECIMAL}");
        }
        
        if (record.getWithdrawingMoneyBefore() != null) {
            sql.SET("withdrawing_money_before = #{withdrawingMoneyBefore,jdbcType=DECIMAL}");
        }
        
        if (record.getOperateMoney() != null) {
            sql.SET("operate_money = #{operateMoney,jdbcType=DECIMAL}");
        }
        
        if (record.getOperateType() != null) {
            sql.SET("operate_type = #{operateType,jdbcType=TINYINT}");
        }
        
        if (record.getAvailableMoneyAfter() != null) {
            sql.SET("available_money_after = #{availableMoneyAfter,jdbcType=DECIMAL}");
        }
        
        if (record.getDepositingMoneyAfter() != null) {
            sql.SET("depositing_money_after = #{depositingMoneyAfter,jdbcType=DECIMAL}");
        }
        
        if (record.getWithdrawingMoneyAfter() != null) {
            sql.SET("withdrawing_money_after = #{withdrawingMoneyAfter,jdbcType=DECIMAL}");
        }
        
        if (record.getOperateBy() != null) {
            sql.SET("operate_by = #{operateBy,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=TINYINT}");
        }
        
        if (record.getCreateBy() != null) {
            sql.SET("create_by = #{createBy,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastUpdateBy() != null) {
            sql.SET("last_update_by = #{lastUpdateBy,jdbcType=VARCHAR}");
        }
        
        if (record.getLastUpdateTime() != null) {
            sql.SET("last_update_time = #{lastUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("transaction_audit_id = #{transactionAuditId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}