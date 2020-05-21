package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 9:58 2020/5/20
 *//*
*文件控制层
create by caocong on  2020/5/20
*/
@Controller
@RequestMapping("document")
public class DocumentController {

    @RequestMapping("queryall")
    public  String  queryAll(){
        return "index";
    }

}
