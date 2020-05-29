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

<div class="demoTable">
    搜索用户名：
    <div class="layui-inline">
        <input class="layui-input" name="username" id="username2" autocomplete="off">
    </div>
    搜索登陆名：
    <div class="layui-inline">
        <input class="layui-input" name="loginname" id="loginname2" autocomplete="off">
    </div>
    <button class="layui-btn" data-type="reload">搜索</button>
</div>


<table class="layui-hide" id="Demo" lay-filter="test"></table>

<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>

<script>
    var changeurl = "../../../user/selectByParams";
    var currdata;//当前点击的这行数据
    layui.use(['layer', 'table', 'laypage'], function () {
        var table = layui.table;
        var layer = layui.layer;
        var laypage = layui.laypage;
        //展示已知数据
        table.render({
            elem: '#Demo',
            id: 'testReload',
            url: changeurl,
            cellMinWidth: 80,
            toolbar: 'default',
            cols: [
                [{
                    type: 'checkbox'
                },
                    //标题栏
                    {
                        field: 'id',
                        title: 'ID',
                        sort: true,
                        width: 80
                    }, {
                    field: 'loginname',
                    title: '登陆名',
                    width: 120
                }, {
                    field: 'username',
                    title: '用户名',
                    width: 200
                }, , {
                    field: 'createtime',
                    title: '创建时间',
                    width: 102
                }, {
                    field: 'password',
                    title: '密码',
                    width: 120
                }, {
                    fixed: 'right',
                    width: 165,
                    align: 'center',
                    toolbar: '#barDemo',
                    //加了这个表格右边的编辑栏才会出现
                }
                ]
            ]
            ,page:true
        });

        //监听工具条
        table.on('tool(test)', function (obj) { //注：tool 是工具条事件名，test 是 table 原始容器的属性 lay-filter="对应的值"
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
            var tr = obj.tr; //获得当前行 tr 的 DOM 对象（如果有的话）
            currdata = data;
            if (layEvent === 'del') { //删除
                layer.confirm('真的删除行么', function (index) {
                    obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
                    layer.close(index);
                    //向服务端发送删除指令
                    /*  // console.log(data.id);*/
                    location.href = "../../../user/deleteuser/" + data.id;
                });
            } else if (layEvent === 'edit') { //编辑
                //iframe层
                layer.open({
                    type: 2,
                    title: '用户修改页面',
                    shadeClose: true,
                    shade: 0.8,
                    area: ['380px', '70%'],
                    content: '../../../alterpage/alter.jsp' //iframe的url
                });

            }
        });

        var $ = layui.$, active = {
            reload: function () {
                var loginnameaa = $('#loginname2').val();
                var usernameaa = $('#username2').val();
                //执行重载
                table.reload('testReload', {
                    page: {
                        curr: 1 //重新从第 1 页开始
                    }
                    , where: {
                        loginname: loginnameaa,
                        username: usernameaa,
                    }
                }, 'data');
            }
        };

        $('.demoTable .layui-btn').on('click', function () {
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });
    });

</script>

</body>
</html>
