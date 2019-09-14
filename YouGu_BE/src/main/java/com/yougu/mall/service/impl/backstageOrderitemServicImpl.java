package com.yougu.mall.service.impl;

import com.yougu.mall.entity.Orderitem;
import com.yougu.mall.mapper.backstageOrderitemMapper;
import com.yougu.mall.service.backstageOrderitemServic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class backstageOrderitemServicImpl implements backstageOrderitemServic {

    @Autowired
    private backstageOrderitemMapper backstageOrderitemMapper;

    @Override
    public List<Orderitem> queryByAll() {
        return backstageOrderitemMapper.queryByAll();
    }
}
