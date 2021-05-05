package com.lz.userprovider.user.mapper;

import com.lz.rh.common.core.api.Res;
import com.lz.rhapi.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 用户dao
 */

@Component
@Mapper
public interface UserMapper {
    String userInsert(User user);

    String userQuery();

    String userDel(String uId);

    Res userUpdate(User user);
}
