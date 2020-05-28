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
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>
<div style="border: 0.0625rem solid #F2F2F2; height: 38px;">
    <form class="layui-form">
        <!-- 提示：如果你不想用form，你可以换成div等任何一个普通  元素 -->
        <div class="layui-form-item">
            <div class="layui-input-block">
                <input style="width: 200px; float: left;" type="text" name="" placeholder="请输入登陆名字" autocomplete="off"
                       class="layui-input">
                <input style="width: 200px; float: left;" type="text" name="" placeholder="请输入登陆名字" autocomplete="off"
                       class="layui-input">
                <button type="submit" class="layui-btn layui-btn-normal">搜索</button>
            </div>
        </div>
    </form>
</div>

<table class="layui-hide" id="Demo" lay-filter="test"></table>

<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>


<script>
    var currdata;//当前点击的这行数据
    layui.use(['layer', 'table'], function () {
        var table = layui.table;
        var layer = layui.layer;
        //展示已知数据
        table.render({
            elem: '#Demo',
            url: '../../../user/selectall',
            cellMinWidth: 80,
            toolbar: 'default',
            page: true, //开启分页
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
                    width: 120
                }, , {
                    field: 'createtime',
                    title: '创建时间'
                }, {
                    field: 'password',
                    title: '密码',
                    width: 60
                }, {
                    fixed: 'right',
                    width: 165,
                    align: 'center',
                    toolbar: '#barDemo',
                    //加了这个表格右边的编辑栏才会出现
                }
                ]
            ]
        });

        //监听工具条
        table.on('tool(test)', function (obj) { //注：tool 是工具条事件名，test 是 table 原始容器的属性 lay-filter="对应的值"
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
            var tr = obj.tr; //获得当前行 tr 的 DOM 对象（如果有的话）
            if (layEvent === 'del') { //删除
                layer.confirm('真的删除行么', function (index) {
                    obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
                    layer.close(index);
                    //向服务端发送删除指令
                  /*  // console.log(data.id);*/
                location.href="../../../user/deleteuser/"+data.id;
                });
            } else if (layEvent === 'edit') { //编辑
                //do something

                layer.alert('aaaaaa');
                //同步更新缓存对应的值
                obj.update({
                    username: '123'
                    , title: 'xxx'
                });
            }
        });
    });


</script>


</body>
</html>
