package com.yougu.mall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yougu.mall.entity.Orderitem;
import com.yougu.mall.service.backstageOrderitemServic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("backstageOrderitemController")
public class backstageOrderitemController {

    @Autowired
    private backstageOrderitemServic backstageOrderitemServic;


    @RequestMapping(value = "queryByAll",method = RequestMethod.GET)
    public PageInfo queryByAll(@RequestParam(value = "pageNo", defaultValue = "1")Integer pageNo, @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize){
        PageHelper.startPage(pageNo,pageSize);
        List<Orderitem> comments = backstageOrderitemServic.queryByAll();
        PageInfo info = new PageInfo(comments,5);
        return info;
    }
}
