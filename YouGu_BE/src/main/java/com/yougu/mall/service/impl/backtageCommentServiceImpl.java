package com.yougu.mall.service.impl;

import com.yougu.mall.entity.Comment;
import com.yougu.mall.mapper.backstageCommentMapper;
import com.yougu.mall.service.backtageCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class backtageCommentServiceImpl implements backtageCommentService {

    @Autowired
    private backstageCommentMapper backstageCommentMapper;

    @Override
    public List<Comment> queryByAll() {
        return backstageCommentMapper.queryByAll();
    }
}
