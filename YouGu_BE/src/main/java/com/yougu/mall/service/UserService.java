package com.yougu.mall.service;


import com.yougu.mall.entity.User;

import java.util.List;


public interface UserService {

    int insert(User user);
   User login(String loginName,String password);
    Integer countByEmail(String email);

    Integer countByUsername(String username);
    User selectAllByUsername(String username);
    int updatePasswordByUsername(String updatedPassword,String username);
}
