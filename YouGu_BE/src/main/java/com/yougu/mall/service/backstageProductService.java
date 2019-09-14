package com.yougu.mall.service;

import com.github.pagehelper.Page;
import com.yougu.mall.entity.Comment;
import com.yougu.mall.entity.Product;


import java.util.List;

public interface backstageProductService {

    int del(int id);

    int add(Product product);

    int update(Product product);

    List<Product> queryByAll();




}
