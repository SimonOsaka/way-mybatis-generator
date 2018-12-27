package com.zl.way.sp.mapper;

import com.zl.way.sp.model.WayShopCateLeaf;

public interface WayShopCateLeafMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WayShopCateLeaf record);

    int insertSelective(WayShopCateLeaf record);

    WayShopCateLeaf selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WayShopCateLeaf record);

    int updateByPrimaryKey(WayShopCateLeaf record);
}