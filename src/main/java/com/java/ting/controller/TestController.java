package com.java.ting.controller;

import com.java.ting.common.ResponseCode;
import com.java.ting.common.ResponseVo;
import com.java.ting.common.utils.ResponseUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试类
 *
 * @author tingOu
 */
@RestController
public class TestController {

    @RequestMapping("front/test")
    public ResponseVo test() {
        System.out.println("111111111111111111111111");
        return ResponseUtils.buildResponseCode(ResponseCode.SUCCESS_CODE);
    }
}
