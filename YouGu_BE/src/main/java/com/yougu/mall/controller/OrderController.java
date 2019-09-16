package com.yougu.mall.controller;

import com.yougu.mall.entity.Order;
import com.yougu.mall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * **********************************************************
 *
 * @Project:
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2019-09-16 09:51
 * @description:
 ************************************************************/
@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrderService service;

    @PostMapping("addOrder")
    public int addOrder(@RequestBody Order order){

//        System.out.println(order);
        return service.insertSelective(order);
    }
}
