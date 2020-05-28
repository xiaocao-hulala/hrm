<%--
  Created by IntelliJ IDEA.
  User: caocong
  Date: 2020/5/26
  Time: 7:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>文档管理</title>
</head>
<body>
<
<form action="/document/upload" method="post" enctype="multipart/form-data">
    <fieldset>
        <legend>文件上传</legend>
        文件名:<input type="text" name="filename">
        选择文件<input type="file" name="upfile">
        <button>上传</button>
    </fieldset>
</form>

<table>
    <tr>
        <td>序号</td>
        <td>文件名</td>
        <td>文件大小</td>
        <td>操作</td>
        <c:forEach items="${filelist}" var="file" varStatus="i">
            <td>${i.count}</td>
            <td>${file.filename}</td>
            <td>200M</td>
            <td><a href="${file.filepath}">下载</a></td>
        </c:forEach>
    </tr>
</table>

</body>
</html>
