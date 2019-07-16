package com.java.ting.domain;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * 系统用户表
 *
 * @author tingOu
 **/
@SuppressWarnings("serial")
@Getter
@Setter
@ToString
public class AdminUser implements Serializable {

    /**
     * 主键
     **/
    private Integer id;

    /**
     * 登录名
     **/
    private String loginName;

    /**
     * 头像
     **/
    private String loginImg;

    /**
     * 用户名
     **/
    private String realName;

    /**
     * 密码
     **/
    private String password;

    /**
     * 邮箱
     **/
    private String email;

    /**
     * 性别
     **/
    private String sex;

    /**
     * 手机号
     **/
    private String mobile;

    /**
     * 个性签名
     **/
    private String sign;

    /**
     * 年龄
     **/
    private Integer age;

    /**
     * 创建人
     **/
    private String addUser;

    /**
     * 创建时间
     **/
    private java.util.Date addTime;

    /**
     * 更新人
     **/
    private String updateUser;

    /**
     * 更新时间
     **/
    private java.util.Date updateTime;

    /**
     * 冻结原因
     **/
    private String freezeCause;

    /**
     * 冻结时间
     **/
    private java.util.Date freezeDate;

    /**
     * 状态（0正常 1删除 2停用 3冻结）
     **/
    private String delFlag;

    /**
     * 登录状态
     **/
    private String loginFlag;

    /**
     * 最后登录ip
     **/
    private String loginIp;

    /**
     * 最后登录时间
     **/
    private java.util.Date loginDate;

    /**
     * 备注
     **/
    private String remarks;

}
