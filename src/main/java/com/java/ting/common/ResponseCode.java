package com.java.ting.common;

import lombok.Getter;
import lombok.Setter;

/**
 * 响应码
 *
 * @author tingOu
 */
public enum ResponseCode {
    /**
     * 成功
     */
    SUCCESS_CODE(2000, "请求成功", true),
    /**
     * 失败
     */
    ERROE_CODE(5000, "请求失败", false),
    /**
     * 文件上传失败
     */
    ERROR_FILE(5001, "文件上传失败"),
    /**
     * 文件不能为空
     */
    ERROR_FILE_NULL(5002, "文件不能为空", false),
    /**
     * 数据插入失败
     */
    ERROR_INSERT(5003, "数据插入失败"),
    /**
     * 权限错误
     */
    SHIRO_ERROR_CODE(5100, "权限错误", false),
    /**
     * token错误
     */
    SHIRO_ERROR_TOKEN(5101, "token错误", false),
    /**
     * 用户无权限
     */
    SHIRO_ERROR_NOSHIRO(5102, "用户无权限", false),
    /**
     * 用户名或密码不能为空
     */
    SHIRO_ERROR_EMPTY_NAME_OR_PASSWORD(5103, "用户名或密码不能为空", false),
    /**
     * 无该用户信息
     */
    SHIRO_ERROR_NO_USER(5103, "系统中暂无该用户信息", false),

    /**
     * 其他权限错误
     */
    SHIRO_ERROR_OTHER(5199, "权限错误", false);

    /**
     * 编号
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String message;

    /**
     * 成功标识
     */
    private Boolean success;

    ResponseCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    ResponseCode(Integer code, String message, Boolean success) {
        this.code = code;
        this.message = message;
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
