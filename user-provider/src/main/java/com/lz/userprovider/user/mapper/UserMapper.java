package com.lz.userprovider.user.mapper;

import com.lz.rhapi.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 用户dao
 */

@Component
@Mapper
public interface UserMapper {
    Integer userInsert(UserEntity user);

    String userQuery();

    String userDel(String uId);

    Integer userUpdate(UserEntity user);
}
