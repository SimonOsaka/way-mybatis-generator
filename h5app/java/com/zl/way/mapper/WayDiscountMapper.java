package com.zl.way.mapper;

import com.zl.way.model.WayDiscount;

public interface WayDiscountMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WayDiscount record);

    int insertSelective(WayDiscount record);

    WayDiscount selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WayDiscount record);

    int updateByPrimaryKey(WayDiscount record);
}