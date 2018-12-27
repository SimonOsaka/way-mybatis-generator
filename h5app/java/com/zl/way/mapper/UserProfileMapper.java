package com.zl.way.mapper;

import com.zl.way.model.UserProfile;

public interface UserProfileMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserProfile record);

    int insertSelective(UserProfile record);

    UserProfile selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserProfile record);

    int updateByPrimaryKey(UserProfile record);
}