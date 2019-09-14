package com.yougu.mall.mapper;



import com.yougu.mall.entity.User;
import org.apache.ibatis.annotations.Mapper;

import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface backstageMapper {



    int del(int id);



    List<User> queryByAll();

}
