package com.wc.boot202web.interceptor;

import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * class description<br>
 *
 * @author wangguocheng
 * @version 1.0
 * @date 2021/7/15 15:35
 * @since JDK 1.8+
 */
public class MyHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        if (request.getParameterMap().containsKey("token")) {
            return true;
        }
        response.setStatus(HttpStatus.UNAUTHORIZED.value());
        response.getWriter().println(HttpStatus.UNAUTHORIZED.getReasonPhrase());
        response.getWriter().flush();
        return false;
    }

    @Override
    public void afterCompletion(
            HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        System.out.println(123);
    }

    @Override
    public void postHandle(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler,
            ModelAndView modelAndView)
            throws Exception {
        System.out.println(1234);
    }
}
