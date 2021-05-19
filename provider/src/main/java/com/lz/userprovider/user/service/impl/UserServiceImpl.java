package com.lz.userprovider.user.service.impl;

import com.lz.rh.common.core.api.Res;
import com.lz.rh.common.core.api.ResultCode;
import com.lz.rhapi.user.dto.UserDto;
import com.lz.rhapi.user.entity.UserEntity;
import com.lz.rhapi.user.service.UserService;
import com.lz.userprovider.user.mapper.UserMapper;
import org.apache.catalina.User;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.ibatis.jdbc.Null;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@DubboService(version = "1.0.0")
@Component
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    /**
     * 用户注册
     *
     * @param userEntity
     * @return
     */
    @Transactional
    @Override
    public Res<Null> userRegistry(UserEntity userEntity) {
        //TODO 用户注册

        return null;
    }


    /**
     * 用户登录
     *
     * @param userDto
     * @return
     */
    @Override
    public Res<UserEntity> userLogin(UserDto userDto) {
        // TODO 用户登录
        System.out.println("到此");
        return userQuery(userDto);
    }

    @Transactional
    @Override
    public Res userDel(String uId) {
        Integer ret = userMapper.userDel(uId);
        if (ret > 0){
            return new Res(true,"用户删除成功");
        }
        return new Res(false,"用户删除失败");
    }

    /**
     * 用户更新
     *
     * @param userEntity
     * @return
     */
    @Override
    public Res userUpdate(UserEntity userEntity) {
        return null;
    }

    /**
     * 根据id查用户
     *
     * @param uIds
     * @return
     */
    @Override
    public List<UserEntity> userQuery(String[] uIds) {
        return null;
    }

    /**
     * 用邮箱或用户名及密码查询用户，主要用于登录
     *
     * @param userDto
     * @return
     */
    @Override
    public Res<UserEntity> userQuery(UserDto userDto) {
        UserEntity user = userMapper.userQuery(userDto);
        return new Res<>(user);
    }

    /**
     * 查询所有用户
     *
     * @return
     */
    public Res<List<UserEntity>> userQuery(){
        return new Res<>(ResultCode.SUCCESS.getCode(),"成功");
    }


}
