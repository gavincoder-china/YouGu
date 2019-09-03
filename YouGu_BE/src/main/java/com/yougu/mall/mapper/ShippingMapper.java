package com.yougu.mall.mapper;

import com.yougu.mall.entity.Shipping;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShippingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shipping record);

    int insertSelective(Shipping record);

    Shipping selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shipping record);

    int updateByPrimaryKey(Shipping record);
}