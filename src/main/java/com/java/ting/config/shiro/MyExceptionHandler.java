package com.java.ting.config.shiro;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import com.java.ting.common.ResponseCode;
import com.java.ting.common.ResponseVo;
import com.java.ting.common.utils.ResponseUtils;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 异常处理
 *
 * @author tingOu
 */
public class MyExceptionHandler implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        StringBuffer url = httpServletRequest.getRequestURL();
        FastJsonJsonView view = new FastJsonJsonView();
        ResponseVo responseVo = new ResponseVo();
        if (e instanceof UnauthenticatedException) {
            // token 错误
            responseVo = ResponseUtils.buildResponseCode(ResponseCode.SHIRO_ERROR_TOKEN);
        } else if (e instanceof UnauthorizedException) {
            // 无权限
            responseVo = ResponseUtils.buildResponseCode(ResponseCode.SHIRO_ERROR_NOSHIRO);

        } else {
            ResponseCode responseCode = ResponseCode.SHIRO_ERROR_OTHER;
            responseCode.setMessage(e.getMessage());
            responseVo = ResponseUtils.buildResponseCode(responseCode);
        }

        modelAndView.addObject(responseVo);
        modelAndView.setView(view);
        return modelAndView;
    }
}
