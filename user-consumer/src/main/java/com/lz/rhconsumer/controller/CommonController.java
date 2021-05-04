package com.lz.rhconsumer.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "公共类",tags = "公共接口")
@RequestMapping("/")
public class CommonController {

    @RequestMapping("/")
    @ApiOperation("跳转首页")
    public String homePage(){
        return "";
    }
}
