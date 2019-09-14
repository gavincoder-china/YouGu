package com.yougu.mall.service.impl;

import com.github.pagehelper.Page;
import com.yougu.mall.entity.Comment;
import com.yougu.mall.entity.Product;
import com.yougu.mall.mapper.backstageProductMapper;
import com.yougu.mall.service.backstageProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class backstageProductServiceImpl implements backstageProductService {

    @Autowired
    private backstageProductMapper backstageProductMapper;

    @Override
    public int del(int id) {
        return backstageProductMapper.del(id);
    }

    @Override
    public int add(Product product) {
        return backstageProductMapper.add(product);
    }

    @Override
    public int update(Product product) {
        return backstageProductMapper.update(product);
    }

    @Override
    public List<Product> queryByAll() {
        return backstageProductMapper.queryByAll();
    }


}
