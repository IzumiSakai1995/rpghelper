import { createApp } from 'vue'
import App from './App.vue'
import './index.css'
import ElementPlus from 'element-plus'
import 'element-plus/lib/theme-chalk/index.css';
import router from './router/index'
import axios from 'axios'

//@ts-ignore
const app = createApp(App)

// 全局挂载axios
app.config.globalProperties.$axios = axios;


app.use(router)
app.use(ElementPlus)



app.mount('#app')