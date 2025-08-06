package com.wmy.domain.strategy.service.armory;

/**
 * @Author: wangmengyao
 * @CreateTime: 2025-08-04 23:11:22
 * @Description:策略装配库(兵工厂)，负责初始化策略计算
 * @Version: 1.0
 */
public interface IStrategyArmory {

    /**
     * 装配抽奖策略配置「触发的时机可以为活动审核通过后进行调用」
     * @param strategyId
     * @return
     */
    boolean assembleLotteryStrategy(Long strategyId);

    /**
     * 获取抽奖策略装配的随机结果
     * @param strategyId
     * @return
     */
    Integer getRandomAwardId(Long strategyId);
}
