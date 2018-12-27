package com.zl.way.mapper;

import com.zl.way.model.WayCommodity;

public interface WayCommodityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WayCommodity record);

    int insertSelective(WayCommodity record);

    WayCommodity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WayCommodity record);

    int updateByPrimaryKey(WayCommodity record);
}