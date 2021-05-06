package com.lz.rhapi.character.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel("角色")
public class CharacterEntity implements Serializable {
    Long id;

    /**
     * 所属游戏id
     */
    String gId;

    /**
     * 角色名
     */
    String name;

    /**
     * 星级/稀有度
     */
    String star;

    /**
     * 头像地址
     */
    String avatarUrl;

    @Override
    public String toString() {
        return "Character{" +
                "id='" + id + '\'' +
                ", gId='" + gId + '\'' +
                ", name='" + name + '\'' +
                ", star='" + star + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                '}';
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getgId() {
        return gId;
    }

    public void setgId(String gId) {
        this.gId = gId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
