package com.controller;

import com.alibaba.druid.util.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 23:28 2020/5/24
 *//*
*后台登陆控制类
create by caocong on  2020/5/24
*/
@Controller
public class LoginController {


    @RequestMapping("login")
    public  String login(String username , String password , String remember, HttpServletResponse resp){
        System.out.println("登陆");
        UsernamePasswordToken token = new UsernamePasswordToken(username,password,remember);
        if(StringUtils.isEmpty(remember)){
            token.setRememberMe(true);
        }
        Subject subject = SecurityUtils.getSubject();

        try {
            subject.login(token);
            return "/WEB-INF/index";
        } catch (Exception e) {
            e.printStackTrace();
            return  "redirect:/login.jsp";//失败重新跳回登陆页面
        }
    }
}
