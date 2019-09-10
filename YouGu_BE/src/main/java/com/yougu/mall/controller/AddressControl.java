package com.yougu.mall.controller;

import com.fasterxml.jackson.annotation.JsonTypeInfo;


import com.yougu.mall.entity.Shipping;

import com.yougu.mall.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("address")
public class AddressControl {

    @Autowired
    private AddressService service;

    @RequestMapping("selectAddress")
    public List<Shipping> selectAddress(){
        return service.selectaddress();
    }

    @RequestMapping("deleteAddress")
    public int deleteAddress(int id){
        return service.deleteAddress(id);
    }

    @RequestMapping("selectById")
    public Shipping selectById(int id){
        return service.selectById(id);
    }

    @RequestMapping("updateShip")
    public int updateShip(Shipping shipping){
        return service.updateShip(shipping);
    }
}
