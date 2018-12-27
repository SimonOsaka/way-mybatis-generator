package com.zl.way.mp.mapper;

import com.zl.way.mp.model.WayShop;

public interface WayShopMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WayShop record);

    int insertSelective(WayShop record);

    WayShop selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WayShop record);

    int updateByPrimaryKey(WayShop record);
}