package com.java.ting.controller.web;

import com.java.ting.common.ResponseCode;
import com.java.ting.common.ResponseVo;
import com.java.ting.util.ResponseUtils;
import com.java.ting.service.redis.RedisTestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 测试类
 *
 * @author tingOu
 */
@Api
@RestController
@RequestMapping(value = "/web")
@Slf4j
public class TestController {

    @Autowired
    private RedisTestService redisTestService;


    @ApiOperation(value = "测试用例", notes = "测试用例")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ResponseVo test(@RequestParam String name) {
        log.info("111111111111111111111111");
        return ResponseUtils.buildResponseCode(ResponseCode.SUCCESS_CODE, name);
    }

    @ApiOperation(value = "给name添加value操作", notes = "redis")
    @GetMapping(value = "/redisAddTest/{value}")
    public ResponseVo redisAddTest(@PathVariable(value = "value") String value) {
        return redisTestService.redisAddTest(value);

    }

    @ApiOperation(value = "根据key获取value", notes = "redis")
    @GetMapping(value = "/redisGetTest/{key}")
    public ResponseVo redisGetTest(@PathVariable(value = "key") String key) {
        return redisTestService.redisGetTest(key);

    }

    @ApiOperation(value = "根据key获取value（list）", notes = "redis")
    @GetMapping(value = "/redisList/")
    public ResponseVo redisList() {
        return redisTestService.redisAddTest();
    }


}
