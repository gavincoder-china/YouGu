package com.yougu.mall.mapper;

import com.yougu.mall.entity.Shipping;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository

public interface ShippingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shipping record);

    int insertSelective(Shipping record);

    Shipping selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shipping record);

    int updateByPrimaryKey(Shipping record);


    List<Shipping> selectaddress();

    int deleteAddress(@Param("id") int id);

    Shipping selectById(@Param("id") int id);

    int updateShip(@Param("ship") Shipping ship);
}