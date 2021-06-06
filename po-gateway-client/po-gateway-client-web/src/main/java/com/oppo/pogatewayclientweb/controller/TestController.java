package com.oppo.pogatewayclientweb.controller;

import com.oppo.pogatewayclientapi.api.TestService;
import com.oppo.pogatewayclientapi.entity.User;
import com.oppo.pogatewayclientcommon.Result;
import com.oppo.pogatewayclientcommon.ResultInfo;
import com.oppo.pogatewayclientweb.handler.exception.MyRuntimeException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Andy on 2021/6/4 22:50
 */
@RestController
@Api(tags = "测试模块")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    @ApiOperation("测试接口")
    public Result test() {
        String test = testService.test();
//        自定义异常
//        throw new MyRuntimeException(ResultInfo.GLOBAL_ERROR);
        if (!StringUtils.isEmpty(test)) {
            return Result.success().codeAndMessage(ResultInfo.SUCCESS).data("info", test);
        }
        return Result.error().codeAndMessage(ResultInfo.NOT_FOUND);
//        User user= testService.getUserById(1);
//        return Result.success().data("data",user);
    }
}
