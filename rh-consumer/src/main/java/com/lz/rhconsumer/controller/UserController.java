package com.lz.rhconsumer.controller;

import com.lz.rhapi.serivce.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserController implements CommandLineRunner {
    @DubboReference(version = "1.0.0")
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        userService.returnTest();
    }
}
