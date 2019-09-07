<template>
    <div>

        <!--        这边是导航条-->
        <div class="head">
            <div class="wrapper clearfix">
                <div class="clearfix" id="top">
                    <h1 class="fl"><a href="index.html"><img src="../static/img/logo.png"/></a></h1>
                    <div class="fr clearfix" id="top1">
                        <!--  <p class="fl">
                              <a href="login.html">登录</a>
                              <a href="reg.html">注册</a>
                          </p>-->
                        <p class="fl">欢迎您,gavincoder</p>
                        <form action="#" method="get" class="fl">
                            <input type="text" placeholder="热门搜索：干花花瓶"/>
                            <input type="button"/>
                        </form>

                        <div class="btn fl clearfix">

                            <router-link :to="{path:'/user'}">
                            <img src="../static/img/grzx.png"/>
                            </router-link>

                           <router-link :to="{path:'cart'}"> <img src="../static/img/gwc.png"/></router-link>
                        </div>
                    </div>
                </div>
                <ul class="clearfix" id="bott">
                    <li><router-link :to="{path:'/',component:index}">首页</router-link></li>
                    <li>
                        <router-link :to="{path:'/index02',component:index02}">精品推荐</router-link>
                        <div class="sList">
                            <div class="wrapper  clearfix">
                                <a href="paint.html">
                                    <dl>
                                        <dt><img src="../static/img/nav1.jpg"/></dt>
                                        <dd>用户端</dd>
                                    </dl>
                                </a>
                                <a href="paint.html">
                                    <dl>
                                        <dt><img src="../static/img/nav2.jpg"/></dt>
                                        <dd>商家端</dd>
                                    </dl>
                                </a>
                                <a href="paint.html">
                                    <dl>
                                        <dt><img src="../static/img/nav3.jpg"/></dt>
                                        <dd>产品特性</dd>
                                    </dl>
                                </a>
                                <a href="paint.html">
                                    <dl>
                                        <dt><img src="../static/img/nav6.jpg"/></dt>
                                        <dd>后台管理</dd>
                                    </dl>
                                </a>
                                <a href="paint.html">
                                    <dl>
                                        <dt><img src="../static/img/nav7.jpg"/></dt>
                                        <dd>运营数据</dd>
                                    </dl>
                                </a>
                            </div>
                        </div>
                    </li>

                </ul>
            </div>

        </div>
<!--        //这边是路由的展示区-->


    </div>
</template>

<script>
    export default {
        name: "Head"
    }
</script>

<style scoped>

</style>