/*
package com.controller;

import com.entity.Document;
import com.entity.User;
import com.service.DocumentService;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

*/
/**
 * @Author:caocong
 * @Description:
 * @Date:create in 9:58 2020/5/20
 *//*
*/
/*
*文件控制层
create by caocong on  2020/5/20
*//*

@Controller
@RequestMapping("document")
public class DocumentController {

    @Autowired
    DocumentService documentService;

    @RequestMapping("upload")
    public String upload(MultipartFile upfile, HttpServletRequest request, Document document, HttpSession session) {

        if (upfile == null || upfile.getSize() == 0) {
            return "redirect:/document/list";
        }

        try {
            String documentDir = "document";

            //获取保存上传文件的目录绝对路径
            //得到文件夹目录
            String dir = request.getServletContext().getRealPath("document");

            //文件名
            String savefilename = UUID.randomUUID().toString();

            //文件后缀
            String filesuffix = upfile.getOriginalFilename().substring(upfile.getOriginalFilename().lastIndexOf("."));

            //将文件上传到服务器的指定目录
            String savepath = dir + "/" + savefilename + filesuffix;
            upfile.transferTo(new File(savepath));
            //从shiro中获取user对象得到userid
            User user = (User) SecurityUtils.getSubject().getSession().getAttribute("user");
            //将文件信息保存哒数据库中
            document.setUserid(user.getId());
            document.setCreatetime(new Date());
            document.setFilepath(documentDir + "/" + savefilename + filesuffix);
            documentService.insert(document);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:/document/list";
    }


    @RequestMapping("download")
    public void download() {

    }


    @RequestMapping("list")
    public String listFile(Model model) {
        model.addAttribute("filelist", documentService.queryAll(null));
        return "/WEB-INF/jsp/file/showfile";
    }

}
*/
