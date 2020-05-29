package com.commons;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 12:59 2020/5/25
 *//*
*共同控制层
create by caocong on  2020/5/25
*/

@Controller
public class CommonsController {

    @RequestMapping("nav/{dir}/{page}")
    public String nav(
            @PathVariable("dir") String dir, @PathVariable("page") String page
    ) {
        return dir + "/" + page;
    }

    @RequestMapping("index")
    public String index() {
        return "/WEB-INF/index";
    }


    @RequestMapping("jumpuser")
    public String user(HttpServletRequest request) {

        return request.getContextPath() + "/WEB-INF/jsp/user/show";
    }



    @RequestMapping("adduser")
    public String adduser(HttpServletRequest request){

        return  request.getContextPath()+"/WEB-INF/jsp/user/add";
    }


    @RequestMapping("jumpselectuser.jsp")
    public  String deleteuser(HttpServletRequest request){
        return request.getContextPath() + "/WEB-INF/jsp/user/selectshow";
    }
}
