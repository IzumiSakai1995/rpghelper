package com.lz.rhconsumer.controller;

import com.lz.rhapi.pojo.User;
import com.lz.rhapi.serivce.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @ApiOperation("用户登录")
    @PostMapping("login")
    public String userLogin(@RequestBody String user){
        System.out.println(user);
        return "";
    }


    @ApiOperation("用户插入")
    @PostMapping("registry")
    public String userRegisty(@RequestBody User user){
        userService.userRegistry(user);
        return "";
    }
}
