<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>人事管理登陆页面</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.4.1.min.js"></script>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/bootstrap.css"/>
    <script src="${pageContext.request.contextPath}/static/js/bootstrap.bundle.js"></script>
</head>

<style>
    body {
        background-image: url(${pageContext.request.contextPath}/static/img/background.jpg);
        background-size: cover;
        text-align: center;
    }
</style>
<body>


<div class="container">
    <div class="row mb-5">
    </div>
    <div class="row mb-5">
    </div>


    <div class="row">
        <div class="col-4">
        </div>

        <div class="col-4">
            <div class="card">
                <div class="card-header bg-info">
                    人事管理系统
                </div>

                <div class="card-body">
                    <form action="login">
                        <div class="form-group row">
                            <p>用户名:</p>
                            <div class="col-sm-8">
                                <input type="text" class="form-control pl-0" name="username">
                            </div>
                        </div>

                        <div class="form-group row">
                            <p style="margin-right: 15px;">密码:</p>
                            <div class="col-sm-8">
                                <input type="password" class="form-control" name="password">
                            </div>
                        </div>


                        <div class="row">

                            <div class="form-check pl-5">
                                <input class="form-check-input" type="checkbox" value="" id="defaultCheck1">
                                <label class="form-check-label" for="defaultCheck1">
                                    下次自动登陆
                                </label>
                            </div>
                        </div>

                        <div class="row mt-3">
                            <button type="submit" class="col-12 bg-info">提交</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </div>

</div>

</body>
</html>
