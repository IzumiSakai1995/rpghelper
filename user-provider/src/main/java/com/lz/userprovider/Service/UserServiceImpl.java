package com.lz.userprovider.Service;
import com.lz.rhapi.pojo.Res;
import com.lz.rhapi.pojo.User;
import com.lz.rhapi.serivce.UserService;
import com.lz.rhdatabase.dao.userdao.UserMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
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


}
