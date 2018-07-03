<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>${title}</title>
    <link rel="stylesheet" href="${request.contextPath}/webjars/bootstrap/3.3.4/css/bootstrap.min.css">
    <link href="${request.contextPath}/webjars/bootstrap-datetimepicker/2.4.2/css/bootstrap-datetimepicker.min.css" rel="stylesheet" />
    <#import "../macro/select.ftl" as select/>
</head>
<body>
<form role="form" th:action="${request.contextPath}/uploadbook"  method="POST" enctype ="multipart/form-data">
    <div class="form-group">
        <label for="novelTitle">书籍名称</label>
        <input type="text" class="form-control" id="novelTitle" name="novelTitle" placeholder="请输入名称">
    </div>
    <div class="form-group">
        <label for="novelType">书籍分类</label>
        <@select.cctSelect id="novelType" datas=novelType key="codeProice" text="codeName"/>
    </div>
    <div class="form-group">
        <label for="author">书籍作者</label>
        <input type="text" class="form-control" id="author" name="author" placeholder="请输入名称">
    </div>
    <div class="form-group">
        <label for="user">书籍状态</label>
        <@select.cctSelect id="novelState" datas=novelStatus key="codeProice" text="codeName"/>
    </div>
    <div class="form-group">
        <label for="startDate">开始时间</label>
        <input type="text" id="startDate" name="startDate" class="form_datetime" >
    </div>
    <div class="form-group">
        <label for="updateDate">最后更新时间</label>
        <input type="text" id="updateDate" name="updateDate" class="form_datetime" >
    </div>
    <div class="form-group">
        <label for="isCharge">是否收费</label>
        <@select.cctSelect id="isCharge" datas=isCharge key="codeProice" text="codeName"/>
    </div>
    <div class="form-group">
        <label for="intro">小说简介</label>
        <input type="text" class="form-control" id="intro" name="intro" placeholder="请输入名称">
    </div>


    <div class="form-group">
        <label for="novelCover">书籍封面</label>
        <input type="file" id="novelCover" name="novelCover">
    </div>
    <div class="form-group">
        <label for="book">书籍</label>
        <input type="file" id="book" name="book">
    </div>
    <button type="submit" class="btn btn-default">提交</button>
</form>

<script src="${request.contextPath}/webjars/jquery/3.3.1-1/jquery.min.js"></script>
<script src="${request.contextPath}/webjars/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${request.contextPath}/webjars/bootstrap-datetimepicker/2.4.2/js/bootstrap-datetimepicker.min.js"></script>/*（重要，这就是日期控件所需的js）*/
<script type="text/javascript" src="${request.contextPath}/webjars/bootstrap-datetimepicker/2.4.2/js/locales/bootstrap-datetimepicker.fr.js"></script>/*（重要，弹出日历里面 显示的文字 bootstrap里面显示的是英文 ，触发后显示的年月日等的显示文字，即为：Jan，feb等等）*/

<script type="text/javascript">
    $(function(){
        $('#startDate').datetimepicker(
                format="yyyy-mm-dd hh:ii:ss"
        );
        $('#updateDate').datetimepicker(
                format="yyyy-mm-dd hh:ii:ss"
        );
    })
</script>
</body>
</html>

