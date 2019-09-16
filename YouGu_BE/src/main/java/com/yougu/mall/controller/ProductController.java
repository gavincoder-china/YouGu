package com.yougu.mall.controller;

import com.yougu.mall.entity.Product;
import com.yougu.mall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * **********************************************************
 *
 * @Project:
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2019-09-16 08:51
 * @description:
 ************************************************************/
@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductService service;

    @RequestMapping("get")
    @ResponseBody
    public Product get(@RequestParam Integer id){
       // System.out.println(service.selectByPrimaryKey(id));

        return service.selectByPrimaryKey(id);

    }

}
