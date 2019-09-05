<template>
    <div id="app">
        <Head/>
        <router-link to="Index"></router-link> |
        <router-view></router-view>

        <Footer/>

    </div>
</template>

<style>

</style>


<script>
    import Head from "./views/public/Head";
    import Footer from "./views/public/Footer";
    import SlideShow from "./views/index/SlideShow";
    import Gotoup from "./views/index/Gotoup";
    import GoodsShow from "./views/index/GoodsShow";


    export default {

        components: {GoodsShow, Gotoup, SlideShow, Footer, Head},


    }
</script>