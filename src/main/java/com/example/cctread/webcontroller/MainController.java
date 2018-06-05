package com.example.cctread.webcontroller;

import com.example.cctutil.cos.TencentCOS;
import com.example.entity.vo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.datatype.DatatypeConfigurationException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    @RequestMapping(value = "/main")
    public String index(ModelMap model) {
        //书籍类型
        List listMenu = getListMenu();
        //头条列表
        List tilteMenu = getTitleMenu();
        //现代言情列表
        List modernRomanceList = getModernRomanceList();
        model.addAttribute("listMuen", listMenu);
        model.addAttribute("titleMenu", tilteMenu);
        model.addAttribute("modernRomanceList", modernRomanceList);
        model.addAttribute("title", "常春藤阅读");


        String chapterName = "斗破苍穹_天蚕土豆_1";
        String content = TencentCOS.getObject(chapterName);

        Book book = new Book();
        book.setContent(content);
        book.setChapterName("第一章 XXX1");
        book.setNextChapterName("第2章 XXX2");


        model.addAttribute("book", book);
        return "main";//返回的内容就是templetes下面文件的名称
    }

    public List<Map<String,String>> getListMenu() {
        List<Map<String,String>> listMenu = new ArrayList<>();
        ArrayList  arrMenu = new ArrayList();
        arrMenu.add("古代言情");
        arrMenu.add("现代言情");
        arrMenu.add("玄幻仙侠");
        arrMenu.add("浪漫青春");
        arrMenu.add("悬疑灵异");
        arrMenu.add("改编频道");
        int size = arrMenu.size();
        for(int i=0; i<size; i++) {
            Map<String, String> map = new HashMap<>();
            String key = "" + i;
            String value = arrMenu.get(i).toString();
            map.put("key",key);
            map.put("value",value);
            listMenu.add(map);
        }
        return listMenu;
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
        int size = arrMenu.size();
        for(int i=0; i<size; i++) {
            Map<String, String> map = new HashMap<>();
            String key = "" + i;
            String value = arrMenu.get(i).toString();
            map.put("key",key);
            map.put("value",value);
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
}
