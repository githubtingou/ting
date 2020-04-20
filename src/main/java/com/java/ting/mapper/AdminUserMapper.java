package com.java.ting.mapper;

import com.java.ting.domain.AdminUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * AdminUserMapper数据库操作接口类
 *
 * @author tingOu
 **/
public interface AdminUserMapper {


    /**
     * 查询（根据主键ID查询）
     **/
    AdminUser selectByPrimaryKey(@Param("id") Integer id);

    /**
     * 添加
     **/
    int insert(AdminUser adminUser);

    /**
     * 添加 （匹配有值的字段）
     **/
    int insertSelective(AdminUser adminUser);

    /**
     * 修改 （匹配有值的字段）
     **/
    int updateByPrimaryKeySelective(AdminUser adminUser);

    /**
     * 分页查询</br>eg: xx.getByPage(null, 0, 3, "id", "desc");
     **/
    List<AdminUser> getByPage(@Param("adminUser") AdminUser adminUser, @Param("start") Integer start, @Param("limit") Integer limit, @Param("orderColumn") String orderColumn, @Param("orderType") String orderType);

    /**
     * 根据实体属性查询
     **/
    List<AdminUser> getListByCondition(@Param("adminUser") AdminUser adminUser);

    /**
     * 根据实体属性查询
     **/
    int getCountByCondition(@Param("adminUser") AdminUser adminUser);

    /**
     * 查询单条数据
     **/
    AdminUser getOneByCondition(@Param("adminUser") AdminUser adminUser);

}