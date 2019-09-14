package com.yougu.mall.service.impl;

import com.yougu.mall.entity.Cart;
import com.yougu.mall.mapper.CartMapper;
import com.yougu.mall.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class cartServiceImpl implements CartService {

    @Autowired
    private CartMapper mapper;

    @Override
    public List<Cart> selectByPrimaryKey(Integer userId) {
        return mapper.selectByPrimaryKey(userId);
    }

    @Override
    public Integer delCart(Integer id) {
        return mapper.deleCart(id);
    }

    @Override
    public Integer updateCart(Cart cart) {
        return mapper.updateCart(cart);
    }

    @Override
    public Cart selectOrder(Integer checked) {
        return mapper.selectOrder(checked);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {

        return mapper.deleteByPrimaryKey(id);
    }




}
