<template>
    <div id="app">


        <Head> </Head>

        <router-view ></router-view>

        <Footer></Footer>

    </div>
</template>

<style>

</style>


<script>

    import Footer from "./views/public/Footer";
    import Head from "./components/Head.vue";


    export default {

        components: {Head, Footer},


    }
</script>