package com.zl.way.mapper;

import com.zl.way.model.WayCommodityLog;

public interface WayCommodityLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WayCommodityLog record);

    int insertSelective(WayCommodityLog record);

    WayCommodityLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WayCommodityLog record);

    int updateByPrimaryKey(WayCommodityLog record);
}