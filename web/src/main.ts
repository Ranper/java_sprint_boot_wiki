import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import Antd from 'ant-design-vue'
import 'ant-design-vue/dist/antd.css';
import * as Icons from '@ant-design/icons-vue';
import axios from 'axios';
axios.defaults.baseURL =  process.env.VUE_APP_SERVER; //设置axios的baseurl，注意不是vue的baseurl， 相当于在axios请求的时候只需要填写路径即可

const app = createApp(App);
app.use(store).use(router).use(Antd).mount('#app');

// 全局使用图标
const icons: any = Icons;
for (const i in icons){
    app.component(i, icons[i]);
}

// process.env  固定的读取环境变量的方式
console.log("运行环境为:", process.env.NODE_ENV)
console.log('服务端：', process.env.VUE_APP_SERVER);