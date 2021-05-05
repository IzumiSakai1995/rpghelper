package com.lz.rhconsumer.controller;

import com.lz.rhapi.common.Res;
import com.lz.rhapi.user.entity.User;
import com.lz.rhapi.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@Api(value = "用户类",tags = "用户操作接口")
@RestController
@RequestMapping("user")
public class UserController implements CommandLineRunner {


    @DubboReference(version = "1.0.0")
    private UserService userService;


    @Override
    public void run(String... args) {
        System.out.println(userService.returnTest());
    }

    @ApiOperation("用户登录")
    @PostMapping("login")
    public String userLogin(@RequestBody String user){
        System.out.println(user);
        userService.userLogin();
        return "";
    }


    @ApiOperation("用户注册")
    @PostMapping("registry")
    public String userRegistry(@RequestBody User user){
        userService.userRegistry(user);
        return "";
    }

    @ApiOperation("用户删除")
    @DeleteMapping("delete")
    public Res userDel(@RequestParam String uId){
        userService.userDel(uId);
        return new Res();
    }

    @ApiOperation("用户修改")
    @PutMapping("update")
    public Res userUpdate(@RequestBody User user){
        return new Res();
    }

}
