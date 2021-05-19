package com.lz.provider.user.mapper;

import com.lz.rhapi.user.dto.UserDto;
import com.lz.rhapi.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 用户dao
 */

@Component
@Mapper
public interface UserMapper {

    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    Integer userInsert(UserEntity user);

    /**
     * 删除用户
     *
     * @param uId
     * @return
     */
    Integer userDel(String uId);

    /**
     * 用户更新
     *
     * @param user
     * @return
     */
    Integer userUpdate(UserEntity user);

    /**
     * 查询所有用户
     * @return
     */
    List<UserEntity> usersQuery();

    /**
     * 通过邮箱+密码查询用户登录并返回用户数据
     *
     * @param userDto
     * @return
     */
    UserEntity userQuery(UserDto userDto);
}
