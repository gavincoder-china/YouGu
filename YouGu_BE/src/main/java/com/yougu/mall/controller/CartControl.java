package com.yougu.mall.controller;


import com.yougu.mall.entity.Cart;
import com.yougu.mall.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("cart")
public class CartControl {

    @Autowired
    private CartService service;

    @GetMapping("selectByPrimaryKey")
    public List<Cart> selectByPrimaryKey(Integer userId) {

//        我跟你说下思路    在登录的时候设置好   后面就可以一直拿   比如说你登录账户   可以得到  user   然后把user存入
//                后面  浏览器 不断 或者 不重定向  session  一直都在里面


   //     System.out.println(request.getSession().getId());

//        我们看下传来的sessionid
       // HttpSession  session=request.getSession(false);
      //  User user = (User) session.getAttribute("user");


      //  System.out.println(user+"---"+session.getAttribute("test"));
       // if (user != null) {
       //     return service.selectByPrimaryKey(user.getId());
       // }

        return service.selectByPrimaryKey(userId);
       // return null;
    }





    @RequestMapping("deleCart")
    public Integer deleCart(Integer id) {
        return service.delCart(id);
    }

    @RequestMapping("updateCart")
    public Integer updateCart(Cart cart) {
        return service.updateCart(cart);
    }

    @RequestMapping("selectOrder")
    public Cart selectOrder(Integer checked) {
        return service.selectOrder(checked);
    }


}
