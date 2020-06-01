<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>部门添加</title>
	</head>
	<link rel="stylesheet" href="../../../static/layui/css/layui.css" media="all" />
	<script src="../../../static/layui/layui.js"></script>
	<body>
		<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
			<legend>部门添加页面</legend>
		</fieldset>

		<form class="layui-form layui-form-pane" action="../../../department/adduser" style="margin-left: 300px;">
			<div class="layui-form-item">
				<label class="layui-form-label">部门名</label>
				<div class="layui-input-inline">
					<input type="text" name="departmentname" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
				</div>
			</div>


			<div class="layui-form-item">
				<label class="layui-form-label">部门简介</label>
				<div class="layui-input-inline">
					<input type="text" name="detail" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
				</div>
			</div>

			<div class="layui-form-item">
				<button class="layui-btn"  type="submit">添加部门</button>
				<button class="layui-btn"> <a style="color: white" href="../../../jumpdepartment">返回</a> </button>
			</div>

		</form>


		<script>
			layui.use('form', function() {
				var form = layui.form; //只有执行了这一步，部分表单元素才会自动修饰成功
				//但是，如果你的HTML是动态生成的，自动渲染就会失效
				//因此你需要在相应的地方，执行下述方法来进行渲染
				form.render();
			});

			function back() {
			    window.location.href='../../../jumpdepartment';
            }
		</script>



	</body>
</html>
