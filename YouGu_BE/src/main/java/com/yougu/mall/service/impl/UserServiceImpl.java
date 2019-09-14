package com.yougu.mall.service.impl;

import com.yougu.mall.entity.User;
import com.yougu.mall.mapper.UserMapper;
import com.yougu.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * **********************************************************
 *
 * @Project:
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2019-08-30 09:10
 * @description:
 ************************************************************/

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper mapper;


    @Override
    public int insert(User user) {

        return mapper.insertSelective(user);

    }

    @Override
    public User login(String loginName, String password) {

        return  mapper.select(loginName, password);
    }

    @Override
    public Integer countByEmail(String email) {
        return mapper.countByEmail(email);
    }

    @Override
    public Integer countByUsername(String username) {
        return mapper.countByUsername(username);
    }

    @Override
    public User selectAllByUsername(String username) {
        return mapper.selectAllByUsername(username);
    }

    @Override
    public int updatePasswordByUsername(String updatedPassword, String username) {
        return mapper.updatePasswordByUsername(updatedPassword,username);
    }

    @Override
    public Integer countByPasswordAndUsername(String password, String username) {
        return mapper.countByPasswordAndUsername(password,username);
    }

}
