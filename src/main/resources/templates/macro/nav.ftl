<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
</head>
<body>
    <#--固定导航栏、logo  --每个页面都要显示-->
    <#macro commonNav listMuen>
        <nav class="navbar navbar-default navbar-fixed-top">
            <div class="container">
                <div class="collapse navbar-collapse" id="navbar-collapse">
                <#--<img class="index-logo" src="${request.contextPath}/image/logo.png" alt="${title}"></a>-->
                    <ul class="nav navbar-nav" style="margin-top:0">
                    <#list listMuen as em>
                        <li ><a href="javascript:alert(${em.codeProice});">${em.codeName}</a></li>
                    </#list>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <input type="text" placeholder="搜索" class="navbar-input">
                        <button class="glyphicon glyphicon-search navbar-button"></button>
                        <li><a href="${request.contextPath}/login">登陆</a> </li>
                        <li><a href="${request.contextPath}/signIn">注册</a> </li>
                        <li><a href="">我的书架</a> </li>
                        <li><a href="">联系客服</a> </li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container search-container">
        <#--网站logo-->
            <a href="#" class="navbar-brand" style="padding:0;"><img class="index-logo" src="${request.contextPath}/image/logo.png" alt="${title}"></a>
            <button type="button" class="btn btn-sm author-button">
                <span class="glyphicon glyphicon-briefcase"></span>作家福利
            </button>
            <button type="button" class="btn btn-sm author-button" style="margin-right: 10px">
                <span class="glyphicon glyphicon-edit"></span>我要当作家
            </button>
        <#--搜索框-->
            <div class="input-group">
                <input type="text" class="form-control">
                <span class="input-group-addon">
                   <button type="button" class="btn btn-default">
                        <span class="glyphicon glyphicon glyphicon-search"></span>
                    </button>
                </span>
            </div>
        </div>
    </#macro>

    <#macro test cctNovel>
        ${cctNovel}
    </#macro>
</body>
</html>
