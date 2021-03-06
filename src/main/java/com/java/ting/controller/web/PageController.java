package com.java.ting.controller.web;

import com.java.ting.common.ResponseVo;
import com.java.ting.common.page.PageModelDto;
import com.java.ting.service.AdminUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 分页测试
 *
 * @author LISHUANG
 * @date 2020/1/3
 */
@RestController
@RequestMapping(value = "/web")
@Slf4j
@Api
public class PageController {

    private AdminUserService adminUserService;

    @Autowired
    public PageController(AdminUserService adminUserService) {
        this.adminUserService = adminUserService;
    }


    @ApiOperation(value = "分页测试用例", notes = "PageHelper")
    @PostMapping(value = "/pageTest")
    public ResponseVo pageTest(@RequestBody PageModelDto pageModelDto) {
        return adminUserService.pageAdminUser(pageModelDto);
    }

}
