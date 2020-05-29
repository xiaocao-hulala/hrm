<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>用户修改</title>
</head>
<link rel="stylesheet" href="../static/layui/css/layui.css" media="all"/>
<script src="../static/layui/layui.js"></script>
<script src="../static/js/jquery-3.4.1.min.js"></script>
<body>

<form class="layui-form layui-form-pane" action="../user/updateuser">

    <input type="hidden" id="zhi" name="id">

    <div class="layui-form-item">
        <label class="layui-form-label">登陆名</label>
        <div class="layui-input-inline">
            <input type="text" id="loginname" name="name" lay-verify="required" placeholder="请输入" autocomplete="off"
                   class="layui-input">
        </div>
    </div>


    <div class="layui-form-item">
        <label class="layui-form-label">用户名</label>
        <div class="layui-input-inline">
            <input type="text" name="username" id="username" lay-verify="required" placeholder="请输入" autocomplete="off"
                   class="layui-input">
        </div>
    </div>


    <div class="layui-form-item">
        <label class="layui-form-label">用户状态</label>
        <div class="layui-input-inline">
            <select name="state" id="state" lay-filter="aihao">
                <option value=""></option>
                <option value="1">阅读</option>
                <option value="2">游戏</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">创建时间</label>
        <div class="layui-input-inline">
            <input type="text" name="date" id="createtime" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item" style="margin: 50px;">
        <button class="layui-btn" style="width: 300px;" type="submit" id="closesparent" onclick="closeiframe()">修改用户</button>
    </div>

</form>


<script>
    layui.use('form', function () {
        var form = layui.form; //只有执行了这一步，部分表单元素才会自动修饰成功
        //但是，如果你的HTML是动态生成的，自动渲染就会失效
        //因此你需要在相应的地方，执行下述方法来进行渲染
        form.render();
    });

    var data = parent.currdata;
    console.log(data)
    $("#zhi").val(data.id);
    $("#loginname").val(data.loginname);
    $("#username").val(data.username);
    $("#createtime").val(data.createtime)
    $("#state").val(data.state);

    var obj = $("#state").get(0);
    for (var i = 0; i < obj.options.length; i++) {
        var temp = obj.options[i].value;
        if (temp == data.state) {
            obj.options[i].selected = 'selected';
            break;
        }
    }

    function closeiframe() {
        var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
        parent.layer.close(index); //再执行关闭
        //parent.window.layui.$("#search").click(); // 触发上层页面列表刷新
    }

   /* $("#closesparent").click(function () {
        var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
        parent.layer.close(index); //再执行关闭
    })*/

</script>
</body>
</html>
