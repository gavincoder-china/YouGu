package com.yougu.mall.mapper;

import com.yougu.mall.entity.Color;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ColorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Color record);

    int insertSelective(Color record);

    Color selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Color record);

    int updateByPrimaryKey(Color record);
}