package com.lz.rhconsumer.account.cotroller;

import com.lz.rh.common.core.api.Res;
import com.lz.rh.common.core.api.ResultCode;
import com.lz.rhapi.account.dto.AccountDto;
import com.lz.rhapi.account.entity.AccountEntity;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("账号api")
@RequestMapping("account")
public class AccountController {
    @PostMapping("insert")
    public Res accountInsert(AccountDto accountDto){
        AccountEntity accountEntity = new AccountEntity();
        return new Res(ResultCode.SUCCESS.getCode(),"添加成功");
    }

    @PostMapping("query")
    public Res accountQuery(String uId){
        return new Res();
    }


}
