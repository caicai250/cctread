<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>${title}</title>
    <link rel="stylesheet" href="${request.contextPath}/webjars/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="${request.contextPath}/css/index.css">
    <link rel="stylesheet" href="${request.contextPath}/css/novelinfo.css">
    <#import  "../macro/nav.ftl" as nav>
</head>
<body>
    <div id="navel-info-container">
        <@nav.commonNav listMuen=listMuen rightButtonList=rightButtonList />
        <#--<@nav.test cctNovel=cctNovel />-->
            <#--<div id="home-container">-->
                <#--<nav class="navbar navbar-default navbar-fixed-top">-->
                    <#--<div class="container">-->
                        <#--<div class="collapse navbar-collapse" id="navbar-collapse">-->
                        <#--&lt;#&ndash;<img class="index-logo" src="${request.contextPath}/image/logo.png" alt="${title}"></a>&ndash;&gt;-->
                            <#--<ul class="nav navbar-nav" style="margin-top:0">-->
                                <#--<li ><a href="">古代言情</a></li>-->
                                <#--<li ><a href="">现代言情</a></li>-->
                                <#--<li ><a href="">玄幻仙侠</a></li>-->
                                <#--<li ><a href="">浪漫青春</a></li>-->
                                <#--<li ><a href="">都市校园</a></li>-->
                                <#--<li ><a href="">悬疑灵异</a></li>-->
                                <#--<li ><a href="">改编频道</a></li>-->
                            <#--</ul>-->
                            <#--<ul class="nav navbar-nav navbar-right">-->
                                <#--<input type="text" placeholder="搜索" class="navbar-input">-->
                                <#--<button class="glyphicon glyphicon-search navbar-button"></button>-->
                                <#--<li><a href="">登录</a> </li>-->
                                <#--<li><a href="">注册</a> </li>-->
                                <#--<li><a href="">我的书架</a> </li>-->
                                <#--<li><a href="">联系客服</a> </li>-->
                            <#--</ul>-->
                        <#--</div>-->
                    <#--</div>-->
                <#--</nav>-->
                <#--<div class="container search-container">-->
                <#--&lt;#&ndash;网站logo&ndash;&gt;-->
                    <#--<a href="#" class="navbar-brand" style="padding:0;"><img class="index-logo" src="${request.contextPath}/image/logo.png" alt="${title}"></a>-->
                    <#--<button type="button" class="btn btn-sm author-button">-->
                        <#--<span class="glyphicon glyphicon-briefcase"></span>作家福利-->
                    <#--</button>-->
                    <#--<button type="button" class="btn btn-sm author-button" style="margin-right: 10px">-->
                        <#--<span class="glyphicon glyphicon-edit"></span>我要当作家-->
                    <#--</button>-->
                <#--&lt;#&ndash;搜索框&ndash;&gt;-->
                    <#--<div class="input-group">-->
                        <#--<input type="text" class="form-control">-->
                        <#--<span class="input-group-addon">-->
                       <#--<button type="button" class="btn btn-default">-->
                            <#--<span class="glyphicon glyphicon glyphicon-search"></span>-->
                        <#--</button>-->
                    <#--</span>-->
                    <#--</div>-->
                <#--</div>-->
            <#--</div>-->

            <div class="container book-profile">
                <dt>
                    <img src="${request.contextPath}/image/ad11.jpg" alt="农女当家：捡个王爷来种田">
                </dt>
                <dd>
                    <div class="title">
                        <h1>农女当家：捡个王爷来种田</h1>
                        <span>文&nbsp;/&nbsp;<a href="/authorcenter/1225616.html" target="_blank">落翘</a></span>
                    </div>
                    <div class="introcontent">
                        <p>穿越成农家女，面对一个穷得叮当响，温饱也只能勉强的家，还有一堆奇葩亲戚时不时的找茬，安黎一脸苦相，这可怎么办？</p>
                        <p>幸好她有《农事宝典》作为金手指，当金手指大开，种瓜得瓜种豆得豆，开酒楼挣钱也不在话下，还能开辟非常多缙国没有的新鲜物种，那小日子也越发的滋润了，让人羡慕不已。</p>
                        <p>幸好她有《农事宝典》作为金手指，当金手指大开，种瓜得瓜种豆得豆，开酒楼挣钱也不在话下，还能开辟非常多缙国没有的新鲜物种，那小日子也越发的滋润了，让人羡慕不已。</p>
                        <p>只是他捡回来的便宜相公越来越撩人了，撩身不说还撩心，这可让她这个从未谈过恋爱的无知少女怎么办？是从还是不从？</p>
                        <p></p>
                    </div>
                    <div class="book-btns">
                        <a class="btn_read" href="">开始阅读</a>
                        <a class="btn_download" href="">书籍下载</a>
                    </div>
                </dd>
            </div>

            <div class="container book-detail-tab box-con">
                <div class="box-hd click-hd">
                    <div class="box-hd click-hd">
                        <h3 id="booklistdetail" class="active">作品介绍</h3>
                        <h3 id="chapterlisttab">章节目录</h3>
                        <a id="commentlisttab" class="link_discuss" href="#discuss-container">评论区</a>
                    </div>
                    <div class="click-bd">
                        <div class="book-detail" id="bookdetail">
                            <div class="profile-main  class="fix"">
                                <div class="book-profile">
                                    <dl class="introcontent">
                                        <dd>
                                            <p>一场别有用心的阴谋，让她误入恶魔的禁地。在三百万的诱惑下，她甘愿当姐姐的替身，盼着时限一到，立马拍拍屁股走人，岂料会被恶魔识破。</p>
                                            <p>生死关头，恶魔开出条件：“想活命可以，帮我生个继承人，对了，我这人习惯货比三家。”</p>
                                            <p>你当下小猪呢？</p>
                                            <p>某女咬咬牙：“试管还是人工。”</p>
                                            <p>“我的习惯是凡事都喜欢——亲——力——亲——为。”</p>
                                            <p>呵，你的习惯还真不少。</p>
                                            <p>陆毅臣，商业界的帝王，亿万少女的梦中情人，外界盛传他清心寡欲，不见女色，唯独对病怏怏的妻子情有独钟，把她宠上了天，却没想到用心疼宠的女子竟然是个冒牌货，花了他的钱，压了他的身，还想拍拍屁股走人，呵呵，她还真是什么都敢想。</p>
                                            <p>【独家专访】</p>
                                            <p>夏树：“请问陆先生，你幸福吗？”</p>
                                            <p>陆毅臣：“夜夜无眠又觉寒，空房独守月余半，悠悠心曲无声泪含，淡淡离殇春梦难圆。你觉得我性福吗？”</p>
                                            <p>夏树咬紧牙根，继续采访：“你缺什么？”</p><p>某陆：“这还用问吗？”</p>
                                            <p>夏树看看旁边几位同事，咬咬牙，维持笑脸：“你的梦想是什么？”</p>
                                            <p>某陆：“我说出来，你敢播吗？”</p><p>夏树：“当然，说吧。”</p>
                                            <p>陆毅臣：“无休无止的爱你，最好辞去工作，什么都不干，每天乖乖躺在床上等着被我爱就行了。”</p>
                                        </dd>
                                    </dl>
                                </div>
                            </div>
                        </div>
                        <div class="catalog" id="catalog">
                            <div id="chapterlist" class="fix">
                                <dl class="catalog-main" id="chapter">
                                    <#--<dt>第一卷</dt>-->
                                    <dd>
                                        <ul class="catalog-list cl">
                                            <li><a href="" target="_blank">第一章  谈一笔不亏的买卖</a></li>
                                            <li><a href="" target="_blank">第二章  我虚汗多</a></li>
                                            <li><a href="" target="_blank">第三章 压死我了</a></li>
                                            <li><a href="" target="_blank">第四章 跟他一起睡</a></li>
                                            <li><a href="" target="_blank">第五章  陆董归来</a></li>
                                            <li><a href="" target="_blank">第六章 主编，我想请假</a></li>
                                            <li><a href="" target="_blank">第七章  有困难找律师</a></li>
                                            <li><a href="" target="_blank">第八章 不是不回来吗</a></li>
                                            <li><a href="" target="_blank">第九章 夏树吃榴莲</a></li>
                                            <li><a href="" target="_blank">第十章  不好惹的人</a></li>
                                            <li><a href="" target="_blank">第十一章  小狗仔，我们又见面了</a></li>
                                            <li><a href="" target="_blank">第十二章  尹少，听我解释</a></li>
                                            <li><a href="" target="_blank">第十三章  薛律师捞人</a></li>
                                            <li><a href="" target="_blank">第十四章 陆毅臣真好糊弄</a></li>
                                            <li><a href="" target="_blank">第十五章  你猜这是什么</a></li>
                                            <li><a href="" target="_blank">第十六章 两强相争</a></li>
                                            <li><a href="" target="_blank">第十七章 陆毅臣的手段</a></li>
                                            <li><a href="" target="_blank">第十八章 又被尹昊司抓住了</a></li>
                                            <li><a href="" target="_blank">十九章  我想吻你，可以吗？</a></li>
                                            <li><a href="" target="_blank">第二十章  如何哄老婆开心</a></li>
                                            <li><a href="" target="_blank">第二十一章 陪我去逛街</a></li>
                                            <li><a href="" target="_blank">第二十二章 陆爷翘班带老婆去逛街</a></li>
                                            <li><a href="" target="_blank">二十三章 牺牲色相</a></li>
                                            <li><a href="" target="_blank">二十四章  一场好戏即将开演</a></li>
                                            <li><a href="" target="_blank">二十五章 怎么会是那个狗仔</a></li>
                                            <li><a href="" target="_blank">二十六章 以后常联系，小狗仔</a></li>
                                            <li><a href="" target="_blank">二十七章 我帮你搞定</a></li>
                                            <li><a href="" target="_blank">第二十八章  尹昊司救人</a></li>
                                            <li><a href="" target="_blank">二十九章  陆毅臣的怀疑</a></li>
                                            <li><a href="" target="_blank">第三十章 我怀疑老婆被人掉包了</a></li>
                                            <li><a href="" target="_blank">三十一章 踢他下床</a></li>
                                            <li><a href="" target="_blank">第三十二章  吃饱了撑的尹昊司</a></li>
                                            <li><a href="" target="_blank">第三十三章 偶像来访</a></li>
                                            <li><a href="" target="_blank">第三十四章  夏树请客</a></li>
                                            <li><a href="" target="_blank">第三十五章  居然是她</a></li>
                                            <li><a href="" target="_blank">三十六章  得罪大人物</a></li>
                                            <li><a href="" target="_blank">第三十七章 被辞退</a></li>
                                            <li><a href="" target="_blank">三十八章  叫她过来上班</a></li>
                                            <li><a href="" target="_blank">三十九章  你父亲要见你</a></li>
                                            <li><a href="" target="_blank">四十章  被算计才娶她</a></li>
                                            <li><a href="" target="_blank">四十一章 失宠了吗？</a></li>
                                            <li><a href="" target="_blank">四十二章 雨夜追逐</a></li>
                                            <li><a href="" target="_blank">四十三章 集体失眠</a></li>
                                            <li><a href="" target="_blank">四十四章 分床睡了</a></li>
                                            <li><a href="" target="_blank">四十五章  背叛我的感觉真有这么棒吗？</a></li>
                                            <li><a href="" target="_blank">四十六章  我去自首</a></li>
                                            <li><a href="" target="_blank">四十七章 自首的路上</a></li>
                                            <li><a href="" target="_blank">四十八章 恩怨</a></li>
                                            <li><a href="" target="_blank">四十九章  带你去参加一个生日宴</a></li>
                                            <li><a href="" target="_blank">五十章  给你一个赚钱的机会</a></li>
                                            <li><a href="" target="_blank">五十一章  一曲探戈</a></li>
                                            <li><a href="" target="_blank">五十二章 再敢乱动试试看（二更）</a></li>
                                            <li><a href="" target="_blank">五十三章  醉酒的涂鸦</a></li>
                                            <li><a href="" target="_blank">五十四章  断送了尹昊司的活路（一更）</a></li>
                                            <li><a href="" target="_blank">五十五章 少奶奶跟以前不一样了（二更）</a></li>
                                            <li><a href="" target="_blank">五十六章  你可以跟我睡</a></li>
                                            <li><a href="" target="_blank"> 五十七章  来采访我</a></li>
                                            <li><a href="" target="_blank">五十八章 姐姐的初恋</a></li>
                                            <li><a href="" target="_blank">五十九章  倒霉的一天</a></li>
                                            <li><a href="" target="_blank">六十章 一场盛世烟火</a></li>
                                            <li><a href="" target="_blank">六十一章  粗暴的吻</a></li>
                                            <li><a href="" target="_blank">六十二章  出任务被羞辱</a></li>
                                            <li><a href="" target="_blank">六十三章 恶整姚璐</a></li>
                                            <li><a href="" target="_blank">六十四章 吵架可以，分床不行</a></li>
                                            <li><a href="" target="_blank">六十五章  在床上要温柔一点</a></li>
                                            <li><a href="" target="_blank">六十六章  尹大少的倔强</a></li>
                                            <li><a href="" target="_blank">六十七章 医院碰见熟人</a></li>
                                            <li><a href="" target="_blank">六十八章  陆毅臣居然带个女人回去</a></li>
                                            <li><a href="" target="_blank">六十九章 这个女人是我的</a></li>
                                            <li><a href="" target="_blank">七十章  链子是丢了还是卖了</a></li>
                                            <li><a href="" target="_blank">七十一章 惩罚说谎</a></li>
                                            <li><a href="" target="_blank">七十二章 冷战</a></li>
                                            <li><a href="" target="_blank">七十三章 别打</a></li>
                                            <li><a href="" target="_blank">七十四章  打一巴掌给颗糖</a></li>
                                            <li><a href="" target="_blank">七十五章  被王敏发现了秘密</a></li>
                                            <li><a href="" target="_blank">七十六章 事情败露</a></li>
                                            <li><a href="" target="_blank">七十七章  她被欺负了</a></li>
                                            <li><a href="" target="_blank">七十八章 为你赎身</a></li>
                                            <li><a href="" target="_blank">七十九章 原来我在你心里是这种人</a></li>
                                            <li><a href="" target="_blank">八十章  无耻的尹昊司</a></li>
                                            <li><a href="" target="_blank">八十一章  浴缸里学游泳</a></li>
                                            <li><a href="" target="_blank">八十二章  心怀不轨的王敏</a></li>
                                            <li><a href="" target="_blank">八十三章  带走王敏</a></li>
                                            <li><a href="" target="_blank">八十四章  别这么霸道好吗</a></li>
                                            <li><a href="" target="_blank">八十五章  我不会骑电动车</a></li>
                                            <li><a href="" target="_blank">八十六章  陆少去捞人</a></li>
                                            <li><a href="" target="_blank">八十七章  不公平的待遇</a></li>
                                        </ul>
                                    </dd>
                                </dl>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

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

