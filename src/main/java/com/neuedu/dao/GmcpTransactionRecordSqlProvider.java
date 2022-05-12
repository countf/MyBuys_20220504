package com.neuedu.dao;

import com.neuedu.entity.GmcpTransactionRecord;
import org.apache.ibatis.jdbc.SQL;

public class GmcpTransactionRecordSqlProvider {
    public String insertSelective(GmcpTransactionRecord record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("gmcp$transaction_record");
        
        if (record.getTransactionId() != null) {
            sql.VALUES("transaction_id", "#{transactionId,jdbcType=INTEGER}");
        }
        
        if (record.getBuyerId() != null) {
            sql.VALUES("buyer_id", "#{buyerId,jdbcType=INTEGER}");
        }
        
        if (record.getBankCardId() != null) {
            sql.VALUES("bank_card_id", "#{bankCardId,jdbcType=INTEGER}");
        }
        
        if (record.getTransactionNumber() != null) {
            sql.VALUES("transaction_number", "#{transactionNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getTransactionType() != null) {
            sql.VALUES("transaction_type", "#{transactionType,jdbcType=TINYINT}");
        }
        
        if (record.getAccountName() != null) {
            sql.VALUES("account_name", "#{accountName,jdbcType=VARCHAR}");
        }
        
        if (record.getTransactionMoney() != null) {
            sql.VALUES("transaction_money", "#{transactionMoney,jdbcType=DECIMAL}");
        }
        
        if (record.getCommission() != null) {
            sql.VALUES("commission", "#{commission,jdbcType=DECIMAL}");
        }
        
        if (record.getDiscountCommission() != null) {
            sql.VALUES("discount_commission", "#{discountCommission,jdbcType=DECIMAL}");
        }
        
        if (record.getTransactionMethod() != null) {
            sql.VALUES("transaction_method", "#{transactionMethod,jdbcType=TINYINT}");
        }
        
        if (record.getCompleteTime() != null) {
            sql.VALUES("complete_time", "#{completeTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=TINYINT}");
        }
        
        if (record.getActualMoney() != null) {
            sql.VALUES("actual_money", "#{actualMoney,jdbcType=DECIMAL}");
        }
        
        if (record.getActualCommission() != null) {
            sql.VALUES("actual_commission", "#{actualCommission,jdbcType=DECIMAL}");
        }
        
        if (record.getActualDiscountCommission() != null) {
            sql.VALUES("actual_discount_commission", "#{actualDiscountCommission,jdbcType=DECIMAL}");
        }
        
        if (record.getBalance() != null) {
            sql.VALUES("balance", "#{balance,jdbcType=DECIMAL}");
        }
        
        if (record.getBusinessId() != null) {
            sql.VALUES("business_id", "#{businessId,jdbcType=INTEGER}");
        }
        
        if (record.getFinanceType() != null) {
            sql.VALUES("finance_type", "#{financeType,jdbcType=TINYINT}");
        }
        
        if (record.getNote() != null) {
            sql.VALUES("note", "#{note,jdbcType=VARCHAR}");
        }
        
        if (record.getOperatorName() != null) {
            sql.VALUES("operator_name", "#{operatorName,jdbcType=VARCHAR}");
        }
        
        if (record.getOperatorIp() != null) {
            sql.VALUES("operator_ip", "#{operatorIp,jdbcType=VARCHAR}");
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
        
        if (record.getBankReceiptUrl() != null) {
            sql.VALUES("bank_receipt_url", "#{bankReceiptUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getExchangeRate() != null) {
            sql.VALUES("exchange_rate", "#{exchangeRate,jdbcType=DECIMAL}");
        }
        
        if (record.getTransactionDesc() != null) {
            sql.VALUES("transaction_desc", "#{transactionDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getForeignExchangeFee() != null) {
            sql.VALUES("foreign_exchange_fee", "#{foreignExchangeFee,jdbcType=DECIMAL}");
        }
        
        if (record.getWithdrawFee() != null) {
            sql.VALUES("withdraw_fee", "#{withdrawFee,jdbcType=DECIMAL}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(GmcpTransactionRecord record) {
        SQL sql = new SQL();
        sql.UPDATE("gmcp$transaction_record");
        
        if (record.getBuyerId() != null) {
            sql.SET("buyer_id = #{buyerId,jdbcType=INTEGER}");
        }
        
        if (record.getBankCardId() != null) {
            sql.SET("bank_card_id = #{bankCardId,jdbcType=INTEGER}");
        }
        
        if (record.getTransactionNumber() != null) {
            sql.SET("transaction_number = #{transactionNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getTransactionType() != null) {
            sql.SET("transaction_type = #{transactionType,jdbcType=TINYINT}");
        }
        
        if (record.getAccountName() != null) {
            sql.SET("account_name = #{accountName,jdbcType=VARCHAR}");
        }
        
        if (record.getTransactionMoney() != null) {
            sql.SET("transaction_money = #{transactionMoney,jdbcType=DECIMAL}");
        }
        
        if (record.getCommission() != null) {
            sql.SET("commission = #{commission,jdbcType=DECIMAL}");
        }
        
        if (record.getDiscountCommission() != null) {
            sql.SET("discount_commission = #{discountCommission,jdbcType=DECIMAL}");
        }
        
        if (record.getTransactionMethod() != null) {
            sql.SET("transaction_method = #{transactionMethod,jdbcType=TINYINT}");
        }
        
        if (record.getCompleteTime() != null) {
            sql.SET("complete_time = #{completeTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=TINYINT}");
        }
        
        if (record.getActualMoney() != null) {
            sql.SET("actual_money = #{actualMoney,jdbcType=DECIMAL}");
        }
        
        if (record.getActualCommission() != null) {
            sql.SET("actual_commission = #{actualCommission,jdbcType=DECIMAL}");
        }
        
        if (record.getActualDiscountCommission() != null) {
            sql.SET("actual_discount_commission = #{actualDiscountCommission,jdbcType=DECIMAL}");
        }
        
        if (record.getBalance() != null) {
            sql.SET("balance = #{balance,jdbcType=DECIMAL}");
        }
        
        if (record.getBusinessId() != null) {
            sql.SET("business_id = #{businessId,jdbcType=INTEGER}");
        }
        
        if (record.getFinanceType() != null) {
            sql.SET("finance_type = #{financeType,jdbcType=TINYINT}");
        }
        
        if (record.getNote() != null) {
            sql.SET("note = #{note,jdbcType=VARCHAR}");
        }
        
        if (record.getOperatorName() != null) {
            sql.SET("operator_name = #{operatorName,jdbcType=VARCHAR}");
        }
        
        if (record.getOperatorIp() != null) {
            sql.SET("operator_ip = #{operatorIp,jdbcType=VARCHAR}");
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
        
        if (record.getBankReceiptUrl() != null) {
            sql.SET("bank_receipt_url = #{bankReceiptUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getExchangeRate() != null) {
            sql.SET("exchange_rate = #{exchangeRate,jdbcType=DECIMAL}");
        }
        
        if (record.getTransactionDesc() != null) {
            sql.SET("transaction_desc = #{transactionDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getForeignExchangeFee() != null) {
            sql.SET("foreign_exchange_fee = #{foreignExchangeFee,jdbcType=DECIMAL}");
        }
        
        if (record.getWithdrawFee() != null) {
            sql.SET("withdraw_fee = #{withdrawFee,jdbcType=DECIMAL}");
        }
        
        sql.WHERE("transaction_id = #{transactionId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}