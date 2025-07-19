package com.wmy.infrastructure.persistent.dao;

import com.wmy.infrastructure.persistent.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: wangmengyao
 * @CreateTime: 2025-07-19 16:11:21
 * @Description: 抽奖策略 DAO
 * @Version: 1.0
 */
@Mapper
public interface IStrategyDao {
    List<Strategy> queryStrategyList();
}
