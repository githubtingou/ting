package com.java.ting.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 日志类
 *
 * @author tingOu
 */
@Setter
@Getter
public class SysLog {
    /**
     * id
     */
    private long id;
    /**
     * 请求的路径
     */
    private String url;

    /**
     * 请求方式
     */
    private String method;
    /**
     * 请求的ip
     */
    private Object reqIP;
    /**
     * 请求的包名
     */
    private String classMethod;
    /**
     * 入参
     */
    private String reqData;
    /**
     * 返参
     */
    private String resultData;
    /**
     * 请求用时
     */
    private Long time;

    /**
     * 添加时间
     */
    private Date addTime;
    /**
     * 删除标记 0：默认，1删除
     */
    private String delFlag;


}
