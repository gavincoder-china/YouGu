package com.yougu.mall.mapper;

import com.yougu.mall.entity.Orderitem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderitemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Orderitem record);

    int insertSelective(Orderitem record);

    Orderitem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Orderitem record);

    int updateByPrimaryKey(Orderitem record);
}