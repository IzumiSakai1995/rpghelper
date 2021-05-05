export interface RequestFunc<T> {
    (url:T,data:T,method?:T,header?:any);
}