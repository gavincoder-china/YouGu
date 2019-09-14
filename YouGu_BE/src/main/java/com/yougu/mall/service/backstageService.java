package com.yougu.mall.service;

import com.github.pagehelper.Page;
import com.yougu.mall.entity.Comment;
import com.yougu.mall.entity.User;


import java.util.List;

public interface backstageService {



    int del(int id);

    List<User> queryByAll();





}
