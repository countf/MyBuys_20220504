package com.neuedu.dao;

import com.neuedu.entity.GmcpTransactionRecord;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface GmcpTransactionRecordMapper {
    @Delete({
        "delete from gmcp$transaction_record",
        "where transaction_id = #{transactionId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer transactionId);

    @Insert({
        "insert into gmcp$transaction_record (transaction_id, buyer_id, ",
        "bank_card_id, transaction_number, ",
        "transaction_type, account_name, ",
        "transaction_money, commission, ",
        "discount_commission, transaction_method, ",
        "complete_time, status, ",
        "actual_money, actual_commission, ",
        "actual_discount_commission, balance, ",
        "business_id, finance_type, ",
        "note, operator_name, ",
        "operator_ip, create_by, ",
        "create_time, last_update_by, ",
        "last_update_time, bank_receipt_url, ",
        "exchange_rate, transaction_desc, ",
        "foreign_exchange_fee, withdraw_fee)",
        "values (#{transactionId,jdbcType=INTEGER}, #{buyerId,jdbcType=INTEGER}, ",
        "#{bankCardId,jdbcType=INTEGER}, #{transactionNumber,jdbcType=VARCHAR}, ",
        "#{transactionType,jdbcType=TINYINT}, #{accountName,jdbcType=VARCHAR}, ",
        "#{transactionMoney,jdbcType=DECIMAL}, #{commission,jdbcType=DECIMAL}, ",
        "#{discountCommission,jdbcType=DECIMAL}, #{transactionMethod,jdbcType=TINYINT}, ",
        "#{completeTime,jdbcType=TIMESTAMP}, #{status,jdbcType=TINYINT}, ",
        "#{actualMoney,jdbcType=DECIMAL}, #{actualCommission,jdbcType=DECIMAL}, ",
        "#{actualDiscountCommission,jdbcType=DECIMAL}, #{balance,jdbcType=DECIMAL}, ",
        "#{businessId,jdbcType=INTEGER}, #{financeType,jdbcType=TINYINT}, ",
        "#{note,jdbcType=VARCHAR}, #{operatorName,jdbcType=VARCHAR}, ",
        "#{operatorIp,jdbcType=VARCHAR}, #{createBy,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{lastUpdateBy,jdbcType=VARCHAR}, ",
        "#{lastUpdateTime,jdbcType=TIMESTAMP}, #{bankReceiptUrl,jdbcType=VARCHAR}, ",
        "#{exchangeRate,jdbcType=DECIMAL}, #{transactionDesc,jdbcType=VARCHAR}, ",
        "#{foreignExchangeFee,jdbcType=DECIMAL}, #{withdrawFee,jdbcType=DECIMAL})"
    })
    int insert(GmcpTransactionRecord record);

    @InsertProvider(type=GmcpTransactionRecordSqlProvider.class, method="insertSelective")
    int insertSelective(GmcpTransactionRecord record);

    @Select({
        "select",
        "transaction_id, buyer_id, bank_card_id, transaction_number, transaction_type, ",
        "account_name, transaction_money, commission, discount_commission, transaction_method, ",
        "complete_time, status, actual_money, actual_commission, actual_discount_commission, ",
        "balance, business_id, finance_type, note, operator_name, operator_ip, create_by, ",
        "create_time, last_update_by, last_update_time, bank_receipt_url, exchange_rate, ",
        "transaction_desc, foreign_exchange_fee, withdraw_fee",
        "from gmcp$transaction_record",
        "where transaction_id = #{transactionId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="transaction_id", property="transactionId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="buyer_id", property="buyerId", jdbcType=JdbcType.INTEGER),
        @Result(column="bank_card_id", property="bankCardId", jdbcType=JdbcType.INTEGER),
        @Result(column="transaction_number", property="transactionNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="transaction_type", property="transactionType", jdbcType=JdbcType.TINYINT),
        @Result(column="account_name", property="accountName", jdbcType=JdbcType.VARCHAR),
        @Result(column="transaction_money", property="transactionMoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="commission", property="commission", jdbcType=JdbcType.DECIMAL),
        @Result(column="discount_commission", property="discountCommission", jdbcType=JdbcType.DECIMAL),
        @Result(column="transaction_method", property="transactionMethod", jdbcType=JdbcType.TINYINT),
        @Result(column="complete_time", property="completeTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="actual_money", property="actualMoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="actual_commission", property="actualCommission", jdbcType=JdbcType.DECIMAL),
        @Result(column="actual_discount_commission", property="actualDiscountCommission", jdbcType=JdbcType.DECIMAL),
        @Result(column="balance", property="balance", jdbcType=JdbcType.DECIMAL),
        @Result(column="business_id", property="businessId", jdbcType=JdbcType.INTEGER),
        @Result(column="finance_type", property="financeType", jdbcType=JdbcType.TINYINT),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator_name", property="operatorName", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator_ip", property="operatorIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_by", property="createBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_update_by", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_update_time", property="lastUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="bank_receipt_url", property="bankReceiptUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="exchange_rate", property="exchangeRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="transaction_desc", property="transactionDesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="foreign_exchange_fee", property="foreignExchangeFee", jdbcType=JdbcType.DECIMAL),
        @Result(column="withdraw_fee", property="withdrawFee", jdbcType=JdbcType.DECIMAL)
    })
    GmcpTransactionRecord selectByPrimaryKey(Integer transactionId);

    @UpdateProvider(type=GmcpTransactionRecordSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(GmcpTransactionRecord record);

    @Update({
        "update gmcp$transaction_record",
        "set buyer_id = #{buyerId,jdbcType=INTEGER},",
          "bank_card_id = #{bankCardId,jdbcType=INTEGER},",
          "transaction_number = #{transactionNumber,jdbcType=VARCHAR},",
          "transaction_type = #{transactionType,jdbcType=TINYINT},",
          "account_name = #{accountName,jdbcType=VARCHAR},",
          "transaction_money = #{transactionMoney,jdbcType=DECIMAL},",
          "commission = #{commission,jdbcType=DECIMAL},",
          "discount_commission = #{discountCommission,jdbcType=DECIMAL},",
          "transaction_method = #{transactionMethod,jdbcType=TINYINT},",
          "complete_time = #{completeTime,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=TINYINT},",
          "actual_money = #{actualMoney,jdbcType=DECIMAL},",
          "actual_commission = #{actualCommission,jdbcType=DECIMAL},",
          "actual_discount_commission = #{actualDiscountCommission,jdbcType=DECIMAL},",
          "balance = #{balance,jdbcType=DECIMAL},",
          "business_id = #{businessId,jdbcType=INTEGER},",
          "finance_type = #{financeType,jdbcType=TINYINT},",
          "note = #{note,jdbcType=VARCHAR},",
          "operator_name = #{operatorName,jdbcType=VARCHAR},",
          "operator_ip = #{operatorIp,jdbcType=VARCHAR},",
          "create_by = #{createBy,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "last_update_by = #{lastUpdateBy,jdbcType=VARCHAR},",
          "last_update_time = #{lastUpdateTime,jdbcType=TIMESTAMP},",
          "bank_receipt_url = #{bankReceiptUrl,jdbcType=VARCHAR},",
          "exchange_rate = #{exchangeRate,jdbcType=DECIMAL},",
          "transaction_desc = #{transactionDesc,jdbcType=VARCHAR},",
          "foreign_exchange_fee = #{foreignExchangeFee,jdbcType=DECIMAL},",
          "withdraw_fee = #{withdrawFee,jdbcType=DECIMAL}",
        "where transaction_id = #{transactionId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(GmcpTransactionRecord record);
}