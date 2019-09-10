package com.yougu.mall.service;


import com.yougu.mall.entity.User;



public interface UserService {

    int insert(User user);
   User login(String loginName,String password);
    Integer countByEmail(String email);

    Integer countByUsername(String username);
}
