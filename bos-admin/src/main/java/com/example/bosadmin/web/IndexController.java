package com.example.bosadmin.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "首页",tags =   "首页相关接口")
@RestController
public class IndexController {

    @GetMapping(value = "/index")
    @ApiOperation(value = "首页", httpMethod = "GET" ,response = String.class)
    public String index(){

        return  "admin";
    }


}
