package com.zl.way.mp.mapper;

import com.zl.way.mp.model.WayShopLog;

public interface WayShopLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WayShopLog record);

    int insertSelective(WayShopLog record);

    WayShopLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WayShopLog record);

    int updateByPrimaryKey(WayShopLog record);
}