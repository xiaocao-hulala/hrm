package com.controller;

import com.entity.Position;
import com.util.jsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.PostionService;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 19:36 2020/5/19
 *//*
*职位控制层
create by caocong on  2020/5/19
*/

@Controller
@RequestMapping("position")
public class PositionController {

    @Autowired
    PostionService postionService;

    @RequestMapping("selectall")
    public void selectall(
            @RequestParam(value = "posiname", required = false) String posiname,
            HttpServletRequest request,
            HttpServletResponse response,
            @RequestParam(value = "page", required = false) Integer page,
            @RequestParam(value = "limit", required = false) Integer limit
    ) {

        Position position = new Position();
        position.setPosiname(posiname);

        List<Position> list = postionService.queryAll(position, page, limit);
        int count = postionService.selectall(position).size();
        Map<String, Object> map = new HashMap<>();
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


    @RequestMapping("delete/{id}")
    public String delete(HttpServletRequest request
            , @PathVariable(value = "id") Integer id
    ) {
        postionService.deleteById(id);
        return request.getContextPath() + "/WEB-INF/jsp/position/show";
    }


    @RequestMapping("addposition")
    public String add(HttpServletRequest request, Position position) {
        postionService.insert(position);
        return request.getContextPath() + "/WEB-INF/jsp/position/show";
    }


    @RequestMapping("updateposition")
    public String update(HttpServletRequest request, Position position) {
        postionService.update(position);
        return request.getContextPath() + "/WEB-INF/jsp/position/show";
    }

}
