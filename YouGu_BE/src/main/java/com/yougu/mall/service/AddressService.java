package com.yougu.mall.service;



import com.yougu.mall.entity.Shipping;

import java.util.List;

public interface AddressService {
    List<Shipping> selectaddress();

    int deleteAddress(int id);

    Shipping selectById(int id);

    int updateShip(Shipping ship);
}
