package com.lz.rh.common.core.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 统一返回结果
 * @param <T>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Res<T> {
    private Integer code;
    private String msg;
    private T data;

    public Res(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Res(Integer code,T data){
        this.code = code;
        this.data = data;
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     * @param <T>
     * @return
     */
    public static <T> Res<T> success(T data) {
        return new Res<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
    }

    /**
     * 成功返回结果
     *
     * @param data    获取的数据
     * @param message 提示信息
     * @param <T>
     * @return
     */
    public static <T> Res<T> success(T data, String message) {
        return new Res<T>(ResultCode.SUCCESS.getCode(), message, data);
    }

    /**
     * 失败返回结果
     *
     * @param errorCode 错误码
     * @param <T>
     * @return
     */
    public static <T> Res<T> failed(IErrorCode errorCode) {
        return new Res<T>(errorCode.getCode(), errorCode.getMessage(), null);
    }

    /**
     * 失败返回结果
     *
     * @param errorCode 错误码
     * @param message   提示信息
     * @param <T>
     * @return
     */
    public static <T> Res<T> failed(IErrorCode errorCode, String message) {
        return new Res<T>(errorCode.getCode(), message, null);
    }

    /**
     * 失败返回结果
     *
     * @param message 提示信息
     * @param <T>
     * @return
     */
    public static <T> Res<T> failed(String message) {
        return new Res<T>(ResultCode.FAILED.getCode(), message, null);
    }


    /**
     * 失败返回结果
     *
     * @param <T>
     * @return
     */
    public static <T> Res<T> failed() {
        return failed(ResultCode.FAILED);
    }

    /**
     * 参数验证失败返回结果
     *
     * @param <T>
     * @return
     */
    public static <T> Res<T> validateFailed() {
        return failed(ResultCode.VALIDATE_FAILED);
    }

    /**
     * 提示信息
     *
     * @param message 提示信息
     * @param <T>
     * @return
     */
    public static <T> Res<T> validateFailed(String message) {
        return new Res<T>(ResultCode.VALIDATE_FAILED.getCode(), message, null);
    }

    /**
     * 未登录返回结果
     *
     * @param data 获取的数据
     * @param <T>
     * @return
     */
    public static <T> Res<T> unauthorized(T data) {
        return new Res<T>(ResultCode.UNAUTHORIZED.getCode(), ResultCode.UNAUTHORIZED.getMessage(), data);
    }

    /**
     * 未授权返回结果
     *
     * @param data 获取的数据
     * @param <T>
     * @return
     */
    public static <T> Res<T> forbidden(T data) {
        return new Res<T>(ResultCode.FORBIDDEN.getCode(), ResultCode.FORBIDDEN.getMessage(), data);
    }
}
