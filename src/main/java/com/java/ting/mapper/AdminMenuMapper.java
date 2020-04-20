package com.java.ting.mapper;

import com.java.ting.domain.AdminMenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * AdminMenuMapper数据库操作接口类
 *
 * @author tingOu
 **/
@Mapper
public interface AdminMenuMapper {


    /**
     * 查询（根据主键ID查询）
     **/
    AdminMenu selectByPrimaryKey(@Param("id") Integer id);

    /**
     * 添加
     **/
    int insert(AdminMenu adminMenu);

    /**
     * 添加 （匹配有值的字段）
     **/
    int insertSelective(AdminMenu adminMenu);

    /**
     * 修改 （匹配有值的字段）
     **/
    int updateByPrimaryKeySelective(AdminMenu adminMenu);

    /**
     * 分页查询</br>eg: xx.getByPage(null, 0, 3, "id", "desc");
     **/
    List<AdminMenu> getByPage(@Param("adminMenu") AdminMenu adminMenu, @Param("start") Integer start, @Param("limit") Integer limit, @Param("orderColumn") String orderColumn, @Param("orderType") String orderType);

    /**
     * 根据实体属性查询
     **/
    List<AdminMenu> getListByCondition(@Param("adminMenu") AdminMenu adminMenu);

    /**
     * 根据实体属性查询
     **/
    int getCountByCondition(@Param("adminMenu") AdminMenu adminMenu);

    /**
     * 查询单条数据
     **/
    AdminMenu getOneByCondition(@Param("adminMenu") AdminMenu adminMenu);

}