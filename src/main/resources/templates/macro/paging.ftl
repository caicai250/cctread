<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
</head>
<body>

<#--分页模板
参数说明：
    pageNo:当前的页码，
    totalPage:总页数，
    showPages:显示的页码个数，
    callFunName:回调方法名（需在js中自己定义）
 -->
<#macro page pageNo totalPage showPages callFunName>
<div class="click-bd">
    <ul class="pagination pagination-lg">
		<#if pageNo!=1>
            <li><a href="javascript:${callFunName+'('+1+')'};" >首页</a></li>
            <li><a href="javascript:${callFunName+'('+(pageNo-1)+')'};">&laquo;</a></li>
        </#if>
        <#if pageNo-showPages/2 gt 0>
            <#assign start = pageNo-(showPages-1)/2/>
            <#if showPages gt totalPage>
                <#assign start = 1/>
            </#if>
        <#else>
            <#assign start = 1/>
        </#if>
        <#if totalPage gt showPages>
            <#assign end = (start+showPages-1)/>
            <#if end gt totalPage>
                <#assign start = totalPage-showPages+1/>
                <#assign end = totalPage/>
            </#if>
        <#else>
            <#assign end = totalPage/>
        </#if>
        <#assign pages=start..end/>
        <#list pages as page>
            <#if page==pageNo>
                <li><a href="javascript:${callFunName+'('+page+')'};" >${page}</a></li>
            <#else>
                <li><a href="javascript:${callFunName+'('+page+')'};">${page}</a></li>
            </#if>
        </#list>
		<#if pageNo!=totalPage>
            <li><a href="javascript:${callFunName+'('+(pageNo+1)+')'};" >&raquo;</a></li>
            <li><a href="javascript:${callFunName+'('+totalPage+')'};" >尾页</a></li>
        </#if>
    </ul>
</div>
</#macro>
</body>
</html>
