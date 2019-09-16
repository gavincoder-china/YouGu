package com.yougu.mall.service.impl;

import com.yougu.mall.entity.Product;
import com.yougu.mall.mapper.ProductMapper;
import com.yougu.mall.service.ProductService;
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
 * @Date : 2019-09-16 08:50
 * @description:
 ************************************************************/
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper mapper;

    @Override
    public Product selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }
}
