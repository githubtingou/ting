package com.java.ting.dao;

import com.java.ting.entity.Role;

import java.util.List;

public interface RoleDao {
    List<Role> selectRole(String username);
}
