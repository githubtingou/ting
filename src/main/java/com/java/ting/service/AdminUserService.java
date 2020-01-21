package com.java.ting.service;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.java.ting.common.ResponseCode;
import com.java.ting.common.ResponseVo;
import com.java.ting.common.page.PageInfoDto;
import com.java.ting.common.page.PageModelDto;
import com.java.ting.domain.AdminUser;
import com.java.ting.mapper.AdminUserMapper;
import com.java.ting.util.ResponseUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户service
 *
 * @author tingOu
 */
@Service
@Slf4j
public class AdminUserService {
    @Autowired
    private AdminUserMapper adminUserMapper;

    /**
     * 分页测试用例
     *
     * @return {@link ResponseVo} 分页后的数据
     */
    public ResponseVo pageAdminUser(PageModelDto pageModelDto) {
        PageHelper.startPage(pageModelDto.getCurrentPage(), pageModelDto.getPageSize());
        List<AdminUser> listByCondition = adminUserMapper.getListByCondition(new AdminUser());
        PageInfo<AdminUser> pageInfo = new PageInfo<>(listByCondition);
        log.info("分页数据：{}", JSON.toJSONString(pageInfo));
        return ResponseUtils.buildResponseCode(ResponseCode.SUCCESS_CODE, new PageInfoDto(pageInfo));
    }

    /**
     * 添加几条数据作为测试用
     */
    @Deprecated
    public void addAdminUser() {
        String name = "lisi";
        for (int i = 0; i < 20; i++) {
            AdminUser user = new AdminUser();
            user.setLoginName(name + i);
            user.setPassword(name + i);
            adminUserMapper.insertSelective(user);
        }
    }
}
