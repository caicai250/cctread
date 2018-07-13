<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />


</head>
<body>
    <#--自定义广告模板-->
    <#macro advert advertPath>
    <div class="container ad-container">
        <a href="#"><img class="index-logo" src="${advertPath}"></a>
    </div>
    </#macro>

    <#--自定义模块名-->
    <#macro modelName name>
        <div class="model-name">
            <p>${name}</p>
        </div>
    </#macro>
    <#--自定义分类书籍模板-->
    <#macro bookType bookTypeName romanceList>
        <div class="book-type-name">
            <@modelName name=bookTypeName />
            <ul>
                <#list romanceList as em>
                    <li ><a href="${request.contextPath}/tonovelpage?novelId=${em.key}">${em.value}</a></li>
                </#list>
            </ul>
        </div>
    </#macro>

    <#--自定义轮播图模板-->
    <#macro myCarousel id mainCarouselList>
        <div id="${id}" class="carousel slide">
            <ol class="carousel-indicators">
                <#list mainCarouselList as em>
                    <#--默认从第一张开始轮播-->
                    <#if em?index == 0 >
                    <li data-target="#${id}" data-slide-to="${em?index}" class="active"> </li>
                    <#else>
                    <li data-target="#${id}" data-slide-to="${em?index}"> </li>
                    </#if>
                </#list>
            </ol>
            <div class="carousel-inner">
                <#list mainCarouselList as em>
                    <#if em?index ==0>
                        <div class="item active">
                            <a href="" target="_blank">
                                <img src="${request.contextPath}${em.imgSrc}" />
                            </a>
                        </div>
                    <#else>
                        <div class="item">
                            <a href="" target="_blank">
                                <img src="${request.contextPath}${em.imgSrc}" />
                            </a>
                        </div>
                    </#if>
                </#list>
            </div>
            <a href="#${id}" data-slide="prev" class="carousel-control left">
                <span class="glyphicon glyphicon-chevron-left"> </span>
            </a>
            <a href="#${id}" data-slide="next" class="carousel-control right">
                <span class="glyphicon glyphicon-chevron-right"> </span>
            </a>
        </div>
    </#macro>

    <#--自定义编辑强推模板-->
    <#macro editorRecommend editorRecommendData>
        <div class="editor-container">
            <div class="editor-img">
                <img src="${request.contextPath}${editorRecommendData.imgSrc}">
            </div>
            <div class="description">
                <div class="book-detail">
                    <h4><a href="" target="_blank">${editorRecommendData.title}</a></h4>
                    <p>${editorRecommendData.detail}</p>
                    <a class="btn-read" href="" target="_blank">立即阅读</a>
                </div>
            </div>
        </div>
    </#macro>

    <#--自定义分类好文-->
    <#macro classifyActicle classifyArticleList>
        <ul class="classify-book-list">
            <#list classifyArticleList as em>
                <li>
                    <a class="gray" href="" target="_blank">${em.classify}</a>
                    <a href="" target="_blank">${em.article}</a>
                </li>
            </#list>
        </ul>
    </#macro>
    <#--自定义排行榜模板-->
    <#macro rankData title rankList imgSrc isCount unit>
        <div class="rank-container">
            <@modelName name=title />
            <ul class="ranking-list">
                <#list rankList as em>
                    <#if em?index == 0 >
                        <li class="n1">
                            <a class="book" href="" target="_blank">
                                <img src="${imgSrc}">
                            </a>
                            <div class="detail">
                                <span class="num">NO.1</span>
                                <p class="name"><a href="" target="_blank">${em.value}</a></p>
                                <#if isCount>
                                    <p class="piao"><em>${em.count}</em>${unit}</p>
                                </#if>
                                <p class="author">${em.author}</p>
                            </div>
                        </li>
                    <#else>
                        <li class="n${em?index+1}">
                            <#if isCount>
                                <span class="piao">${em.count}</span>
                            <#else>
                                <span class="piao">${em.author}</span>
                            </#if>
                            <span class="num">${em?index+1}</span>
                            <p><a href="${request.contextPath}/tonovelpage?novelId=${em.key}" target="_blank">${em.value}</a></p>
                        </li>
                    </#if>
                </#list>
            </ul>
        </div>
    </#macro>


</body>
</html>
