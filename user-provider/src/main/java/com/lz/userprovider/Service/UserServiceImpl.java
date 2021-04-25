package com.lz.userprovider.Service;
import com.lz.rhapi.pojo.Res;
import com.lz.rhapi.pojo.User;
import com.lz.rhapi.serivce.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@DubboService(version = "1.0.0")
@Component
public class UserServiceImpl implements UserService {


    @Override
    public Integer returnTest() {
        return 1;
    }

    @Override
    public Res userRegistry(User user) {
        return null;
    }

    @Override
    public Res userLogin() {
        return null;
    }


}
