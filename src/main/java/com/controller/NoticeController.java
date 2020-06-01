package com.controller;

import com.dao.NoticeDao;
import com.entity.Notice;
import com.service.NoticeService;
import com.util.jsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.Id;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    NoticeService noticeService;


    @RequestMapping("selectByParams")
    public void selectall(
            HttpServletRequest request,
            HttpServletResponse response,
            @RequestParam(value = "page", required = false) Integer page,
            @RequestParam(value = "limit", required = false) Integer limit,
            @RequestParam(value = "content", required = false) String content
    ) {
        Notice notice = new Notice();
        notice.setContent(content);
        int count = noticeService.selectall(notice).size();
        List<Notice> list = noticeService.queryAll(notice, page, limit);
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "查询成功");
        map.put("count", count);
        map.put("data", list);
        try {
            jsonUtil.responseWriteJson(response, map);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @RequestMapping("delete/{id}")
    public String delete(
            HttpServletRequest request,
            @PathVariable(value = "id") Integer id
    ) {
        noticeService.deleteById(id);
        return request.getContextPath() + "/WEB-INF/jsp/notice/show";
    }


    @RequestMapping("update")
    public String update(HttpServletRequest request, Notice notice) {
        noticeService.update(notice);
        return request.getContextPath() + "/WEB-INF/jsp/notice/show";
    }

}
