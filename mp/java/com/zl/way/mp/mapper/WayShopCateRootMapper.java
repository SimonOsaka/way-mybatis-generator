package com.zl.way.mp.mapper;

import com.zl.way.mp.model.WayShopCateRoot;

public interface WayShopCateRootMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WayShopCateRoot record);

    int insertSelective(WayShopCateRoot record);

    WayShopCateRoot selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WayShopCateRoot record);

    int updateByPrimaryKey(WayShopCateRoot record);
}