package com.commons;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String adduser(HttpServletRequest request) {

        return request.getContextPath() + "/WEB-INF/jsp/user/add";
    }


    @RequestMapping("jumpselectuser.jsp")
    public String deleteuser(HttpServletRequest request) {
        return request.getContextPath() + "/WEB-INF/jsp/user/selectshow";
    }


    @RequestMapping("jumpdepartment")
    public String jumpdepartment(HttpServletRequest request) {
        return request.getContextPath() + "/WEB-INF/jsp/department/show";
    }


    @RequestMapping("addment")
    public String addment(HttpServletRequest request) {

        return request.getContextPath() + "/WEB-INF/jsp/department/add";
    }


    @RequestMapping("jumpposition")
    public String jumpposition(HttpServletRequest request) {
        return request.getContextPath() + "/WEB-INF/jsp/position/show";
    }


    @RequestMapping("jumpworker")
    public String jumpworker(HttpServletRequest request) {
        return request.getContextPath() + "/WEB-INF/jsp/worker/show";

    }


    @RequestMapping("jumpnotice")
    public String jumpnotice(HttpServletRequest request) {
        return request.getContextPath() + "/WEB-INF/jsp/notice/show";
    }


    @RequestMapping("addposition")
    public String addpositon(HttpServletRequest request) {
        return request.getContextPath() + "/WEB-INF/jsp/position/add";
    }


    @RequestMapping("addworker")
    public String addWorker(HttpServletRequest request) {
        return request.getContextPath() + "/WEB-INF/jsp/worker/add";

    }


    @RequestMapping("addnotice")
    public String addnotice(HttpServletRequest request) {
        return request.getContextPath() + "/WEB-INF/jsp/notice/add";
    }


    @RequestMapping("jumpfile")
    public String jumpdocument(HttpServletRequest request) {
        return request.getContextPath() + "/WEB-INF/jsp/file/show";
    }


    @RequestMapping("addocument")
    public String addcument(HttpServletRequest request) {
        return request.getContextPath() + "/WEB-INF/jsp/file/add";
    }
}
