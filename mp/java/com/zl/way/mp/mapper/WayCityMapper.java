package com.zl.way.mp.mapper;

import com.zl.way.mp.model.WayCity;

public interface WayCityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WayCity record);

    int insertSelective(WayCity record);

    WayCity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WayCity record);

    int updateByPrimaryKey(WayCity record);
}