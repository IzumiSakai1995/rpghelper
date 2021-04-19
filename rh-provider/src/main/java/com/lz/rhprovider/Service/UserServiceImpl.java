package com.lz.rhprovider.Service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

@DubboService(version = "1.0.0")
@Component
public class UserServiceImpl implements UserService{
    public Integer returnTest() {
        return 1;
    }

}
