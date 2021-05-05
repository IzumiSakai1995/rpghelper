package com.lz.rhapi.game.service;

import com.lz.rhapi.game.entitiy.Game;
import com.lz.rhapi.common.Res;
import org.springframework.stereotype.Component;

@Component
public interface GameService {
    Res gameInsert(Game game);

    Res gameDel(String gId);

    /**
     * 游戏查询
     * @param gId
     * @return
     */
    Res gameQuery(String gId);

    /**
     * 游戏查询，批量
     * @param gIds
     * @return
     */
    Res gameQuery(String[] gIds);

}
