//package com.java.ting.config.filter;
//
//import org.springframework.util.ObjectUtils;
//
//import javax.servlet.*;
//import java.io.IOException;
//
///**
// * 自定义过滤器
// *
// * @author LISHUANG
// * @date 2019/12/20
// */
//public class MyFilter implements Filter {
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        String name = null;
//        if (ObjectUtils.isEmpty(name)) {
//            return;
//        }
//        filterChain.doFilter(servletRequest, servletResponse);
//
//    }
//
//    @Override
//    public void destroy() {
//
//    }
//}
