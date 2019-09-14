package com.yougu.mall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yougu.mall.entity.User;
import com.yougu.mall.service.backstageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
@ResponseBody
@RequestMapping("backstageController")
public class backstageController {

    @Autowired
    private backstageService backstageService;

    @RequestMapping(value = "del",method= RequestMethod.DELETE)
    public int del(int id){
     return backstageService.del(id);
    }




    @RequestMapping(value = "queryByAll",method = RequestMethod.GET)
    public PageInfo queryByAll(@RequestParam(value = "pageNo", defaultValue = "1")Integer pageNo, @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize){
        PageHelper.startPage(pageNo,pageSize);
        List<User> comments = backstageService.queryByAll();
        PageInfo info = new PageInfo(comments,5);
        return info;
    }


}
