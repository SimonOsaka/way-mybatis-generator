package com.zl.way.mapper;

import com.zl.way.model.SpUserShop;

public interface SpUserShopMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SpUserShop record);

    int insertSelective(SpUserShop record);

    SpUserShop selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SpUserShop record);

    int updateByPrimaryKey(SpUserShop record);
}