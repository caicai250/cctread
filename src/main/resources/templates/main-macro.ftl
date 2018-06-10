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

    <#--自定义分类书籍模板-->
    <#macro bookType bookTypeName romanceList>
        <div class="book-type-name">
            <div class="model-name">
                <p>${bookTypeName}</p>
            </div>
            <ul>
                <#list romanceList as em>
                    <li ><a href="javascript:alert(${em.key});">${em.value}</a></li>
                </#list>
            </ul>
        </div>
    </#macro>

    <#--自定义排行榜模板-->
    <#macro rankData title rankList imgSrc isCount unit>
        <div class="rank-container">
            <div class="model-name">
                <p>${title}</p>
            </div>
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
                            <p><a href="${em.key}" target="_blank">${em.value}</a></p>
                        </li>
                    </#if>
                </#list>
            </ul>
        </div>
    </#macro>


</body>
</html>
