<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>常春藤阅读</title>
    <link rel="stylesheet" href="${request.contextPath}/webjars/bootstrap/3.3.4/css/bootstrap.min.css">
    <link href="${request.contextPath}/webjars/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${request.contextPath}/css/login.css">
    <link rel="stylesheet" href="${request.contextPath}/css/jquery.motionCaptcha.0.2.css">
</head>
<body>
<div class="container">
    <form role="form" action="${request.contextPath}/login" id="mc-form"  method="POST">
        <div class="form row">
            <div class="form-horizontal col-md-offset-3" id="login_form">
                <h3 class="form-title">LOGIN</h3>
                <div class="col-md-9">
                    <div class="form-group">
                        <i class="fa fa-user fa-lg"></i>
                        <input class="form-control required" type="text" placeholder="请输入账号" id="username" name="username" autofocus="autofocus" maxlength="20"/>
                    </div>
                    <div class="form-group">
                        <i class="fa fa-lock fa-lg"></i>
                        <input class="form-control required" type="password" placeholder="请输入密码" id="password" name="password" maxlength="8"/>

                        <#if RequestParameters.error??>
                            <#if Session.SPRING_SECURITY_LAST_EXCEPTION??>
                                <span class="help-block" style="color:red">${Session.SPRING_SECURITY_LAST_EXCEPTION.message}</span>
                            </#if>
                        </#if>
                    </div>

                    <div id="mc">
                        <canvas id="mc-canvas">
                            浏览器不支持canvas，请使用支持html5 canvas的浏览器
                        </canvas>
                    </div>

                    <input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}">
                    <div class="form-group col-md-offset-9">
                        <input type="submit" class="btn btn-success pull-right" name="submit" id="submit" value="登录" disabled/>
                        <a class="btn btn-success pull-right" href="${request.contextPath}/signIn">注册</a>
                    </div>
                </div>
            </div>
        </div>
    </form>
</div>
</body>
<script src="${request.contextPath}/webjars/jquery/3.3.1-1/jquery.min.js"></script>
<script src="${request.contextPath}/webjars/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<script src="${request.contextPath}/js/jquery.motionCaptcha.0.2.js"></script>

<script>
    $('#mc-form').motionCaptcha({
        actionId :'#mc-form',
        canvasId :'#mc-canvas',
        divId :'#mc',
        submitId:'#submit',
        errorMsg: '请重新绘制',
        successMsg: '验证成功',
        label: '<p>请在方框内画出形状提交表格:</p>'
    });

</script>
</html>