import axios,{postRequest,getRequest, putRequest,delRequest} from '../http/http'
import {User} from '../interface/pojo'


export const userLogin= (user:User) =>{
    postRequest('user/login',user);
}

export const userRegistery = (user:User) =>{
    postRequest('user/registry',user)
}

export const userDel = (uId:string) =>{
    delRequest('user/delete',uId)
}

export const userUpdate = (user:User) =>{
    putRequest('user/update',user)
}