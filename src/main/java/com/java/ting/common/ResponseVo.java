package com.java.ting.common;

import lombok.Getter;
import lombok.Setter;

/**
 * 公共返回类
 *
 * @param <T>
 * @author tingOu
 */
@Setter
@Getter
public class ResponseVo<T> {
    private Integer code;
    private String message;
    private boolean success;
    private T data;
}
