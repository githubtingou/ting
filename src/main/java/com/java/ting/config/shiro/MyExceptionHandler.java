package com.java.ting.config.shiro;

/**
 * 异常处理
 *
 * @author tingOu
 */
//public class MyExceptionHandler implements HandlerExceptionResolver {
//    @Override
//    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
//        ModelAndView modelAndView = new ModelAndView();
//        StringBuffer url = httpServletRequest.getRequestURL();
//        FastJsonJsonView view = new FastJsonJsonView();
//        ResponseVo responseVo = new ResponseVo();
//        if (e instanceof UnauthenticatedException) {
//            // token 错误
//            responseVo = ResponseUtils.buildResponseCode(ResponseCode.SHIRO_ERROR_TOKEN);
//        } else if (e instanceof UnauthorizedException) {
//            // 无权限
//            responseVo = ResponseUtils.buildResponseCode(ResponseCode.SHIRO_ERROR_NOSHIRO);
//
//        } else {
//            ResponseCode responseCode = ResponseCode.SHIRO_ERROR_OTHER;
//            responseCode.setMessage(e.getMessage());
//            responseVo = ResponseUtils.buildResponseCode(responseCode);
//        }
//
//        modelAndView.addObject(responseVo);
//        modelAndView.setView(view);
//        return modelAndView;
//    }
//}
