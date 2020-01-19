package com.java.ting.util;

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
     * @param code    编号
     * @param message 信息
     * @param success 成功标识
     * @param data    数据
     * @return {@link com.java.ting.common.ResponseVo }
     */
    public static ResponseVo buildResponseVo(Integer code, String message, Boolean success, Object data) {

        ResponseVo responseVo = new ResponseVo();
        responseVo.setCode(code);
        responseVo.setMessage(message);
        responseVo.setSuccess(success);
        responseVo.setData(data);
        return responseVo;
    }

    /**
     * 根据ResponseCode封装
     *
     * @param responseCode {@link com.java.ting.common.ResponseCode }
     * @param data         数据
     * @return {@link com.java.ting.common.ResponseVo }
     */
    public static ResponseVo buildResponseCode(ResponseCode responseCode, Object data) {
        ResponseVo responseVo = new ResponseVo();
        responseVo.setCode(responseCode.getCode());
        responseVo.setMessage(responseCode.getMessage());
        responseVo.setSuccess(responseCode.isSuccess());
        responseVo.setData(data);
        return responseVo;
    }

    /**
     * 根据ResponseCode封装 无data
     *
     * @param responseCode {@link com.java.ting.common.ResponseCode }
     * @return {@link com.java.ting.common.ResponseVo }
     */
    public static ResponseVo buildResponseCode(ResponseCode responseCode) {
        ResponseVo responseVo = new ResponseVo();
        responseVo.setCode(responseCode.getCode());
        responseVo.setMessage(responseCode.getMessage());
        responseVo.setSuccess(responseCode.isSuccess());
        return responseVo;
    }

    /**
     * 错误信息
     *
     * @param responseCode {@link com.java.ting.common.ResponseCode }
     * @param showMsg      message信息
     * @return {@link com.java.ting.common.ResponseVo }
     */
    public static ResponseVo buildResponseDtoError(ResponseCode responseCode, String showMsg) {
        ResponseVo vo = new ResponseVo();
        vo.setMessage(showMsg);
        vo.setCode(responseCode.getCode());
        return vo;
    }
}
