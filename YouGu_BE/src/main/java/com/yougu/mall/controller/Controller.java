package com.yougu.mall.controller;


import com.yougu.mall.entity.Cart;
import com.yougu.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * **********************************************************
 *
 * @Project:
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2019-08-28 19:17
 * @description:
 ************************************************************/
@RestController
@RequestMapping("v1")
public class Controller {

@Autowired
private UserService service;


     @GetMapping("user")
    public String user(){
         return "hello world";
     }


@GetMapping("cart")
    public  List<Cart> cart(int id){
    System.out.println("hello world");
   return  service.selecttest(id);

}


}
