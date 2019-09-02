package com.yougu.mall.mapper;

import com.yougu.mall.entity.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}