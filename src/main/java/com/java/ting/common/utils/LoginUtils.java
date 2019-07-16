package com.java.ting.common.utils;

import com.java.ting.domain.AdminUser;
import com.java.ting.mapper.AdminUserMapper;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 用户工具类
 *
 * @author tingOu
 */
public class LoginUtils {

    @Autowired
    private AdminUserMapper adminUserMapper;

    /**
     * 获取登录用户的用户名
     *
     * @return
     */
    public String getUserName() {
        return (String) SecurityUtils.getSubject().getPrincipal();
    }

    /**
     * 获取当前登录的用户信息
     *
     * @return
     */
    public AdminUser getLoginUser() {
        String username = getUserName();
        AdminUser adminUser = new AdminUser();
        adminUser.setLoginName(username);
        adminUser = adminUserMapper.getOneByCondition(adminUser);
        return adminUser;
    }

}
