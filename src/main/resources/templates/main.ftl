<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>${title}</title>
    <link rel="stylesheet" href="${request.contextPath}/webjars/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="${request.contextPath}/css/index.css">

    <#--<script src="${request.contextPath}/webjars/popper.js/1.14.1/popper.js"></script>-->
     <#import "main-macro.ftl" as main>

</head>
    <body>
            <div id="home-container">
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
                                <#list rightButtonList as em>
                                    <li><a href="">em.value</a> </li>
                                </#list>
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

                <div class="container book-style-contaoner">
                    <ul class="nav navbar-nav" style="margin-top:0">
                        <li>
                            <a href="javascriptLalert(0)">全部作品</a>
                        </li>
                        <#list listMuen as em>
                            <li ><a href="javascript:alert(${em.codeProice});">${em.codeName}</a></li>
                        </#list>
                    </ul>
                </div>

                <div class="container img-container">
                    <#--轮播图-->
                    <@main.myCarousel id="myCarousel" mainCarouselList=mainCarouselList />
                    <#--头条信息列表-->
                    <div class="title-container">
                        <img src="${request.contextPath}/image/zly1.jpg"/>
                        <ul>
                            <#list titleMenu as em>
                                <li ><a href="javascript:alert(${em.key});">${em.value}</a></li>
                            </#list>
                        </ul>
                    </div>
                </div>

                <@main.advert advertPath=request.contextPath+"/image/ad.jpg" />

                <div class="container recommend-container">
                    <@main.rankData title="排行榜" rankList=collectionList imgSrc=request.contextPath+"/image/rank1.jpg" isCount=true unit="" />

                    <div class="editor-recommend">
                        <@main.modelName name="编辑强推" />
                        <#list editorRecommendList as editorRecommendData>
                            <@main.editorRecommend editorRecommendData=editorRecommendData />
                        </#list>
                    </div>

                    <@main.rankData title="本周推荐" rankList=collectionList imgSrc=request.contextPath+"/image/rank1.jpg" isCount=true unit="" />
                </div>

                <@main.advert advertPath=request.contextPath+"/image/ad4.jpg" />

                <div class="container recommend-container">
                    <div class="classify-article">
                        <@main.modelName name="分类好文" />
                        <@main.myCarousel id="myCarousel1" mainCarouselList=mainCarouselList />
                        <@main.classifyActicle classifyArticleList=classifyArticleList />
                    </div>
                    <@main.bookType bookTypeName="现代言情" romanceList=modernRomanceList />
                    <@main.bookType bookTypeName="古代言情" romanceList=modernRomanceList />
                    <@main.bookType bookTypeName="玄幻言情" romanceList=modernRomanceList />
                </div>
                <div class="container recommend-container">
                    <div class="classify-article">
                        <@main.modelName name="分类好文" />
                        <@main.myCarousel id="myCarousel2" mainCarouselList=mainCarouselList />
                        <@main.classifyActicle classifyArticleList=classifyArticleList />
                    </div>
                    <@main.bookType bookTypeName="玄幻仙侠" romanceList=modernRomanceList />
                    <@main.bookType bookTypeName="悬疑灵异" romanceList=modernRomanceList />
                    <@main.bookType bookTypeName="科幻游戏" romanceList=modernRomanceList />
                </div>

                <@main.advert advertPath=request.contextPath+"/image/ad2.jpg" />

                <div class="container recommend-container">
                    <@main.rankData title="收藏榜" rankList=collectionList imgSrc=request.contextPath+"/image/rank1.jpg" isCount=true unit="月票" />
                    <@main.rankData title="阅读榜" rankList=collectionList imgSrc=request.contextPath+"/image/rank1.jpg" isCount=false unit="" />
                    <@main.rankData title="点赞榜" rankList=collectionList imgSrc=request.contextPath+"/image/rank1.jpg" isCount=true unit="点赞数" />
                    <@main.rankData title="下载榜" rankList=collectionList imgSrc=request.contextPath+"/image/rank1.jpg" isCount=true unit="下载数" />
                </div>

            </div>

    </body>

</html>
    <script src="${request.contextPath}/webjars/jquery/3.3.1-1/jquery.min.js"></script>
    <script src="${request.contextPath}/webjars/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<script type="text/javascript">


    //自动播放
    $("#myCarousel").carousel({
        interval :3000,
    });
    $("#myCarousel1").carousel({
        interval :3000,
    });
    $("#myCarousel2").carousel({
        interval :3000,
    });
</script>