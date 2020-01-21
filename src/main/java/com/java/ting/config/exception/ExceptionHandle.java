package com.java.ting.config.exception;

import com.java.ting.common.ResponseCode;
import com.java.ting.common.ResponseVo;
import com.java.ting.util.ResponseUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 统一异常处理
 *
 * @author LISHUANG
 * @date 2019/10/24
 */
@ControllerAdvice
@Component
@Slf4j
public class ExceptionHandle {

    /**
     * 全局异常处理
     *
     * @param request httpServletRequest
     * @param e       异常
     * @return 封装后的异常的返参
     */
    @ExceptionHandler(value = Throwable.class)
    @ResponseBody
    public ResponseVo exceptionHandel(HttpServletRequest request, HttpServletResponse response, Exception e) {

        //自定义异常处理
        if (e instanceof MyException) {
            MyException myException = (MyException) e;
            return ResponseUtils.buildResponseDtoError(myException.getErrorCode(), myException.getShowMsg());
        }

        // valid 异常处理
        if (e instanceof MethodArgumentNotValidException) {
            return ResponseUtils.buildResponseDtoError(ResponseCode.ERROE_CODE, validException(e));

        }
        log.error("错误信息，", e);
        return ResponseUtils.buildResponseDtoError(ResponseCode.ERROE_CODE, e.getMessage());

    }

    /**
     * valid 异常处理
     * MethodArgumentNotValidException
     *
     * @param e 异常
     * @return valid错误信息
     */
    private String validException(Exception e) {
        BindingResult bindingResult = ((MethodArgumentNotValidException) e).getBindingResult();
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        StringBuilder sb = new StringBuilder();
        for (FieldError fieldError : fieldErrors) {
            /* 获取valid定义的message */
            // 字段value
            Object rejectedValue = fieldError.getRejectedValue();
            // 字段key
            String field = fieldError.getField();
            // message
            String defaultMessage = fieldError.getDefaultMessage();
            sb.append(defaultMessage).append(";");
        }
        return sb.toString();

    }

}