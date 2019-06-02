package com.java.ting.common.utils;

import com.java.ting.common.ResponseCode;
import com.java.ting.common.ResponseVo;

/**
 * 封装响应参数
 *
 * @author tingOu
 */
public class ResponseUtils {

    /**
     * ResponseVo全量参数
     *
     * @param code
     * @param message
     * @param success
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResponseVo<T> buildResponseVo(Integer code, String message, Boolean success, T data) {
        ResponseVo<T> responseVo = new ResponseVo<T>();
        responseVo.setCode(code);
        responseVo.setMessage(message);
        responseVo.setSuccess(success);
        responseVo.setData(data);
        return responseVo;
    }

    /**
     * 根据ResponseCode封装
     *
     * @param responseCode
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResponseVo<T> buildResponseCode(ResponseCode responseCode, T data) {
        ResponseVo<T> responseVo = new ResponseVo<T>();
        responseVo.setCode(responseCode.getCode());
        responseVo.setMessage(responseCode.getMessage());
        responseVo.setSuccess(responseCode.isSuccess());
        responseVo.setData(data);
        return responseVo;
    }

    /**
     * 根据ResponseCode封装 无data
     *
     * @param responseCode
     * @return
     */
    public static ResponseVo buildResponseCode(ResponseCode responseCode) {
        ResponseVo responseVo = new ResponseVo();
        responseVo.setCode(responseCode.getCode());
        responseVo.setMessage(responseCode.getMessage());
        responseVo.setSuccess(responseCode.isSuccess());
        return responseVo;
    }
}
