package com.wmy.infrastructure.persistent.dao;

import com.wmy.infrastructure.persistent.po.Award;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: wangmengyao
 * @CreateTime: 2025-07-19 16:00:15
 * @Description: 奖品表DAO
 * @Version: 1.0
 */
@Mapper
public interface IAwardDao {

    List<Award> queryAwardList();

}
