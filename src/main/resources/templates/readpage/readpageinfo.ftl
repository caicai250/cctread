<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>${title}</title>
    <link rel="stylesheet" href="${request.contextPath}/webjars/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="${request.contextPath}/css/index.css">
    <link rel="stylesheet" href="${request.contextPath}/css/readpage.css">

    <#import  "../macro/nav.ftl" as nav>
    <#import  "../macro/advert.ftl" as adverts>
    <#import  "./readpageinfo-macro.ftl" as readpage>
</head>
<body>
    <div id="read-info-container">
        <#--固定导航栏、logo  --每个页面都要显示-->
        <@nav.commonNav listMuen=listMuen/>
        <#--广告-->
        <@adverts.advert advertPath=request.contextPath+"/image/ad.jpg" />
        <#--阅读界面设置，可以选择颜色，字体大小-->
        <@readpage.readset />
        <#--阅读界面-->
        <@readpage.readcontent chapterInfo=chapterInfo/>
    </div>

</body>
</html>
<script src="${request.contextPath}/webjars/jquery/3.3.1-1/jquery.min.js"></script>
<script src="${request.contextPath}/webjars/bootstrap/3.3.4/js/bootstrap.min.js"></script>

<script>
    function changeThemeColor(mode) {
        switch (mode){
            case 'theme_yellow':
                $(".chapter-read").css({"background-color":"#faf3eb","color":"#333"});
                $(".chapter-control").css({"background-color":"#faf3eb","color":"#333"});
                break;
            case 'theme_orange':
                $(".chapter-read").css({"background-color":"#f6ead2","color":"#333"});
                $(".chapter-control").css({"background-color":"#f6ead2","color":"#333"});
                break;
            case 'theme_green':
                $(".chapter-read").css({"background-color":"#eaf0e7","color":"#333"});
                $(".chapter-control").css({"background-color":"#eaf0e7","color":"#333"});
                break;
            case 'theme_blue':
                $(".chapter-read").css({"background-color":"#e8eff3","color":"#333"});
                $(".chapter-control").css({"background-color":"#e8eff3","color":"#333"});
                break;
            case 'theme_pink':
                $(".chapter-read").css({"background-color":"#f5e4e4","color":"#333"});
                $(".chapter-control").css({"background-color":"#f5e4e4","color":"#333"});
                break;
            case 'theme_gray':
                $(".chapter-read").css({"background-color":"#e5e5e5","color":"#333"});
                $(".chapter-control").css({"background-color":"#e5e5e5","color":"#333"});
                break;
            case 'theme_black':
                $(".chapter-read").css({"background-color":"#000","color":"#999"});
                $(".chapter-control").css({"background-color":"#000","color":"#999"});
                break;
        }
    }

    function changeThemeFontSize(fontSize) {
        $("#auto-chapter").css("font-size",fontSize);
    }

    $(function() {
        $.get("${request.contextPath}/getChapterTXT",{novelId:"27",chapterId:"8249"},function(data,status){
            if(status=='success'){
                var str=data.replace(/\n/g, "</p><p>");
                $("#auto-chapter").html("<p id='title'>"+str+"</p>");
            }else{
                alert("本章内容获取异常，请联系管理员");
            }
            $("#title").remove();
        });
            }
    );
</script>

