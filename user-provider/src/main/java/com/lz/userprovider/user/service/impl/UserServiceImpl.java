package com.lz.userprovider.user.service.impl;

import com.lz.rh.common.core.api.Res;
import com.lz.rhapi.user.entity.User;
import com.lz.rhapi.user.service.UserService;
import com.lz.userprovider.user.mapper.UserMapper;
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
        Object obj = userMapper.userInsert(user);
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

    @Override
    public Res userUpdate(User user) {
        return userMapper.userUpdate(user);
    }

    public Res userQuery(){
         userMapper.userQuery();
        return new Res();
    }


}
