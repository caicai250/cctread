<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>${title}</title>
    <link rel="stylesheet" href="${request.contextPath}/webjars/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="${request.contextPath}/css/index.css">

    <#--<script src="${request.contextPath}/webjars/popper.js/1.14.1/popper.js"></script>-->
     <#import "/main-macro.ftl" as main>

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
                                <li ><a href="javascript:alert(${em.codeProice});">${em.codeName}</a></li>
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
                            <li ><a href="javascript:alert(${em.codeProice});">${em.codeName}</a></li>
                        </#list>
                    </ul>
                </div>
                <#--轮播图-->
                <div class="container img-container">
                    <div id="myCarousel" class="carousel slide">
                        <ol class="carousel-indicators">
                            <li data-target="#myCarousel" data-slide-to="0" class="active"> </li>
                            <li data-target="#myCarousel" data-slide-to="1"> </li>
                            <li data-target="#myCarousel" data-slide-to="2"> </li>
                            <li data-target="#myCarousel" data-slide-to="3"> </li>
                            <li data-target="#myCarousel" data-slide-to="4"> </li>
                        </ol>
                        <div class="carousel-inner">
                            <div class="item active">
                                <img src="${request.contextPath}/image/zly1.jpg" alt="第一张" />
                            </div>
                            <div class="item">
                                <img src="${request.contextPath}/image/zly2.jpg" alt="第二张" />
                            </div>
                            <div class="item">
                                <img src="${request.contextPath}/image/zly3.jpg" alt="第三张" />
                            </div>
                            <div class="item">
                                <img src="${request.contextPath}/image/zly4.jpg" alt="第四张" />
                            </div>
                            <div class="item">
                                <img src="${request.contextPath}/image/zly5.jpg" alt="第五张" />
                            </div>

                        </div>
                        <a href="#myCarousel" data-slide="prev" class="carousel-control left">
                            <span class="glyphicon glyphicon-chevron-left"> </span>
                        </a>
                        <a href="#myCarousel" data-slide="next" class="carousel-control right">
                            <span class="glyphicon glyphicon-chevron-right"> </span>
                        </a>
                    </div>

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
                    <@main.bookType bookTypeName="古代言情" romanceList=modernRomanceList />
                    <@main.bookType bookTypeName="现代言情" romanceList=modernRomanceList />
                    <@main.bookType bookTypeName="玄幻言情" romanceList=modernRomanceList />
                    <@main.bookType bookTypeName="浪漫青春" romanceList=modernRomanceList />
                </div>
                <div class="container recommend-container">
                    <@main.bookType bookTypeName="悬疑灵异" romanceList=modernRomanceList />
                    <@main.bookType bookTypeName="科幻游戏" romanceList=modernRomanceList />
                    <@main.bookType bookTypeName="改编频道" romanceList=modernRomanceList />
                    <@main.bookType bookTypeName="更多作品" romanceList=modernRomanceList />
                </div>

                <@main.advert advertPath=request.contextPath+"/image/ad2.jpg" />

                <div class="container recommend-container">
                    <@main.rankData title="收藏榜" rankList=collectionList imgSrc=request.contextPath+"/image/rank1.jpg" isCount=true unit="月票" />
                    <@main.rankData title="收藏榜" rankList=collectionList imgSrc=request.contextPath+"/image/rank1.jpg" isCount=false unit="" />
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


</script>