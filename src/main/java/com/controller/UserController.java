package com.controller;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.util.jsonUtil;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 8:16 2020/5/19
 *//*
*用户控制层
create by caocong on  2020/5/19
*/
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("selectall")
    public void selectall(User user, HttpServletRequest request, HttpServletResponse response, Model model
    ) {
        List<User> userlist = userService.selectall(user);
        int count = userService.selectall(user).size();
        Map<String, Object> map = new HashMap<String, Object>();

        map.put("code", 0);
        map.put("msg", "查询成功");
        map.put("data", userlist);
        map.put("count", count);
    /*    String result="";
        try {
            result =  objectMapper.writeValueAsString(map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }*/
        try {
            jsonUtil.responseWriteJson(response, map);
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*model.addAttribute("result",result);*/
        /* return request.getContextPath()+"/WEB-INF/jsp/user/show";*/
    }

    @RequestMapping("selectByParams")
    public void selectByParams(@RequestParam(value = "loginname", required = false) String loginname
            , @RequestParam(value = "username", required = false) String username
            , HttpServletResponse response, HttpServletRequest request
            , @RequestParam(value = "page", required = false) Integer page
            , @RequestParam(value = "limit", required = false) Integer limit
    ) {
        User user = new User();
        user.setLoginname(loginname);
        user.setUsername(username);

        List<User> list = userService.selectByParams(user, page, limit);

        int count = userService.selectall(user).size();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "查询成功");
        map.put("data", list);
        map.put("count", count);
        try {
            jsonUtil.responseWriteJson(response, map);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("deleteuser/{id}")
    public String delete(@PathVariable(value = "id") Integer id, HttpServletRequest request) {
        userService.delete(id);
        return request.getContextPath() + "/WEB-INF/jsp/user/show";
    }


    @RequestMapping("updateuser")
    public String update(User user, HttpServletRequest request) {
        userService.update(user);
        return request.getContextPath() + "/WEB-INF/jsp/user/show";
    }

    @RequestMapping("adduser")
    public String add(User user, HttpServletRequest request) {
        userService.insert(user);
        return request.getContextPath() + "/WEB-INF/jsp/user/show";
    }

}
