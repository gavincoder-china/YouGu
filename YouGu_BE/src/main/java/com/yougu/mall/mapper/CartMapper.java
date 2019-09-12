package com.yougu.mall.mapper;

import com.yougu.mall.entity.Cart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);


    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
    List<Cart> selecttest(int id);

    List<Cart> selectByPrimaryKey(@Param("userId") Integer userId);

    Integer deleCart(@Param("id") Integer id);

    Integer updateCart(@Param("cart") Cart cart);

    Cart selectOrder(@Param("checked")Integer checked);





}