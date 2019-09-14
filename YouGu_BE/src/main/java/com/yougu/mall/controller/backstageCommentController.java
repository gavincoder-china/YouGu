package com.yougu.mall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yougu.mall.entity.Comment;
import com.yougu.mall.service.backtageCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("backstageCommentController")
public class backstageCommentController {

    @Autowired
    private backtageCommentService backtageCommentService;

    @RequestMapping(value = "queryByAll",method = RequestMethod.GET)
    public PageInfo queryByAll(@RequestParam(value = "pageNo", defaultValue = "1")Integer pageNo, @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize){
        PageHelper.startPage(pageNo,pageSize);
        List<Comment> comments = backtageCommentService.queryByAll();
        PageInfo info = new PageInfo(comments,5);
        return info;
    }
}
