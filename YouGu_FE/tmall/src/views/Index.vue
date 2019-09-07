<template>
    <div>

        <SlideShow/>
        <Gotoup />
        <GoodsShow />
    </div>

</template>

<script>
    import SlideShow from "./index/SlideShow";
    import Gotoup from "./index/Gotoup";
    import GoodsShow from "./index/GoodsShow";
    //这个是主页
    export default {
        name: "Index",

        components: {GoodsShow, Gotoup, SlideShow},

    }
</script>

<style scoped>

</style>