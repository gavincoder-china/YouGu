<template>
    <div>

        <SlideShow/>
        <Gotoup />
        <GoodsShow />
    </div>

</template>

<script>
    import SlideShow from "../views/index/SlideShow";
    import Gotoup from "../views/index/Gotoup";
    import GoodsShow from "../views/index/GoodsShow";
    //这个是主页
    export default {
        name: "Index",

        components: {GoodsShow, Gotoup, SlideShow},

    }
</script>

<style scoped>

</style>