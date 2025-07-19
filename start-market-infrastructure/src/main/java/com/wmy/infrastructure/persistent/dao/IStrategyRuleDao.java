package com.wmy.infrastructure.persistent.dao;

import com.wmy.infrastructure.persistent.po.StrategyRule;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: wangmengyao
 * @CreateTime: 2025-07-19 16:12:05
 * @Description: 策略规则 DAO
 * @Version: 1.0
 */
@Mapper
public interface IStrategyRuleDao {

    List<StrategyRule> queryStrategyRuleList();

}
