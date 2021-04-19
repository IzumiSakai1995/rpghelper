package com.lz.rhprovider.Service;

import com.lz.rhapi.pojo.Res;
import com.lz.rhapi.serivce.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

@DubboService(version = "1.0.0")
@Component
public class UserServiceImpl implements UserService {
    @Override
    public Integer returnTest() {
        return 1;
    }

    @Override
    public Res userRegistry() {
        return null;
    }
}
