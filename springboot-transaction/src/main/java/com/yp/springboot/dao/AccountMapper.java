package com.yp.springboot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AccountMapper {
    int update(@Param("money") double money, @Param("id") int id);
}
