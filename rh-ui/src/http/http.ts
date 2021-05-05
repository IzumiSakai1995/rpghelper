import axios,{AxiosRequestConfig,AxiosResponse} from 'axios'
import {ElLoading} from 'element-plus'
import {RequestFunc} from '../interface/func'

// 接口域名

let baseUrl = 'http://localhost:8083'



// 请求方法
export const request:RequestFunc<any> = (url,data,method) => {
    axios({
        method:method,
        url: `${baseUrl}/${url}`,
        data: data
})
}

export const postRequest:RequestFunc<any> = (url,data)=>{
    request(url,data,'post')
}

export const getRequest:RequestFunc<any> = (url,data) =>{
    request(url,data,'get');
}

export const delRequest:RequestFunc<any> = (url,data) =>{
    request(url,data,'delete')
}

export const putRequest:RequestFunc<any> = (url,data) =>{
    request(url,data,'put')
}


// 加载
let loading:any


// 开始加载
const startLoading=()=>{

    interface Options {
        lock: boolean;
        text: string;
        background: string;
    }

    const options:Options = {
        lock:true,
        text:"加载中...",
        background:'rgba(0,0,0,0.7)'
    }
    loading= ElLoading.service(options)
}

// 结束加载
const endLoading=()=>{
    loading.close();
}

// 请求拦截
axios.interceptors.request.use((config:AxiosRequestConfig)  =>{
    startLoading();
    return config;
});

axios.interceptors.response.use((response:AxiosResponse<any>) =>{
    endLoading();
    return response; 
},error=>{
    endLoading();
    // 错误提醒
     return Promise.reject(error);
})

// 响应拦截



export default axios;