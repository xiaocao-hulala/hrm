<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>员工添加</title>
</head>
<link rel="stylesheet" href="../static/layui/css/layui.css" media="all"/>
<script src="../static/layui/layui.js"></script>
<script src="../static/js/jquery-3.4.1.min.js"></script>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
    <legend>员工修改页面</legend>
</fieldset>

<form class="layui-form layui-form-pane" action="../worker/updateworker" style="margin-left: 300px;">
    <div class="layui-form-item">
        <label class="layui-form-label">员工名字</label>
        <div class="layui-input-inline">
            <input type="text" name="name" id="workername" lay-verify="required" placeholder="请输入" autocomplete="off"
                   class="layui-input">
        </div>
    </div>


    <div class="layui-form-item">
        <label class="layui-form-label">员工电话</label>
        <div class="layui-input-inline">
            <input type="text" name="tel" id="workertel" lay-verify="required" placeholder="请输入" autocomplete="off"
                   class="layui-input">
        </div>
    </div>


    <div class="layui-form-item">
        <label class="layui-form-label">员工邮件</label>
        <div class="layui-input-inline">
            <input type="text" name="email" id="workeremail" lay-verify="required" placeholder="请输入" autocomplete="off"
                   class="layui-input">
        </div>
    </div>


    <div class="layui-form-item">
        <label class="layui-form-label">职位</label>
        <div class="layui-input-inline">
            <input type="text" name="position" id="workerpositon" lay-verify="required" placeholder="请输入"
                   autocomplete="off"
                   class="layui-input">
        </div>
    </div>s


    <div class="layui-form-item">
        <label class="layui-form-label">学历</label>
        <div class="layui-input-inline">
            <input type="text" name="xueli" id="workerxueli" lay-verify="required" placeholder="请输入" autocomplete="off"
                   class="layui-input">
        </div>
    </div>


    <div class="layui-form-item">
        <label class="layui-form-label">身份证号</label>
        <div class="layui-input-inline">
            <input type="text" name="idcard" id="workeridcard" lay-verify="required" placeholder="请输入"
                   autocomplete="off"
                   class="layui-input">
        </div>
    </div>


    <div class="layui-form-item">
        <label class="layui-form-label">部门</label>
        <div class="layui-input-inline">
            <select name="state" id="workerde" lay-filter="aihao">
                <option value=""></option>
                <option value="1">技术部</option>
                <option value="2">销售部</option>
            </select>
        </div>
    </div>


    <div class="layui-form-item">
        <label class="layui-form-label">员工地址</label>
        <div class="layui-input-inline">
            <input type="text" name="address" id="workeraddress" lay-verify="required" placeholder="请输入"
                   autocomplete="off"
                   class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">入职时间</label>
        <div class="layui-input-inline">
            <input type="text" name="createtime" id="workertime" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <button class="layui-btn" type="submit" onclick="closeiframe()">修改用户</button>
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

    var data = parent.currdata;
    $("#workername").val(data.name);
    $("#workertel").val(data.tel);
    $("#workerpositon").val(data.position);
    $("#workerxueli").val(data.xueli);
    $("#workeridcard").val(data.idcard);
    $("#workeraddress").val(data.address);
    $("#workertime").val(data.createtime);
    $("#workeremail").val(data.email);

    var obj = $("#workerde").get(0);
    for (var i = 0; i < obj.options.length; i++) {
        var temp = obj.options[i].value;
        if (temp == data.departmentid) {
            obj.options[i].selected = 'selected';
            break;
        }
    }



    function closeiframe() {
        var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
        parent.layer.close(index); //再执行关闭
        parent.window.layui.$("#search").click(); // 触发上层页面列表刷新
    }
</script>
</body>
</html>
