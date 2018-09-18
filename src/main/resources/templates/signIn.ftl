<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>常春藤阅读</title>
    <link rel="stylesheet" href="${request.contextPath}/webjars/bootstrap/3.3.4/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <form role="form" action="${request.contextPath}/signInUser"  method="POST">
        <input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}">
        <div class="form-group">
            <label for="author">用户名</label>
            <input type="text" class="form-control" id="username" name="username" placeholder="请输入名称">
        </div>
        <div class="form-group">
            <label for="author">登录名</label>
            <input type="text" class="form-control" id="loginname" name="loginname" placeholder="请输入登录名">
        </div>
        <div class="form-group">
            <label for="author">登录密码</label>
            <input type="password" class="form-control" id="password" name="password" placeholder="请输入密码">
        </div>
        <div class="form-group">
            <label for="author">确认密码</label>
            <input type="password" class="form-control" id="password2" name="password2" placeholder="请输入密码">
        </div>
        <div class="form-group">
            <label for="author">手机号</label>
            <input type="tel" class="form-control" id="phone" name="phone" placeholder="请输入手机号码">
        </div>
        <input type="submit" class="btn btn-default" value="注册"/>
    </form>
</div>
</body>
<script src="${request.contextPath}/webjars/jquery/3.3.1-1/jquery.min.js"></script>
<script src="${request.contextPath}/webjars/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</html>