package com.yougu.mall.controller;

import com.yougu.mall.entity.Login;
import com.yougu.mall.entity.User;
import com.yougu.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * **********************************************************
 *
 * @Project:
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2019-09-09 14:04
 * @description:
 ************************************************************/

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService service;


    //登录
    @PostMapping("userLogin")
    public User login(@RequestBody Login login, HttpSession session) {
        // @RequestMapping(value = "userLogin",method = RequestMethod.GET)
        // public User login(@RequestParam(value = "loginName",required = false) String loginName,@RequestParam(value = "password",required = false) String password, HttpSession session) {


        //这边是拿到数据后在数据库中查数据,查到数据表之后,设置下session

        User user = service.login(login.getLoginName(), login.getPassword());

        session.setAttribute("user", user);

        return user;
    }


    //这边是注册的操作,注册的成功的同时要登录上
    @PostMapping("add")
    public User addUser(@RequestBody User u, HttpSession session) {

        //这边插入数据
        //System.out.println("zhuce ");
        int insert = service.insert(u);
       // System.out.println(u);
        if (insert == 1) {
            //这边判断好了后,告诉前端,登陆成功了

            //由于html文件间传值不是很舒服,所以我们在这边设置一下session,等到后面有时间再去使用vuex进行解耦
            session.setAttribute("user", u);
            return u;

        }
        //如果登录失败,就返回空
        return null;

    }


    //这个是通过session查询用户数据的,如果登录的就查到session数据
    @GetMapping("checkLogin")
    public User checkLogin(HttpSession session) {

        try {
            User user = (User) session.getAttribute("user");
          //  System.out.println(user);

            if (user != null) {
                return user;
            } else {
                return null;
            }

        }
        catch (Exception e) {
            System.out.println("没这个数据");
        }


        return null;
    }


    //检测用户名是否重复
    @RequestMapping(value = "noName",method = RequestMethod.GET)
    @ResponseBody
    public int noName(@RequestParam String username,HttpSession session){

        Integer integer = service.countByUsername(username);
        //如果有数据,就将其存在session中(之后用vue的话,可以直接在前端使用Vuex)
        if (integer==1){
          session.setAttribute("checkUsername", username);
        }
        return  integer;
    }

    //检测邮箱是否重复
    @RequestMapping(value = "noEmail",method = RequestMethod.GET)
    @ResponseBody
    public int noEmail(@RequestParam String email){

        Integer integer = service.countByEmail(email);
        return  integer;
    }

    //这边是修改密码的操作,先拿到session中的用户名,然后查询所有的数据并返回
    @GetMapping("SelectUserToChange")
    public User SelectUserToChange(HttpSession session){

//        System.out.println("hh");
//        System.out.println((String) session.getAttribute("checkUsername"));
        return (User) service.selectAllByUsername((String) session.getAttribute("checkUsername"));

    }

     //修改密码
     @RequestMapping(value = "changePassword",method = RequestMethod.PUT)
     @ResponseBody
    public int changePassword(String password,HttpSession session){

         String username = (String) session.getAttribute("checkUsername");


         int i = service.updatePasswordByUsername(password, username);

         return i;

     }



    @DeleteMapping("exit")
    public int exit(HttpSession session) {
        //这个是退出登录,把session中的user属性去掉,前台再检测的时候,就没数据了

        session.removeAttribute("user");


        return 1;

    }


}
