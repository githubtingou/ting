package com.java.ting.domain;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;


/**
 * 
 * 系统权限和菜单关系表
 *@author tingOu
 **/
@SuppressWarnings("serial")
@Getter
@Setter
public class SysRoleMenu implements Serializable {

	/**权限id**/
	private Integer sysRoleId;

	/**菜单id**/
	private Integer adminMenuId;



}
