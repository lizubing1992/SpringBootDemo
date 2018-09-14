package com.lizubing1992.demo.controller;

import com.lizubing1992.demo.model.UserDO;
import com.lizubing1992.demo.service.IndexService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by administrator on 2018/9/14.
 * 测试swagger2 接口文档数据
 */
@RestController
@RequestMapping("/gamma")
public class HelloWorldController {
    @Autowired
    private IndexService indexService;

    @ApiOperation(value="获取客户数据", notes="获取客户数据")
    @ApiImplicitParam(name = "id", value = "客户id", required = true, dataType = "string", paramType = "query")
    @GetMapping("/index")
    public UserDO index(Integer id){
        return indexService.getUserById(id);
    }


}
