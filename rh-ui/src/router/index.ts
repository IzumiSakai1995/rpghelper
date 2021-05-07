import {createRouter,createWebHistory} from 'vue-router';

const routes = [
    {
        path: '/',
        name: 'Index',
        component: ()=>import('../views/Index.vue')
    },
    {
        path: '/login',
        name: 'LoginRegister',
        component:()=>import('../views/LoginRegister.vue')
    },
    {
        path: '/:catchAll(.*)',
        name: '404',
        component:()=>import('../errors/404.vue')
    },
    {
        path: '/admin',
        name: 'admin',
        component:()=>import('../views/Admin.vue')
    }
    
]

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes
})

export default router