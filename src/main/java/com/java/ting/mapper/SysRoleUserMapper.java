package com.java.ting.mapper;
import java.util.List;
import com.java.ting.domain.SysRoleUser;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * SysRoleUserMapper数据库操作接口类
 *@author tingOu
 **/

public interface SysRoleUserMapper{


	/**
	 * 
	 * 查询（根据主键ID查询）
	 *
	 **/
	SysRoleUser  selectByPrimaryKey(@Param("id") Integer id);

	/**
	 * 
	 * 添加
	 *
	 **/
	int insert(SysRoleUser sysRoleUser);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 *
	 **/
	int insertSelective(SysRoleUser sysRoleUser);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 *
	 **/
	int updateByPrimaryKeySelective(SysRoleUser sysRoleUser);

	/**
	 * 
	 * 分页查询</br>eg: xx.getByPage(null, 0, 3, "id", "desc");
	 *
	 **/
	List<SysRoleUser> getByPage(@Param("sysRoleUser") SysRoleUser sysRoleUser, @Param("start") Integer start, @Param("limit") Integer limit, @Param("orderColumn") String orderColumn, @Param("orderType") String orderType);

	/**
	 * 
	 * 根据实体属性查询
	 *
	 **/
	List<SysRoleUser> getListByCondition(@Param("sysRoleUser") SysRoleUser sysRoleUser);

	/**
	 * 
	 * 根据实体属性查询
	 *
	 **/
	int getCountByCondition(@Param("sysRoleUser") SysRoleUser sysRoleUser);

	/**
	 * 
	 * 查询单条数据
	 *
	 **/
	SysRoleUser getOneByCondition(@Param("sysRoleUser") SysRoleUser sysRoleUser);

}