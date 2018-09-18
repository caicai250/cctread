<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
</head>
<body>
    <#--书籍封面/简介/操作按钮-->
   <#macro novelInfoData novelTitle author bookIntro downloadUrl>
       <div class="container book-profile">
           <dt>
               <img src="${request.contextPath}/image/ad11.jpg" alt="${novelTitle}">
                <#--<img src="${novelCover} alt="${novelTitle}">-->
           </dt>
           <dd>
               <div class="title">
                   <h1>${novelTitle}</h1>
                   <span>文&nbsp;/&nbsp;<a href="" target="_blank">${author}</a></span>
               </div>
               <div class="introcontent">
                   ${bookIntro}
               </div>
               <div class="book-btns">
                   <a class="btn_read" href="">开始阅读</a>
                   <a class="btn_download" href="${downloadUrl}">书籍下载</a>
               </div>
           </dd>
       </div>
   </#macro>

    <#--展示书籍详细信息  --两个tab页、一个锚链接-->
    <#macro novelDetailTab chapterCount>
        <div class="box-hd click-hd">
            <h3 id="booklistdetail" class="active">作品介绍</h3>
            <h3 id="chapterlisttab">章节目录(总${chapterCount}章节数)</h3>
            <a id="commentlisttab" class="link_discuss" href="#discuss-container">评论区</a>
        </div>
    </#macro>

    <#--展示书籍信息层-->
    <#macro  novelDetailShow bookIntro chapterList>
        <#--书籍详细简介-->
        <div class="click-bd">
            <div class="book-detail" id="bookdetail">
                <div class="profile-main"  class="fix">
                <div class="book-profile">
                    <dl class="introcontent">
                        <dd>
                            ${bookIntro}
                        </dd>
                    </dl>
                </div>
            </div>
        </div>
        <#--书籍章节目录  --暂时使用假数据-->
        <div class="catalog" id="catalog">
                <div id="chapterlist" class="fix">
                    <dl class="catalog-main" id="chapter">
                    <#--<dt>第一卷</dt>-->
                        <dd>
                            <ul class="catalog-list cl" id="chapterList">
                                <#list chapterList as em>
                                    <li><a href='javascript:alert(${em.chapterId})'>${em.chapterName}</a></li>
                                </#list>
                            </ul>
                        </dd>
                    </dl>
                </div>
            </div>
        </div>
    </#macro>

    <#--作品讨论区 --暂时使用假数据-->
    <#macro novelDiscuss>
        <div class="container discuss-content" id="discuss-container">
            <h3 class="profile-main-title">作品讨论区
                <span class="reviewtotal">（188条）</span>
            </h3>
            <div class="tab-bd">
                <div class="bd-main" id="reviewTab1" style="display: block;">
                    <ul class="discuss_list" id="reviewContent1">
                        <li id="total" data-value="188">
                            <div class="user">
                                <img src="${request.contextPath}/image/ad12.jpg" class="pic">
                            </div>
                            <div class="discuss_info">
                                <dl class="reader-reply">
                                    <dt>
                                        <span class="username">heise四叶草</span>
                                        <span class="userlevel">书童</span>
                                        <span class="sub-right">[2小时前]
                        第&nbsp;1&nbsp;楼</span>
                                    </dt>
                                    <dd>小树苗走吧去一个没人认识她的地方</dd>
                                </dl>
                            </div>
                        </li>
                        <li>
                            <div class="user">
                                <img src="${request.contextPath}/image/ad12.jpg" class="pic">
                            </div>
                            <div class="discuss_info">
                                <dl class="reader-reply">
                                    <dt>
                                        <span class="username">heise四叶草</span>
                                        <span class="userlevel">书童</span>
                                        <span class="sub-right">[昨天19:41]
                        第&nbsp;2&nbsp;楼</span>
                                    </dt>
                                    <dd>你这个短小君</dd>
                                </dl>
                            </div>
                        </li>
                        <li>
                            <div class="user">
                                <img src="${request.contextPath}/image/ad12.jpg" class="pic">
                            </div>
                            <div class="discuss_info">
                                <dl class="reader-reply">
                                    <dt>
                                        <span class="username">123456789苏苏</span>
                                        <span class="userlevel">书童</span>
                                        <span class="sub-right">[前天18:40]
                        第&nbsp;3&nbsp;楼</span>
                                    </dt>
                                    <dd>不喜欢看现在改的，原来的好看。这个写得天花乱坠太幼稚了</dd>
                                </dl>
                            </div>
                        </li>
                        <li>
                            <div class="user">
                                <img src="${request.contextPath}/image/ad12.jpg" class="pic">
                            </div>
                            <div class="discuss_info">
                                <dl class="reader-reply">
                                    <dt>
                                        <span class="username">123456789苏苏</span>
                                        <span class="userlevel">书童</span>
                                        <span class="sub-right">[前天18:34]
                        第&nbsp;4&nbsp;楼</span>
                                    </dt>
                                    <dd>写得有点没有头绪</dd>
                                </dl>
                            </div>
                        </li>
                        <li>
                            <div class="user">
                                <img src="${request.contextPath}/image/ad12.jpg" class="pic">
                            </div>
                            <div class="discuss_info">
                                <dl class="reader-reply">
                                    <dt>
                                        <span class="username">136*****915</span>
                                        <span class="userlevel">书童</span>
                                        <span class="sub-right">[前天16:56]
                        第&nbsp;5&nbsp;楼</span>
                                    </dt>
                                    <dd>太慢了，太慢了</dd>
                                </dl>
                            </div>
                        </li>
                        <li>
                            <div class="user">
                                <img src="${request.contextPath}/image/ad12.jpg" class="pic">
                            </div>
                            <div class="discuss_info">
                                <dl class="reader-reply">
                                    <dt>
                                        <span class="username">heise四叶草</span>
                                        <span class="userlevel">书童</span>
                                        <span class="sub-right">[前天09:10]
                        第&nbsp;6&nbsp;楼</span>
                                    </dt>
                                    <dd>你怎么还不更</dd>
                                </dl>
                            </div>
                        </li>
                        <li>
                            <div class="user">
                                <img src="${request.contextPath}/image/ad12.jpg" class="pic">
                            </div>
                            <div class="discuss_info">
                                <dl class="reader-reply">
                                    <dt>
                                        <span class="username">WeiXindf8dd9b5e8</span>
                                        <span class="userlevel">书童</span>
                                        <span class="sub-right">[07-18 17:18]
                        第&nbsp;7&nbsp;楼</span>
                                    </dt>
                                    <dd>我很期待陆毅辰发现小树之后的时候的剧情发展</dd>
                                </dl>
                            </div>
                        </li>
                        <li>
                            <div class="user">
                                <img src="${request.contextPath}/image/ad12.jpg" class="pic">
                            </div>
                            <div class="discuss_info">
                                <dl class="reader-reply">
                                    <dt>
                                        <span class="username">heise四叶草</span>
                                        <span class="userlevel">书童</span${request.contextPath}/image/ad12.jpg
                        第&nbsp;8&nbsp;楼</span>
                                    </dt>
                                    <dd>作者大大，你知道为什么评论少了吗？因为你是短小君啊！</dd>
                                </dl>
                            </div>
                        </li>
                        <li>
                            <div class="user">
                                <img src="${request.contextPath}/image/ad12.jpg" class="pic">
                            </div>
                            <div class="discuss_info">
                                <dl class="reader-reply">
                                    <dt>
                                        <span class="username">152*****528</span>
                                        <span class="userlevel">书童</span>
                                        <span class="sub-right">[07-16 18:24]
                        第&nbsp;9&nbsp;楼</span>
                                    </dt>
                                    <dd>唉，男主智商暂时不在线啊～～什么时候上轨道啊，这前铺也差不多了～该上主菜了。</dd>
                                </dl>
                            </div>
                        </li>
                        <li>
                            <div class="user">
                                <img src="${request.contextPath}/image/ad12.jpg" class="pic">
                            </div>
                            <div class="discuss_info">
                                <dl class="reader-reply">
                                    <dt>
                                        <span class="username">熙式丶涵涵</span>
                                        <span class="userlevel">书童</span>
                                        <span class="sub-right">[07-16 10:42]
                        第&nbsp;10&nbsp;楼</span>
                                    </dt>
                                    <dd>怎么还在修改中啊</dd>
                                </dl>
                                <dl class="author-reply">
                                    <dt class="tit">作者回复：</dt>
                                    <dd>　　我已经改掉了，很快就能看到了。</dd>
                                </dl>
                            </div>
                        </li>

                    </ul>
                    <a href="javascript:;" class="load-more" id="reviewGetMore1">更多<i class="iconfont"></i></a>
                </div>
            </div>

        </div>
    </#macro>
    <#macro test cctNovel>
        ${cctNovel}
    </#macro>
</body>
</html>
