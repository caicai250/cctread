package com.example.cctread.controller;

import com.example.cctutil.cos.TencentCOS;
import com.example.entity.vo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    @RequestMapping(value = "/main")
    public String index(ModelMap model) {
        List listMenu = getListMenu();
        model.addAttribute("listMuen", listMenu);
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
}
