package com.zl.way.mapper;

import com.zl.way.model.WayShopQualification;

public interface WayShopQualificationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WayShopQualification record);

    int insertSelective(WayShopQualification record);

    WayShopQualification selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WayShopQualification record);

    int updateByPrimaryKey(WayShopQualification record);
}