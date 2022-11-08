<template>
<a-layout>
  <!-- 不变的部分写道app。vue  变化的部分写到路由的文件中 -->
    <the-header></the-header>

    <router-view/>

    <the-footer></the-footer>
  </a-layout>
</template>

<script lang="ts">
  import { defineComponent } from "vue";
  import TheHeader from "@/components/the-header.vue";
  import TheFooter from "@/components/the-footer.vue";

  export default defineComponent({
    name: 'app',
    components:{
      TheHeader,
      TheFooter
    }
  })
</script>

<style>
#components-layout-demo-top-side-2 .logo {
  float: left;
  width: 120px;
  height: 31px;
  margin: 16px 24px 16px 0;
  background: rgba(255, 255, 255, 0.3);
}

.ant-row-rtl #components-layout-demo-top-side-2 .logo {
  float: right;
  margin: 16px 0 16px 24px;
}

.site-layout-background {
  background: #fff;
}
</style>


