package com.lz.rhdatabase.dao.userdao;

import com.lz.rhapi.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 用户dao
 */
@Mapper
@Component
public interface UserMapper {
    String userInsert(User user);

    String userDel();

    String userQuery();

    String userDel(String uId);
}
