package com.controller;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String selectall(Model model, @RequestParam(required = false, defaultValue = "1") Integer pageNum,
                            @RequestParam(required = true, defaultValue = "2") Integer pageSize
    ) {
        userService.selectall(pageNum, pageSize);
        return "index";
    }

    @RequestMapping("selectByParams")
    public String selectByParams(User user) {
        userService.selectByParams(user);
        return "index";
    }

    @RequestMapping(value = "/deleteuser/{id}")
    public String delete(@PathVariable(value = "id") Integer id) {
        userService.delete(id);
        return "index";
    }


    @RequestMapping("updateuser")
    public String update(User user) {
        userService.update(user);
        return "index";
    }

    @RequestMapping("adduser")
    public String add(User user) {
        userService.insert(user);
        return "index";
    }

}
