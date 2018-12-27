package com.zl.way.sp.mapper;

import com.zl.way.sp.model.WayCommodity;

public interface WayCommodityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WayCommodity record);

    int insertSelective(WayCommodity record);

    WayCommodity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WayCommodity record);

    int updateByPrimaryKey(WayCommodity record);
}