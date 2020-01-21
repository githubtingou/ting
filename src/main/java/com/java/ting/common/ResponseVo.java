package com.java.ting.common;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * 公共返回类
 *
 * @author tingOu
 */
@Setter
@Getter
@Accessors(chain = true)
public class ResponseVo {
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
    private boolean success;
    /**
     * 返回数据
     */
    private Object data;
}
