package com.java.ting.util;

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
     * @return 用户名称
     */
    public String getUserName() {
        return (String) SecurityUtils.getSubject().getPrincipal();
    }

    /**
     * 获取当前登录的用户信息
     *
     * @return {@link com.java.ting.domain.AdminUser} 用户信息
     */
    public AdminUser getLoginUser() {
        String username = getUserName();
        AdminUser adminUser = new AdminUser();
        adminUser.setLoginName(username);
        adminUser = adminUserMapper.getOneByCondition(adminUser);
        return adminUser;
    }

}
