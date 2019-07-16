package com.java.ting.mapper;
import java.util.List;
import com.java.ting.domain.SysLog;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * SysLogMapper数据库操作接口类
 *@author tingOu
 **/

public interface SysLogMapper{


	/**
	 * 
	 * 查询（根据主键ID查询）
	 *
	 **/
	SysLog  selectByPrimaryKey(@Param("id") Integer id);

	/**
	 * 
	 * 添加
	 *
	 **/
	int insert(SysLog sysLog);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 *
	 **/
	int insertSelective(SysLog sysLog);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 *
	 **/
	int updateByPrimaryKeySelective(SysLog sysLog);

	/**
	 * 
	 * 分页查询</br>eg: xx.getByPage(null, 0, 3, "id", "desc");
	 *
	 **/
	List<SysLog> getByPage(@Param("sysLog") SysLog sysLog, @Param("start") Integer start, @Param("limit") Integer limit, @Param("orderColumn") String orderColumn, @Param("orderType") String orderType);

	/**
	 * 
	 * 根据实体属性查询
	 *
	 **/
	List<SysLog> getListByCondition(@Param("sysLog") SysLog sysLog);

	/**
	 * 
	 * 根据实体属性查询
	 *
	 **/
	int getCountByCondition(@Param("sysLog") SysLog sysLog);

	/**
	 * 
	 * 查询单条数据
	 *
	 **/
	SysLog getOneByCondition(@Param("sysLog") SysLog sysLog);

}