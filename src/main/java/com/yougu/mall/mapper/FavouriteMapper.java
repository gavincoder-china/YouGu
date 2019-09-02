package com.yougu.mall.mapper;

import com.yougu.mall.entity.Favourite;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FavouriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Favourite record);

    int insertSelective(Favourite record);

    Favourite selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Favourite record);

    int updateByPrimaryKey(Favourite record);
}