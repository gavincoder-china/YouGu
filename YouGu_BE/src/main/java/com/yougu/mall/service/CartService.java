package com.yougu.mall.service;



import com.yougu.mall.entity.Cart;

import java.util.List;

public interface CartService {

    List<Cart> selectByPrimaryKey(Integer userId);

    Integer delCart(Integer id);

    Integer updateCart(Cart cart);

    Cart selectOrder(Integer checked);

    int deleteByPrimaryKey(Integer id);

}
