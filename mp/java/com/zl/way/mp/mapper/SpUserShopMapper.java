package com.zl.way.mp.mapper;

import com.zl.way.mp.model.SpUserShop;

public interface SpUserShopMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SpUserShop record);

    int insertSelective(SpUserShop record);

    SpUserShop selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SpUserShop record);

    int updateByPrimaryKey(SpUserShop record);
}