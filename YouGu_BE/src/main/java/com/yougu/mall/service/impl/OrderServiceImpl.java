package com.yougu.mall.service.impl;

import com.yougu.mall.entity.Order;
import com.yougu.mall.mapper.OrderMapper;
import com.yougu.mall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * **********************************************************
 *
 * @Project:
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2019-09-16 09:49
 * @description:
 ************************************************************/
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper mapper;
    @Override
    public int insertSelective(Order record) {
        return mapper.insertSelective(record);
    }
}
