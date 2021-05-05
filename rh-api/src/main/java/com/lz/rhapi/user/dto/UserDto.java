package com.lz.rhapi.user.dto;


import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

@ApiModel("前端dto")
@Data
public class UserDto implements Serializable {

    private long id;

    private String name;

    private String phoneNum;

    private String email;

    private String password;


}
