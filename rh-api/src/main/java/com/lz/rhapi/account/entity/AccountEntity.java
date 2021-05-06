package com.lz.rhapi.account.entity;

import com.lz.rhapi.character.entity.CharacterEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 游戏账号实体
 */
@ApiModel("游戏账号实体")
@Data
@NoArgsConstructor
public class AccountEntity implements Serializable {
    @ApiModelProperty("账号id")
    private long id;

    @ApiModelProperty("账号")
    private String account;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("角色")
    private List<Long> characterIds;

    @ApiModelProperty("所属游戏id")
    private long gId;

    private enum state{
        /**
         * 已售出
         */
        sold,
        /**
         * 正常
         */
        normal,
        /**
         * 废弃
         */
        abandoned

    }

}
