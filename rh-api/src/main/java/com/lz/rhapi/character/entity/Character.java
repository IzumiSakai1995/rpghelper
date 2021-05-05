package com.lz.rhapi.character.entity;

import java.io.Serializable;

public class Character implements Serializable {
    String id;

    /**
     * 所属游戏id
     */
    String gameId;

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
                ", gameId='" + gameId + '\'' +
                ", name='" + name + '\'' +
                ", star='" + star + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                '}';
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
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
