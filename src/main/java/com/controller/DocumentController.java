package com.controller;

import com.entity.Document;
import com.entity.User;
import com.service.DocumentService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.net.URLEncoder;
import java.util.Date;
import java.util.UUID;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 9:58 2020/5/20
 * <p>
 * 文件控制层
 * create by caocong on  2020/5/20
 */


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
    @RequiresPermissions("document:download")
    public void download(HttpServletRequest request, HttpServletResponse resp, Integer id) {

        Document document = documentService.queryById(id);

        if (document == null) {
            return;
        }
        try {

            String dir = request.getServletContext().getRealPath("");
            resp.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(document.getFilename(), "UTF-8")); //获取文件输入流 InputStream in = new FileInputStream("文件路径"); int len = 0; byte[] buffer = new byte[1024]; OutputStream out = resp.getOutputStream(); while ((len = in.read(buffer)) > 0) {    out.write(buffer,0,len);//将缓冲区的数据输出到客户端浏览器 } in.close(); out.close();

            //读取这个资源的完整路径，然后io流写入
            InputStream in = new FileInputStream(dir + "/" + document.getFilepath());
            int len = 0;
            byte[] buffer = new byte[1024];
            OutputStream out = resp.getOutputStream();
            while ((len = in.read(buffer)) > 0) {
                out.write(buffer, 0, len);//将缓冲区的数据输出到客户端浏览器 } in.close(); out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("list")
    public String listFile(Model model) {
        model.addAttribute("filelist", documentService.queryAllByLimit(0, 100));
        return "/WEB-INF/jsp/file/showfile";
    }

}
