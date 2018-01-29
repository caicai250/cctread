<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>常春藤阅读</title>
    <link rel="stylesheet" href="${request.contextPath}/bootstrap-3.3.4-dist/css/bootstrap.css">
    <script src="${request.contextPath}/jquery/jquery-3.3.1.min.js"></script>
    <script src="${request.contextPath}/bootstrap-3.3.4-dist/js/bootstrap.js"></script>
    <script src="${request.contextPath}/bootstrap-3.3.4-dist/js/popper.min.js"></script>

</head>
<body>
    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <a href="#" class="navbar-brand" style="padding:0;"><img style="height: 100%;" src="${request.contextPath}/image/logo.png" alt="${title}"></a>
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
            </div>
            <div class="collapse navbar-collapse" id="navbar-collapse">
                <ul class="nav navbar-nav navbar-right" style="margin-top:0">
                    <#list listMuen as em>
                        <li ><a href="javascript:alert(${em.key});">${em.value}</a></li>
                    </#list>
                    <#--<li class="active"><a href="#"><span class="glyphicon glyphicon-home"></span> 首页</a></li>
                    <li><a href="#"><span class="glyphicon glyphicon-list"></span> 资讯</a></li>
                    <li><a href="#"><span class="glyphicon glyphicon-fire"></span> 案例</a></li>
                    <li><a href="#"><span class="glyphicon glyphicon-question-sign"></span> 关于</a></li>-->
                </ul>
            </div>
        </div>
    </nav>
</body>

</html>