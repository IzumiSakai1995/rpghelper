import { createApp } from 'vue'
import App from './App.vue'
import './index.css'
import ElementPlus from 'element-plus'
createApp(App).mount('#app')
const app = App
app.use(ElementPlus,{size: 'small',zIndex:3000});
