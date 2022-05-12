package com.neuedu.dao;

import com.neuedu.entity.GmcpAccountFund;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;

public interface GmcpAccountFundMapper {
    @Insert({
        "insert into gmcp$account_fund (buyer_id, available_money, ",
        "depositing_money, withdrawing_money, ",
        "create_by, create_time, ",
        "last_update_by, last_update_time, ",
        "currency)",
        "values (#{buyerId,jdbcType=INTEGER}, #{availableMoney,jdbcType=DECIMAL}, ",
        "#{depositingMoney,jdbcType=DECIMAL}, #{withdrawingMoney,jdbcType=DECIMAL}, ",
        "#{createBy,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{lastUpdateBy,jdbcType=VARCHAR}, #{lastUpdateTime,jdbcType=TIMESTAMP}, ",
        "#{currency,jdbcType=VARCHAR})"
    })
    int insert(GmcpAccountFund record);

    @InsertProvider(type=GmcpAccountFundSqlProvider.class, method="insertSelective")
    int insertSelective(GmcpAccountFund record);
}