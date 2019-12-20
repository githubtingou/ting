package com.java.ting.config.interceptor;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Map;

/**
 * 自定义拦截器
 *
 * @author LISHUANG
 * @date 2019/12/20
 */
@Slf4j
public class MyInterceptor implements HandlerInterceptor {

    /**
     * 在DispatcherServlet之前执行
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(request);
        Map parameterMap = request.getParameterMap();
        log.info("获取请求参数{}", parameterMap);
        System.out.println(response);
        System.out.println(handler);

        return true;
    }

    /**
     * 在controller执行之后的DispatcherServlet之后执行
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        System.out.println(request);
        System.out.println(response);
        System.out.println(handler);
        System.out.println(modelAndView);
    }

    /**
     * 在页面渲染完成返回给客户端之前执行
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, Exception ex) throws Exception {
        System.out.println(request);
        System.out.println(response);
        System.out.println(handler);
        System.out.println(ex);
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter out = null;

    }
}
