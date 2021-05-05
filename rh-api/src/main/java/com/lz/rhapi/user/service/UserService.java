package com.lz.rhapi.user.service;

import com.lz.rh.common.core.api.Res;
import com.lz.rhapi.user.entity.User;
import org.springframework.stereotype.Component;

/**
 * 用户接口
 */

@Component
public interface UserService {
    /**
     * 接口测试
     * @return
     */
    Integer returnTest();

    /**
     * 用户注册
     * @return
     */
    Res userRegistry(User user);

    /**
     * 用户登录
     * @return
     */
    Res userLogin();

    /**
     * 用户登录
     *
     * @param user
     * @return
     */
    Res userLogin(User user);

    /**
     * 用户删除
     *
     * @param uId
     * @return
     */
    Res userDel(String uId);

    /**
     * 用户更新
     *
     * @param user
     * @return
     */
    Res userUpdate(User user);
}
