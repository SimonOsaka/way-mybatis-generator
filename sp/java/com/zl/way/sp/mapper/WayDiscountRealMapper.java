package com.zl.way.sp.mapper;

import com.zl.way.sp.model.WayDiscountReal;

public interface WayDiscountRealMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WayDiscountReal record);

    int insertSelective(WayDiscountReal record);

    WayDiscountReal selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WayDiscountReal record);

    int updateByPrimaryKey(WayDiscountReal record);
}