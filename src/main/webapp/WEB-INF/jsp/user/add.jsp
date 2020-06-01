<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>用户添加</title>
	</head>
	<link rel="stylesheet" href="../../../static/layui/css/layui.css" media="all" />
	<script src="../../../static/layui/layui.js"></script>
	<body>
		<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
			<legend>用户添加页面</legend>
		</fieldset>

		<form class="layui-form layui-form-pane" action="../../../user/adduser" style="margin-left: 300px;">
			<div class="layui-form-item">
				<label class="layui-form-label">登陆名</label>
				<div class="layui-input-inline">
					<input type="text" name="loginname" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
				</div>
			</div>


			<div class="layui-form-item">
				<label class="layui-form-label">用户名</label>
				<div class="layui-input-inline">
					<input type="text" name="username" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
				</div>
			</div>


            <div class="layui-form-item">
                <label class="layui-form-label">密码</label>
                <div class="layui-input-inline">
                    <input type="text" name="password" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
                </div>
            </div>


			<div class="layui-form-item">
				<label class="layui-form-label">用户状态</label>
				<div class="layui-input-inline">
					<select name="state" lay-filter="aihao">
						<option value=""></option>
						<option value="1">阅读</option>
						<option value="2">游戏</option>
					</select>
				</div>
			</div>

			<div class="layui-form-item">
				<label class="layui-form-label">创建时间</label>
				<div class="layui-input-inline">
					<input type="text" name="createtime" id="date1" autocomplete="off" class="layui-input">
				</div>
			</div>
			
			<div class="layui-form-item">
				<button class="layui-btn"  type="submit">添加用户</button>
				<button class="layui-btn"> <a style="color: white" href="../../../jumpuser">返回</a> </button>
			</div>

		</form>


		<script>
			layui.use('form', function() {
				var form = layui.form; //只有执行了这一步，部分表单元素才会自动修饰成功
				//但是，如果你的HTML是动态生成的，自动渲染就会失效
				//因此你需要在相应的地方，执行下述方法来进行渲染
				form.render();
			});
		</script>
	</body>
</html>
