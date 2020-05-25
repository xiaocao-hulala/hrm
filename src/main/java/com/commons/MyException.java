package com.commons;

import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 0:21 2020/5/26
 *//*
*统一的异常处理
create by caocong on  2020/5/26
*/
public class MyException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        e.printStackTrace();
        ModelAndView mv = new ModelAndView();
        //未授权
        if (e instanceof UnauthorizedException) {
            mv.setViewName("redirect:/uauthorized.jsp");
        }
        return null;
    }
}
