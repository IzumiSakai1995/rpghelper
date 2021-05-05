
export interface User{
    id?: string,
    name?:string,
    account?: string,
    email?: string,
    password?: string,
    password2?: string,
    phone?:string,
    sex?:string,
}

export interface Game{
    id:string,
    name:string,
}

export interface Character{
    id: string,
    name: string,
    stars?: string,
    rare?: string,
    gId?: string,
}


