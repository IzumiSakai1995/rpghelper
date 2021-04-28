package com.lz.rhconsumer.controller;

import com.lz.rhapi.pojo.User;
import com.lz.rhapi.serivce.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "用户类",tags = "用户操作接口")
@RestController
@RequestMapping("user")
public class UserController implements CommandLineRunner {
    @DubboReference(version = "1.0.0")
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(userService.returnTest());
    }


    @ApiOperation("用户插入")
    @PostMapping("registry")
    public String userRegisty(User user){
        userService.userRegistry(user);
        return "";
    }
}
