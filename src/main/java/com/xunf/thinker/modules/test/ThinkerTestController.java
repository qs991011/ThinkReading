package com.xunf.thinker.modules.test;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Api(tags = "仅仅只是测试")
public class ThinkerTestController {

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    @ApiOperation(value = "测试用例",notes = "先生相关消息")
    public String hello() {
        return "hello world";
    }

}
