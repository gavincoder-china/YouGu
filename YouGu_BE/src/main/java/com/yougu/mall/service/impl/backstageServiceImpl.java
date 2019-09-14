package com.yougu.mall.service.impl;


import com.yougu.mall.entity.User;
import com.yougu.mall.mapper.backstageMapper;
import com.yougu.mall.service.backstageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class backstageServiceImpl implements backstageService {

    @Autowired
    private backstageMapper backstageMapper;



    @Override
    public int del(int id) {
        return backstageMapper.del(id);
    }

    @Override
    public List<User> queryByAll() {
        return backstageMapper.queryByAll();
    }


    }

