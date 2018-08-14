<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
</head>
<body>

<#--阅读界面设置，可以选择颜色，字体大小-->
 <#macro readset>
     <div class="container read-tit-container">
         <div class="read_tit">
             <div class="btn">
                 <ul>
                     <li><a href="">章节目录</a></li>
                     <li><a href="">上一章</a></li>
                     <li><a href="">下一章</a></li>
                 </ul>
             </div>
             <div class="setting">
                 <div class="fontColor color-mode">
                     <strong>选择背景颜色：</strong>
                     <span class="mode_yellow current" data-value="theme_yellow" onClick="changeThemeColor('theme_yellow')"></span>
                     <span class="mode_orange" data-value="theme_orange" onClick="changeThemeColor('theme_orange')"></span>
                     <span class="mode_green" data-value="theme_green" onClick="changeThemeColor('theme_green')"></span>
                     <span class="mode_blue" data-value="theme_blue" onClick="changeThemeColor('theme_blue')"></span>
                     <span class="mode_pink" data-value="theme_pink" onClick="changeThemeColor('theme_pink')"></span>
                     <span class="mode_gray" data-value="theme_gray" onClick="changeThemeColor('theme_gray')"></span>
                     <span class="mode_black" data-value="theme_black" onClick="changeThemeColor('theme_black')"></span>
                 </div>
                 <div class="fontSize">
                     <strong>选择字号：</strong>
                     <span lang="24px" onClick="changeThemeFontSize('24px')">特大</span>
                     <span lang="18px" onClick="changeThemeFontSize('18px')">大</span>
                     <span lang="16px" onClick="changeThemeFontSize('16px')">中</span>
                     <span lang="14px" onClick="changeThemeFontSize('14px')">小</span>
                 </div>
             </div>
         </div>
     </div>
 </#macro>

<#--阅读界面-->
<#macro readcontent>
     <div class="container read-content-container">
         <div class="chapter-read">
             <h1 class="chapter-title">第1章   全军覆没</h1>
             <div class="chapter-main" id="auto-chapter" >
                 世上安得两全法，不负如来不负卿
             </div>
         </div>

         <ul class="container chapter-control cl">
             <li class="chapter-prev defalt"><a href=""><em>上一章</em></a></li>

             <li class="chapter-next"><a href=""><em>下一章</em></a></li>
         </ul>
     </div>
</#macro>

</body>
</html>
