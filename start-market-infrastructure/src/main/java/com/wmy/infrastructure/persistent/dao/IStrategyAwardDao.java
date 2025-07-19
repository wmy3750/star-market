package com.wmy.infrastructure.persistent.dao;

import com.wmy.infrastructure.persistent.po.StrategyAward;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: wangmengyao
 * @CreateTime: 2025-07-19 16:11:43
 * @Description: 抽奖策略奖品明细配置 - 概率、规则 DAO
 * @Version: 1.0
 */
@Mapper
public interface IStrategyAwardDao {
    List<StrategyAward> queryStrategyAwardList();
}
