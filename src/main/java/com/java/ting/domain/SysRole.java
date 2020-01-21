package com.java.ting.domain;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;


/**
 * 
 * 系统权限表
 *@author tingOu
 **/
@SuppressWarnings("serial")
@Getter
@Setter
@Accessors(chain = true)
public class SysRole implements Serializable {

	/**主键**/
	private Integer id;

	/**名称**/
	private String name;

	/**英文名称**/
	private String englishName;

	/**类型**/
	private String roleType;

	/**是否启用,0启动；1不启用**/
	private String isEnable;

	/**添加时间**/
	private java.util.Date addTime;

	/**更新时间**/
	private java.util.Date updateTime;

	/**添加人**/
	private String addUser;

	/**更新人**/
	private String updateUser;

	/**删除标记 0不删除 ；1删除**/
	private String delFlag;



}
