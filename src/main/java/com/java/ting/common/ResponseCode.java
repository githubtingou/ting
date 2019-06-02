package com.java.ting.common;

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
    SHIRO_ERROR_CODE(5100, "权限错误", false);

    private Integer code;
    private String message;
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
