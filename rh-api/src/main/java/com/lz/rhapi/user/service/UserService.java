package com.lz.rhapi.user.service;

import com.lz.rh.common.core.api.Res;
import com.lz.rhapi.user.dto.UserDto;
import com.lz.rhapi.user.entity.UserEntity;
import org.springframework.stereotype.Component;

import java.util.List;

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
    Res userRegistry(UserEntity userEntity);

    /**
     * 用户登录
     * @return
     */
    Res userLogin();

    /**
     * 用户登录
     *
     * @param userEntity
     * @return
     */
    Res userLogin(UserEntity userEntity);

    /**
     * 用户登录
     *
     * @param userDto
     * @return
     */
    Res userLogin(UserDto userDto);

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
     * @param userEntity
     * @return
     */
    Res userUpdate(UserEntity userEntity);

    /**
     * 批量用户查询
     * @param uIds
     * @return
     */
    List<UserEntity> userQuery(String[] uIds);

    /**
     * 使用邮箱或者用户名及密码查询用户，用于登录
     *
     * @param userDto
     * @return
     */
    Res userQuery(UserDto userDto);


    Res<List<UserEntity>> userQuery();
}
