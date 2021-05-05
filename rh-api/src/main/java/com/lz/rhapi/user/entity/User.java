package com.lz.rhapi.user.entity;



import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel(value = "userModel")
public class User {
    @ApiModelProperty(value = "${userModel.id}",name = "id")
    Integer id;
    @ApiModelProperty(value = "${userModel.name}",name = "name")
    String name;
    @ApiModelProperty(value = "${userModel.phoneNum}",name = "phoneNum")
    String phoneNum;
}
