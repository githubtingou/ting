package com.java.ting.mapper;
import java.util.List;
import com.java.ting.domain.SysRoleMenu;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * SysRoleMenuMapper数据库操作接口类
 *@author tingOu
 **/

public interface SysRoleMenuMapper{


	/**
	 * 
	 * 查询（根据主键ID查询）
	 *
	 **/
	SysRoleMenu  selectByPrimaryKey(@Param("id") Integer id);

	/**
	 * 
	 * 添加
	 *
	 **/
	int insert(SysRoleMenu sysRoleMenu);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 *
	 **/
	int insertSelective(SysRoleMenu sysRoleMenu);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 *
	 **/
	int updateByPrimaryKeySelective(SysRoleMenu sysRoleMenu);

	/**
	 * 
	 * 分页查询</br>eg: xx.getByPage(null, 0, 3, "id", "desc");
	 *
	 **/
	List<SysRoleMenu> getByPage(@Param("sysRoleMenu") SysRoleMenu sysRoleMenu, @Param("start") Integer start, @Param("limit") Integer limit, @Param("orderColumn") String orderColumn, @Param("orderType") String orderType);

	/**
	 * 
	 * 根据实体属性查询
	 *
	 **/
	List<SysRoleMenu> getListByCondition(@Param("sysRoleMenu") SysRoleMenu sysRoleMenu);

	/**
	 * 
	 * 根据实体属性查询
	 *
	 **/
	int getCountByCondition(@Param("sysRoleMenu") SysRoleMenu sysRoleMenu);

	/**
	 * 
	 * 查询单条数据
	 *
	 **/
	SysRoleMenu getOneByCondition(@Param("sysRoleMenu") SysRoleMenu sysRoleMenu);

}