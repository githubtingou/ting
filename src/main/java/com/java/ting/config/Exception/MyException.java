package com.java.ting.config.Exception;

import com.java.ting.common.ResponseCode;

/**
 * 自定义异常
 *
 * @author LISHUANG
 * @date 2020/1/2
 */
public class MyException extends RuntimeException {

    /**
     * 序列化使用
     */
    private static final long serialVersionUID = 1L;

    private ResponseCode responseCode;
    /**
     * 要展示的具体的人性化的信息
     */
    private String showMsg;

    public MyException(ResponseCode errorCode, String showMsg) {
        super(errorCode.toString());
        this.responseCode = errorCode;
        this.showMsg = showMsg;
    }

    public MyException(ResponseCode errorCode) {
        super(errorCode.getMessage());
        this.responseCode = errorCode;
        this.showMsg = errorCode.getMessage();
    }

    public MyException(ResponseCode errorCode, String showMsg, Throwable cause) {
        super(errorCode.toString(), cause);
        this.responseCode = errorCode;
        this.showMsg = showMsg;
    }

    /**
     * @return the errorCode
     */
    public ResponseCode getErrorCode() {
        return responseCode;
    }

    public String getShowMsg() {
        return showMsg;
    }
}
