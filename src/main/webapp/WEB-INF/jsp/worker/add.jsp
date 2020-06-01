<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>员工添加</title>
</head>
<link rel="stylesheet" href="../../../static/layui/css/layui.css" media="all"/>
<script src="../../../static/layui/layui.js"></script>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
    <legend>员工添加页面</legend>
</fieldset>

<form class="layui-form layui-form-pane" action="../../../worker/addworker" style="margin-left: 300px;">
    <div class="layui-form-item">
        <label class="layui-form-label">员工名字</label>
        <div class="layui-input-inline">
            <input type="text" name="name" lay-verify="required" placeholder="请输入" autocomplete="off"
                   class="layui-input">
        </div>
    </div>


    <div class="layui-form-item">
        <label class="layui-form-label">员工电话</label>
        <div class="layui-input-inline">
            <input type="text" name="tel" lay-verify="required" placeholder="请输入" autocomplete="off"
                   class="layui-input">
        </div>
    </div>


    <div class="layui-form-item">
        <label class="layui-form-label">员工邮件</label>
        <div class="layui-input-inline">
            <input type="text" name="email" lay-verify="required" placeholder="请输入" autocomplete="off"
                   class="layui-input">
        </div>
    </div>


    <div class="layui-form-item">
        <label class="layui-form-label">职位</label>
        <div class="layui-input-inline">
            <input type="text" name="position" lay-verify="required" placeholder="请输入" autocomplete="off"
                   class="layui-input">
        </div>
    </div>


    <div class="layui-form-item">
        <label class="layui-form-label">学历</label>
        <div class="layui-input-inline">
            <input type="text" name="xueli" lay-verify="required" placeholder="请输入" autocomplete="off"
                   class="layui-input">
        </div>
    </div>


    <div class="layui-form-item">
        <label class="layui-form-label">身份证号</label>
        <div class="layui-input-inline">
            <input type="text" name="idcard" lay-verify="required" placeholder="请输入" autocomplete="off"
                   class="layui-input">
        </div>
    </div>


    <div class="layui-form-item">
        <label class="layui-form-label">部门</label>
        <div class="layui-input-inline">
            <select name="departmentid" lay-filter="aihao">
                <option value=""></option>
                <option value="1">技术部</option>
                <option value="2">销售部</option>
            </select>
        </div>
    </div>


    <div class="layui-form-item">
        <label class="layui-form-label">员工地址</label>
        <div class="layui-input-inline">
            <input type="text" name="address" lay-verify="required" placeholder="请输入" autocomplete="off"
                   class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">入职时间</label>
        <div class="layui-input-inline">
            <input type="text" name="createtime" id="date1" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <button class="layui-btn" type="submit">添加用户</button>
        <button class="layui-btn"><a style="color: white" href="../../../jumpuser">返回</a></button>
    </div>

</form>


<script>
    layui.use('form', function () {
        var form = layui.form; //只有执行了这一步，部分表单元素才会自动修饰成功
        //但是，如果你的HTML是动态生成的，自动渲染就会失效
        //因此你需要在相应的地方，执行下述方法来进行渲染
        form.render();
    });
</script>
</body>
</html>
