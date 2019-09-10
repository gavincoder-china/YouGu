package com.yougu.mall.service.impl;


import com.yougu.mall.entity.Shipping;
import com.yougu.mall.mapper.ShippingMapper;
import com.yougu.mall.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private ShippingMapper mapper;

    @Override
    public List<Shipping> selectaddress() {
        return mapper.selectaddress();
    }

    @Override
    public int deleteAddress(int id) {
        return mapper.deleteAddress(id);
    }

    @Override
    public Shipping selectById(int id) {
        return mapper.selectById(id);
    }

    @Override
    public int updateShip(Shipping ship) {
        return mapper.updateShip(ship);
    }
}
