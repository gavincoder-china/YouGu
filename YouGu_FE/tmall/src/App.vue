<template>
  <div id="app">
   <Head />
      <SlideShow/>
      <Gotoup />
      <GoodsShow />
      <Footer />

  </div>
</template>

<style>

</style>



<script>
  import Head from "./views/Head";
  import Footer from "./views/Footer";
  import SlideShow from "./views/SlideShow";
  import Gotoup from "./views/Gotoup";
  import GoodsShow from "./views/GoodsShow";


  export default {

    components: {GoodsShow, Gotoup, SlideShow, Footer, Head},


  }
</script>