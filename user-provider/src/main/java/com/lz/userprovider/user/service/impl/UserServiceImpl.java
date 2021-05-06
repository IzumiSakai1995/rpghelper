package com.lz.userprovider.user.service.impl;

import com.lz.rh.common.core.api.Res;
import com.lz.rh.common.core.api.ResultCode;
import com.lz.rhapi.user.dto.UserDto;
import com.lz.rhapi.user.entity.UserEntity;
import com.lz.rhapi.user.service.UserService;
import com.lz.userprovider.user.mapper.UserMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

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
    public Res userRegistry(UserEntity userEntity) {
        return null;
    }

    @Override
    public Res userLogin() {
        return null;
    }

    @Override
    public Res userLogin(UserDto userDto) {
        System.out.println("到此");
        return userQuery(userDto);
    }

    @Override
    public Res userLogin(UserEntity userEntity) {
        return null;
    }

    @Override
    public Res userDel(String uId) {
        userMapper.userDel(uId);
        return null;
    }

    @Override
    public Res userUpdate(UserEntity userEntity) {
        return null;
    }

    @Override
    public List<UserEntity> userQuery(String[] uIds) {
        return null;
    }

    @Override
    public Res<UserEntity> userQuery(UserDto userDto) {
        return new Res<>(ResultCode.SUCCESS.getCode(),"成功");
    }

    public Res<List<UserEntity>> userQuery(){
        return new Res<>(ResultCode.SUCCESS.getCode(),"成功");
    }


}
