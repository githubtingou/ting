package com.java.ting.domain;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;


/**
 * 
 * 系统权限和菜单关系表
 *@author tingOu
 **/
@SuppressWarnings("serial")
@Getter
@Setter
@Accessors(chain = true)
public class SysRoleMenu implements Serializable {

	/**权限id**/
	private Integer sysRoleId;

	/**菜单id**/
	private Integer adminMenuId;



}
