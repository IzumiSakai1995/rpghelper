package com.lz.userprovider.Service;
import com.lz.rhapi.common.Res;
import com.lz.rhapi.user.entity.User;
import com.lz.rhapi.user.service.UserService;
import com.lz.rhdatabase.dao.userdao.UserMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@DubboService(version = "1.0.0")
@Component
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;


    @Override
    public Integer returnTest() {
        return 1;
    }

    @Override
    public Res userRegistry(User user) {
        userMapper.userInsert(user);
        return null;
    }

    @Override
    public Res userLogin() {
        return null;
    }

    @Override
    public Res userLogin(User user) {
        return null;
    }

    @Override
    public Res userDel(String uId) {
        userMapper.userDel(uId);
        return null;
    }


}
