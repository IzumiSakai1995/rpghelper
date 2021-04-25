package com.lz.rhdatabase.dao.userdao;

import com.lz.rhapi.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户dao
 */
@Mapper
public interface UserMapper {
    String userInsert(User user);

    String userDel();

    String userQuery();

}
