<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>部门修改</title>
</head>
<link rel="stylesheet" href="../static/layui/css/layui.css" media="all"/>
<script src="../static/layui/layui.js"></script>
<script src="../static/js/jquery-3.4.1.min.js"></script>
<body>

<form class="layui-form layui-form-pane" action="../department/update">

    <input type="hidden" id="zhi" name="id">

    <div class="layui-form-item">
        <label class="layui-form-label">部门名字</label>
        <div class="layui-input-inline">
            <input type="text" id="departmentname" name="departmentname" lay-verify="required" placeholder="请输入"
                   autocomplete="off"
                   class="layui-input">
        </div>
    </div>


    <div class="layui-form-item">
        <label class="layui-form-label">部门简介</label>
        <div class="layui-input-inline">
            <input type="text" name="detail" id="detail" lay-verify="required" placeholder="请输入" autocomplete="off"
                   class="layui-input">
        </div>
    </div>


    <div class="layui-form-item" style="margin: 50px;">
        <button class="layui-btn" style="width: 300px;" type="submit" id="closesparent" onclick="closeiframe()">修改用户
        </button>
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
    $("#departmentname").val(data.departmentname);
    $("#detail").val(data.detail);
    $("#zhi").val(data.id);

    function closeiframe() {
        var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
        parent.layer.close(index); //再执行关闭
        //parent.window.layui.$("#search").click(); // 触发上层页面列表刷新
    }


</script>
</body>
</html>
