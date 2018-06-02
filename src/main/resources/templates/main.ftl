<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>${title}</title>
    <link rel="stylesheet" href="${request.contextPath}/bootstrap-3.3.4-dist/css/bootstrap.css">
    <link rel="stylesheet" href="${request.contextPath}/css/index.css">
    <script src="${request.contextPath}/jquery/jquery-3.3.1.min.js"></script>
    <script src="${request.contextPath}/bootstrap-3.3.4-dist/js/bootstrap.js"></script>
    <script src="${request.contextPath}/bootstrap-3.3.4-dist/js/popper.min.js"></script>

</head>
    <body>
        <div id="home-container">
            <nav class="navbar navbar-default navbar-fixed-top">
                <div class="container">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                    </div>
                    <div class="collapse navbar-collapse" id="navbar-collapse">
                        <ul class="nav navbar-nav" style="margin-top:0">
                        <#list listMuen as em>
                            <li ><a href="javascript:alert(${em.key});">${em.value}</a></li>
                        </#list>
                        </ul>
                        <ul class="nav navbar-nav navbar-right">
                            <li> <a href="">登录</a></li>
                            <li><a href="">注册</a></li>
                            <li><a href="">我的书架</a></li>
                            <li><a href="">联系客服</a></li>
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
                <div class="input-group">
                    <input type="text" class="form-control">
                    <span class="input-group-addon">
                       <button type="button" class="btn btn-default">
                            <span class="glyphicon glyphicon glyphicon-search"></span>
                        </button>
                    </span>
                </div>
            </div>
            <div class="container book-style-contaoner">
                <ul class="nav navbar-nav" style="margin-top:0">
                    <li>
                        <a href="javascriptLalert(0)">全部作品</a>
                    </li>
                    <#list listMuen as em>
                        <li ><a href="javascript:alert(${em.key});">${em.value}</a></li>
                    </#list>
                </ul>
            </div>
            <div class="container img-container">
                <a href="#" class="navbar-brand" style="padding:0;"><img  src="${request.contextPath}/image/zly1.jpg"></a>
            </div>

            <#--<div class="content">-->
                <#--<div class="chapterName">-->
                <#--${book.chapterName}-->
                <#--</div>-->
            <#--${book.content}<br>-->
                <#--<div class="chapterBottom">-->
                    <#--<a href="http://www.baidu.com">${book.prevChapterName!}</a>-->
                    <#--<a href="http://www.baidu.com">${book.nextChapterName!}</a>-->
                <#--</div>-->
            <#--</div>-->
        </div>

    </body>

</html>
<#--<style>-->
    <#--.content{-->
        <#--margin-top: 50px;-->
    <#--}-->
    <#--.chapterName{-->
        <#--text-align: center;-->
        <#--font-size: 30px;-->
    <#--}-->
    <#--.chapterBottom{-->
        <#--text-align: right;-->
    <#--}-->
<#--</style>-->