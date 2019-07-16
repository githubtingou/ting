package com.java.ting.domain;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;


/**
 * 
 * 系统菜单表
 *@author tingOu
 **/
@SuppressWarnings("serial")
@Getter
@Setter
public class AdminMenu implements Serializable {

	/**主键**/
	private Integer id;

	/**父类id**/
	private String parentId;

	/**排序编号**/
	private String treeCode;

	/**名称**/
	private String menuName;

	/**链接**/
	private String menuHref;

	/**目标**/
	private String menuTarget;

	/**图标**/
	private String menuIcon;

	/**权限标识**/
	private String permission;

	/**是否显示（1显示 0隐藏）**/
	private String isShow;

	/**状态（0正常 1删除 2停用）**/
	private String delFlag;

	/**创建人**/
	private String addUser;

	/**创建时间**/
	private java.util.Date addTime;

	/**更新人**/
	private String updateUser;

	/**更新时间**/
	private java.util.Date updateName;

	/**备注**/
	private String remarks;



}
