package com.yougu.mall.mapper;


import com.yougu.mall.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface backstageProductMapper {

    int del(int id);

    int add(@Param("product") Product product);

    int update(@Param("product") Product product);

    List<Product> queryByAll();


}
