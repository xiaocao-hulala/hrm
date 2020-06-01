<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="../../../static/layui/css/layui.css" media="all"/>
    <script src="../../../static/layui/layui.js"></script>
    <script src="../static/js/jquery-3.4.1.min.js"></script>
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>
<fieldset>
    <legend>文件上传</legend>
    <div class="layui-upload">
        <button type="button" class="layui-btn layui-btn-normal" id="selectFile">上传文件</button>
        <button type="button" class="layui-btn" id="startUploadFile">开始上传</button>
        <p id="allFileText"></p>
    </div>
</fieldset>
<table class="layui-table" lay-skin="line">
    <colgroup>
        <col width="150">
        <col width="150">
        <col width="200">
        <col>
    </colgroup>
    <thead>
    <tr>
        <th>序号</th>
        <th>文件名</th>
        <th>文件大小</th>
        <th>展示</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>1</td>
        <td>汉族</td>
        <td>1989-10-14</td>
        <td>哦耶</td>
        <td>
            <button style="background-color: #0b2e13;color: white;">下载</button>
        </td>
    </tr>
    </tbody>
</table>
</body>
</html>
