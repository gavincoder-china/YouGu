package com.yougu.mall.mapper;

import com.yougu.mall.entity.Cart;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
}