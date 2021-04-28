package com.lz.rhdatabase.dao.userdao;

import com.lz.rhapi.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 用户dao
 */
@Mapper
@Component
public interface UserMapper {
    String userInsert(User user);

    String userDel();

    String userQuery();

}
