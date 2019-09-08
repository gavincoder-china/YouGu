import Vue from 'vue'
import Router from 'vue-router'
import index from './views/Index'
import test from './components/test'
import index02 from './views/Index02'
import cart from './views/Cart'
import detail from './views/Detail'
import login from './views/Login'
import order from './views/Order'
import pay from './views/Pay'
import register from './views/Register'
import user from './views/User'
import userOrder from "./views/user/userOrder";
import userInfo from "./views/user/userInfo";
import userCommand from "./views/user/userCommand";
import userAddress from "./views/user/userAddress";
import changePassword from "./views/user/changePassword";



Vue.use(Router);

export default new Router({
    routes: [
        {
            // 主页
            path: '/index',
            name: 'index',
            component: index
        },

        {
            // 这个是简单的测试
            path: '/test',
            name: 'test',
            component: test
        }
        ,

        {
            // 商品推荐页
            path: '/index02',
            name: 'index02',
            component: index02
        },

        {

            // 商品详情页
            path: '/datail',
            name: 'datail',
            component: detail
        },
        {

            // 用户中心
            path: '/user',
            name: 'user',
            component: user,
            children: [
                {

                    // 这边是子路由的配置
                    path: '/user/userOrder',

                    component: {user:userOrder}

                },
                {
                    path: '/user/userCommand',

                    component: {user:userCommand}
                },
                {
                    path: '/user/userAddress',

                    component: {user:userAddress}
                },
                {
                    path: '/user/userInfo',

                    component: {user:userInfo}
                },
                {
                    path: '/user/changePassword',

                    component: {user:changePassword}
                }
                // ,
                // {
                //     path: '/',
                //     redirect: '/user/userInfo'
                //
                //
                // }


            ]
        },

        {
            // 登录
            path: '/login',
            name: 'login',
            component: login
        },

        {
            // 注册
            path: '/register',
            name: 'register',
            component: register
        },

        {
            // 购物车
            path: '/cart',
            name: 'cart',
            component: cart
        },

        {
            // 订单确认页
            path: '/order',
            name: 'order',
            component: order
        },

        {
            // 支付完成页
            path: '/pay',
            name: 'pay',
            component: pay
        },

        {

            // 默认主页
            path: '/',
            redirect: '/index'
        }

        /*    {
           path: '/about',
           component: About,
           children: [
               {
                   path: '/about/child1',
                   component: Child1


               }, {
                   path: '/about/child2',
                   component: Child2
               }, {
                   path: '/',
                   redirect: '/about/child1'


               }


           ]
       },*/
    ]
})
