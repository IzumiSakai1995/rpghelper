package com.lz.rhconsumer.user.controller;

import com.lz.rh.common.core.api.Res;
import com.lz.rh.common.core.utils.BeanConvertUtil;
import com.lz.rhapi.user.dto.UserDto;
import com.lz.rhapi.user.entity.UserEntity;
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
    public Res userLogin(@RequestBody UserDto userDto){
        Res res = userService.userLogin(userDto);
        return res;
    }

    @ApiOperation("用户查询")
    @GetMapping("query")
    public Res userQuery(String[] uIds){
        userService.userQuery(uIds);
        return new Res<>();
    }

    @ApiOperation("查询所有用户")
    @GetMapping("queryAll")
    public Res userQuery(){
        return userService.userQuery();
    }


    @ApiOperation("用户注册")
    @PostMapping("registry")
    public String userRegistry(@RequestBody UserDto userDto){
        UserEntity userEntity = BeanConvertUtil.convertBean(userDto, UserEntity.class);
        System.out.println("发生了一次请求");
        userService.userRegistry(userEntity);
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
    public Res userUpdate(@RequestBody UserEntity userEntity){
        userService.userUpdate(userEntity);
        return new Res();
    }

}
