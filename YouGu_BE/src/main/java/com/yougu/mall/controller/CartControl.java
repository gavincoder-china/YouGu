package com.yougu.mall.controller;


import com.yougu.mall.entity.Cart;
import com.yougu.mall.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cart")
public class CartControl {

    @Autowired
    private CartService service;

    @RequestMapping("selectByPrimaryKey")
    public List<Cart> selectByPrimaryKey(Integer userId){
        return service.selectByPrimaryKey(userId);
    }

    @RequestMapping("deleCart")
    public Integer deleCart(Integer id){
        return service.delCart(id);
    }

    @RequestMapping("updateCart")
    public Integer updateCart(Cart cart){
        return service.updateCart(cart);
    }

    @RequestMapping("selectOrder")
    public Cart selectOrder(Integer checked){
        return service.selectOrder(checked);
    }
}
