package com.lz.rhapi.account.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 账号数据传输对象
 */
@ApiModel("账号数据传输对象")
public class AccountDto implements Serializable {
    @ApiModelProperty("账号")
    private String account;

    @ApiModelProperty("密码")
    private String password;


}
