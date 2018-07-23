<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>${title}</title>
    <link rel="stylesheet" href="${request.contextPath}/webjars/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="${request.contextPath}/css/index.css">
    <link rel="stylesheet" href="${request.contextPath}/css/novelinfo.css">
    <#import  "../macro/nav.ftl" as nav>
    <#import "./novelinfo-macro.ftl" as novelInfo>
</head>
<body>
    <div id="navel-info-container">
        <#--固定导航栏、logo  --每个页面都要显示-->
        <@nav.commonNav listMuen=listMuen rightButtonList=rightButtonList />
        <#--书籍封面/简介/操作按钮-->
        <@novelInfo.novelInfoData novelTitle=novelTitle author=author bookIntro=bookIntro downloadUrl=downloadUrl />

            <div class="container book-detail-tab box-con">
                <div class="box-hd click-hd">
                    <#--展示书籍详细信息  --两个tab页、一个锚链接-->
                    <@novelInfo.novelDetailTab />
                    <#--展示书籍信息层-->
                    <@novelInfo.novelDetailShow bookIntro=bookIntro />
                </div>
            </div>

        <#--作品讨论区 --暂时使用假数据-->
        <@novelInfo.novelDiscuss />
    </div>

</body>
</html>
<script src="${request.contextPath}/webjars/jquery/3.3.1-1/jquery.min.js"></script>
<script src="${request.contextPath}/webjars/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<script>
        $("#chapterlisttab").click(function() {
            $("#bookdetail").hide();
            $("#chapterlisttab").addClass("active");
            $("#catalog").show();
            $("#booklistdetail").removeClass("active");
        })
        $("#booklistdetail").click(function() {
            $("#catalog").hide();
            $("#booklistdetail").addClass("active");
            $("#bookdetail").show();
            $("#chapterlisttab").removeClass("active");
        })
</script>

