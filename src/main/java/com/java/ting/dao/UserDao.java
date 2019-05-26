package com.java.ting.dao;

import com.java.ting.entity.User;

public interface UserDao {
    /**
     * 根据用户名获取密码
     *
     * @param username
     * @return
     */
    String getPassword(String username);

    /**
     * 根据用户名获取用户信息
     *
     * @param username
     * @return
     */
    User getUser(String username);
}
