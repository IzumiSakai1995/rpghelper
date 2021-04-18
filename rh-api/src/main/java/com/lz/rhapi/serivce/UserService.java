package com.lz.rhapi.serivce;

import com.lz.rhapi.pojo.Res;
import org.springframework.stereotype.Component;

/**
 * 用户接口
 */

@Component
public interface UserService {
    /**
     * 接口测试
     * @return
     */
    Integer returnTest();

    /**
     * 用户注册
     * @return
     */
    Res userRegistry();
}
