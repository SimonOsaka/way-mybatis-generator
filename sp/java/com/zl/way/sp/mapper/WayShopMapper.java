package com.zl.way.sp.mapper;

import com.zl.way.sp.model.WayShop;

public interface WayShopMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WayShop record);

    int insertSelective(WayShop record);

    WayShop selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WayShop record);

    int updateByPrimaryKey(WayShop record);
}