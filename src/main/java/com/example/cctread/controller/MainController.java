package com.example.cctread.controller;

import com.example.cctread.service.CodeService;
import com.example.cctutil.cos.TencentCOS;
import com.example.cctutil.sysutil.SysUtil;
import com.example.entity.vo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    @Autowired
    private CodeService codeService;

    @RequestMapping(value = "/main")
    public String index(ModelMap model,HttpServletRequest request) {
        //固定栏右侧按钮
        List rightButtonList = SysUtil.getRightButtonList();
        //头条列表
        List tilteMenu = getTitleMenu();
        //现代言情列表
        List modernRomanceList = getModernRomanceList();
        //收藏榜
        List collectionList = getCollectList();
        //编辑强推
        List editorRecommendList = getEditorRecommendList();
        //主轮播图
        List mainCarouselList = getMainCarouselList();
        //分类好文
        List classifyArticleList = getClassifyArticleList();
        model.addAttribute("listMuen", codeService.findCode("BOOKTYPE"));
        model.addAttribute("rightButtonList", rightButtonList);
        model.addAttribute("titleMenu", tilteMenu);
        model.addAttribute("modernRomanceList", modernRomanceList);
        model.addAttribute("collectionList", collectionList);
        model.addAttribute("editorRecommendList", editorRecommendList);
        model.addAttribute("mainCarouselList", mainCarouselList);
        model.addAttribute("classifyArticleList", classifyArticleList);


        String chapterName = "斗破苍穹_天蚕土豆_1";
        String content = TencentCOS.getObject(chapterName);

        Book book = new Book();
        book.setContent(content);
        book.setChapterName("第一章 XXX1");
        book.setNextChapterName("第2章 XXX2");


        model.addAttribute("book", book);
        return "index/main";//返回的内容就是templetes下面文件的名称
    }

    public List<Map<String,String>> getTitleMenu() {
        List<Map<String,String>> titleMenu = new ArrayList<>();
        ArrayList  arrMenu = new ArrayList();
        arrMenu.add("1.世上安得两全法，不负如来不负卿");
        arrMenu.add("2.反省凡心损梵行，从来如此莫聪明");
        arrMenu.add("3.既生苦难我西行，何生红颜你倾城");
        arrMenu.add("4.如何抹去你身影，如同忘却我姓名");
        arrMenu.add("5.说什么王权富贵，怕什么戒律清规");
        arrMenu.add("6.心恋我百转千回，快带我远走高飞");
        for(int i=0; i<arrMenu.size(); i++) {
            Map<String, String> map = new HashMap<>();
            map.put("key","" + i);
            map.put("value",arrMenu.get(i).toString());
            titleMenu.add(map);
        }
        return titleMenu;
    }

    public List<Map<String,String>> getModernRomanceList() {
        List<Map<String,String>> modernRomanceList = new ArrayList<>();
        ArrayList  arrMenu = new ArrayList();
        arrMenu.add("暖宠之国民妖精怀里来");
        arrMenu.add("娱乐圈之贵后来袭");
        arrMenu.add("妻约婚色之赖上俏前妻");
        arrMenu.add("皇后驾到之盛宠豪门");
        arrMenu.add("墨少，您的萌妻好甜");
        arrMenu.add("豪门主母");
        arrMenu.add("重生之王者归来");
        arrMenu.add("枕上暖婚");
        arrMenu.add("暖宠之国民妖精怀里来");
        arrMenu.add("娱乐圈之贵后来袭");
        arrMenu.add("妻约婚色之赖上俏前妻");
        int size = arrMenu.size();
        for(int i=0; i<size; i++) {
            Map<String, String> map = new HashMap<>();
            String key = "" + i;
            String value = arrMenu.get(i).toString();
            map.put("key",key);
            map.put("value",value);
            modernRomanceList.add(map);
        }
        return modernRomanceList;
    }

    public List<Map<String,String>> getCollectList() {
        List<Map<String,String>> collectionList = new ArrayList<>();
        ArrayList  arrMenu = new ArrayList();
        arrMenu.add("军爷压榨：赚钱能手小萌妻");
        arrMenu.add("婚后追妻：顾少，求放过");
        arrMenu.add("重生之嫡女裳华");
        arrMenu.add("顾小姐，余生请多关照");
        arrMenu.add("一生一世笑皇途");
        arrMenu.add("天降萌妻：宫爷揽入怀");
        arrMenu.add("第一宠婚：军爷的头号新妻");
        arrMenu.add("权倾天下之将门冷后");
        arrMenu.add("名门隐婚：枭爷娇宠妻");
        arrMenu.add("前妻归来：邵医生好久不见");
        int size = arrMenu.size();
        for(int i=0; i<size; i++) {
            Map<String, String> map = new HashMap<>();
            String key = "" + i;
            String value = arrMenu.get(i).toString();
            String count= "" + (size-i)*100;
            String author= "作者"+ (i+1);
            map.put("key",key);
            map.put("value",value);
            map.put("count",count);
            map.put("author",author);
            collectionList.add(map);
        }
        return collectionList;
    }

    public List<Map<String,String>> getEditorRecommendList() {
        List<Map<String,String>> editorRecommendList = new ArrayList<>();
        ArrayList  imgArr = new ArrayList();
        ArrayList  titleArr = new ArrayList();
        ArrayList  detailArr = new ArrayList();
        imgArr.add("/image/ad5.jpg");
        imgArr.add("/image/ad6.jpg");
        imgArr.add("/image/ad7.jpg");
        titleArr.add("女人不狠，地位不稳");
        titleArr.add("重生之锦绣农门");
        titleArr.add("闲散王爷的农门妻");
        detailArr.add("【一部女王崛起史，复仇，商战，职场】四年前，风靡全城的沈家千金，陆氏少夫人锒铛入狱。身为丈夫的他不仅不闻不问，还让律师送来了离婚协议和孩子的抚养协议。留下一句：“从一开始，我爱的就不是你。”出狱后，面对周...");
        detailArr.add("近代绣娘----顾绣嫡传门下第九代弟子----顾明月在硝烟纷飞的战火中重返前世。前世的顾明月有一个幸福的家庭，性格憨厚的武力爆表爹，丰神俊朗的姐控弟，持家有道的温柔娘。前世的顾明月却没有珍惜，一份永远不可...");
        detailArr.add("她是一个从21世纪穿越而来的孤儿冷心冷情的她却被几个爱她如命的家人渐渐捂热抛开前世的冰冷，从此用命去守护爱她的人兴家，立业，保护娘亲，照顾姐弟，收拾极品，异世也过的风生水起他是皇室不起眼的皇子从小冷眼看着...");
        int size = titleArr.size();
        for(int i=0; i<size; i++) {
            Map<String, String> map = new HashMap<>();
            String imgSrc = imgArr.get(i).toString();
            String title = titleArr.get(i).toString();
            String detail = detailArr.get(i).toString();
            map.put("imgSrc",imgSrc);
            map.put("title",title);
            map.put("detail",detail);
            editorRecommendList.add(map);
        }
        return editorRecommendList;
    }

    public List<Map<String,String>> getMainCarouselList() {
        List<Map<String,String>> mainCarouselList = new ArrayList<>();
        for(int i=0; i<5; i++) {
            Map<String, String> map = new HashMap<>();
            String imgSrc = "/image/zly" + (i+1) + ".jpg";
            map.put("imgSrc",imgSrc);
            mainCarouselList.add(map);
        }
        return mainCarouselList;
    }
    public List<Map<String,String>> getClassifyArticleList() {
        List<Map<String,String>> classifyArticleList = new ArrayList<>();
        for(int i=0; i<6; i++) {
            Map<String, String> map = new HashMap<>();
            String classify = "玄幻";
            String article = "前途莫测剑问道:万道争锋";
            map.put("classify",classify);
            map.put("article",article);
            classifyArticleList.add(map);
        }
        return classifyArticleList;
    }
}
