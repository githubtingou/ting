package com.java.ting.domain;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;


/**
 * 
 * 用户和权限关系表
 *@author tingOu
 **/
@SuppressWarnings("serial")
@Getter
@Setter
@Accessors(chain = true)
public class SysRoleUser implements Serializable {

	/**用户id**/
	private String adminUserId;

	/**权限id**/
	private String sysRoleId;



}
