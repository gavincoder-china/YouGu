package com.yougu.mall.service.impl;

import com.yougu.mall.entity.Cart;
import com.yougu.mall.mapper.CartMapper;
import com.yougu.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * **********************************************************
 *
 * @Project:
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2019-08-30 09:10
 * @description:
 ************************************************************/

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private CartMapper mapper;

    @Override
    public List<Cart> selecttest(int id) {


        return mapper.selecttest(id);
    }
}
