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
    <#import "../macro/paging.ftl" as paging>
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
                    <@novelInfo.novelDetailTab chapterCount=chapterCount/>
                    <#--展示书籍信息层-->
                    <@novelInfo.novelDetailShow bookIntro=bookIntro chapterList=chapterList/>
                    <#--分页组件-->
                    <#--<@paging.page pageNo=page.pageNo totalPage=page.totalPage showPages=page.showPages callFunName=page.callFunName/>-->

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

        $(function(){
            //getAllChapterList("27");
        });

        function getAllChapterList(novelId){
            $.get("${request.contextPath}/getallchapterlist",{novelId:novelId},function (data,status) {
                var html="";
                if(status=='success'){
                    for(var i=0;i<data.length;i++){
                        html+="<li><a href='javascript:alert("+data[i].chapterId+")'>"+data[i].chapterName+"</a></li>";
                    }
                }else{
                    html="<li>章节信息获取异常</li>";
                }
                $("#chapterList").html(html);
            });
        }


    function getChapterList(novelId,start,limit){
        $.get("${request.contextPath}/getchapterlist",{novelId:novelId,start:start,limit:limit},function (data,status) {
            var html="";
            if(status=='success'){
                for(var i=0;i<data.length;i++){
                    html+="<li><a href='javascript:alert("+data[i].chapterId+")'>"+data[i].chapterName+"</a></li>";
                }
            }else{
                html="<li>章节信息获取异常</li>";
            }
            $("#chapterList").html(html);
        });
    }
     function getChapterPaging(pageNo){

         getChapterList("27",pageNo*100+'','100');
     }
</script>

