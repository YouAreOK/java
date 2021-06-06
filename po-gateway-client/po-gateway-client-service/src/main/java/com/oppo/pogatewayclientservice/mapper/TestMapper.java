package com.oppo.pogatewayclientservice.mapper;

import com.oppo.pogatewayclientapi.entity.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Andy on 2021/6/5 15:09
 */

@Mapper
public interface TestMapper {
    User getUserById(@Param("id") Integer id);
}
