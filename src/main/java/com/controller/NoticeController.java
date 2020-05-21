package com.controller;

import com.dao.NoticeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 19:29 2020/5/19
 *//*
*公告控制层
create by caocong on  2020/5/19
*/

@Controller
@RequestMapping("notice")
public class NoticeController {

    @Autowired
    NoticeDao noticeDao;

    @RequestMapping("queryall")
    public String queryall(Model model){
            model.addAttribute("noticelist", noticeDao.queryAll(null));
            return "index";
    }



}
