package com.neuedu.dao;

import com.neuedu.entity.GmcpAccountFund;
import org.apache.ibatis.jdbc.SQL;

public class GmcpAccountFundSqlProvider {
    public String insertSelective(GmcpAccountFund record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("gmcp$account_fund");
        
        if (record.getBuyerId() != null) {
            sql.VALUES("buyer_id", "#{buyerId,jdbcType=INTEGER}");
        }
        
        if (record.getAvailableMoney() != null) {
            sql.VALUES("available_money", "#{availableMoney,jdbcType=DECIMAL}");
        }
        
        if (record.getDepositingMoney() != null) {
            sql.VALUES("depositing_money", "#{depositingMoney,jdbcType=DECIMAL}");
        }
        
        if (record.getWithdrawingMoney() != null) {
            sql.VALUES("withdrawing_money", "#{withdrawingMoney,jdbcType=DECIMAL}");
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
        
        if (record.getCurrency() != null) {
            sql.VALUES("currency", "#{currency,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }
}