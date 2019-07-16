package com.java.ting.domain;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;


/**
 *
 * 系统日志表
 *@author tingOu
 **/
@SuppressWarnings("serial")
@Getter
@Setter
public class SysLog implements Serializable {

	/**主键**/
	private Integer id;

	/**请求路径**/
	private String url;

	/**请求方式**/
	private String method;

	/**请求方式**/
	private String reqIP;

	/**请求路径的项目包地址**/
	private String classMethod;

	/**入参**/
	private String resData;

	/**返参**/
	private String resultData;

	/**请求时间**/
	private Long time;

	/**创建时间**/
	private java.util.Date addTime;

	/**更新时间**/
	private java.util.Date updateTime;

	/**删除标记 0:正常 1删除**/
	private String delFlag;



}
