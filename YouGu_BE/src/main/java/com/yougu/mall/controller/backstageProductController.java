package com.yougu.mall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yougu.mall.entity.Product;

import com.yougu.mall.service.backstageProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
@RequestMapping("backstageProductController")
@ResponseBody
public class backstageProductController {

    @Autowired
    private backstageProductService backstageProductService;

    @RequestMapping(value = "del",method = RequestMethod.DELETE)
    public int del(int id){
     return backstageProductService.del(id);
    }

    @RequestMapping(value = "add",method = RequestMethod.POST)
    public int add(Product product){
     return backstageProductService.add(product);
    }


    @RequestMapping(value = "update",method = RequestMethod.POST)
    public int update(Product product){
     return backstageProductService.update(product);
    }

    @RequestMapping(value = "queryByAll",method = RequestMethod.GET)
    public PageInfo queryByAll(@RequestParam(value = "pageNo", defaultValue = "1")Integer pageNo, @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize){
        PageHelper.startPage(pageNo,pageSize);
        List<Product> comments = backstageProductService.queryByAll();
        PageInfo info = new PageInfo(comments,5);
        return info;
    }
}
