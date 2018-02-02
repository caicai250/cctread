package com.example.cctread.webcontroller;

import com.example.cctutil.TencentCOS;
import com.example.entity.vo.Book;
import freemarker.ext.beans.HashAdapter;
import org.apache.http.HttpResponse;
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
        Map<String, String> map = new HashMap<String, String>();
        map.put("key", "1");
        map.put("value", "中文测试");
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        list.add(map);
        model.addAttribute("listMuen", list);
        model.addAttribute("title", "常春藤阅读");
        String chapterName = "斗破苍穹_天蚕土豆_1";
        String content = TencentCOS.getObject(chapterName);
        Book book = new Book();
        book.setContent(content);
        book.setChapterName("第一章 XXX1");
        book.setNextChapterName("第二章 XXX2");

        model.addAttribute("book", book);
        return "main";//返回的内容就是templetes下面文件的名称
    }
}
