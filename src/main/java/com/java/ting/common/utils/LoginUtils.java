package com.java.ting.common.utils;

import com.java.ting.dao.UserDao;
import com.java.ting.entity.User;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 用户工具类
 *
 * @author tingOu
 */
public class LoginUtils {

    @Autowired
    private UserDao userDao;

    /**
     * 获取登录用户的用户名
     *
     * @return
     */
    public String getUserName() {
        return (String) SecurityUtils.getSubject().getPrincipal();
    }

    /**
     * 获取当前登录的用户名
     *
     * @return
     */
    public User getLoginUser() {
        String username = getUserName();
        User user = userDao.getUser(username);
        return user;
    }

}
