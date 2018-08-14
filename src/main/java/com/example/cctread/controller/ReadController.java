package com.example.cctread.controller;

import com.example.cctread.domain.CctNovel;
import com.example.cctread.service.NovelService;
import com.example.cctread.service.CodeService;
import com.example.cctutil.exception.CctException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.*;

/**
 * @Auther: caic
 * @Date: 2018/7/12 15:01
 * @Description: 书籍controller
 * @Version: 1.0
 */
@Controller
public class ReadController {

    @Autowired
    NovelService novelService;

    @Autowired
    private CodeService codeService;

    /**
     * 跳转到章节页面，查询当前书籍信息
     * @param model
     * @param novelId
     * @return
     */
    @RequestMapping ( value = "/toreadpage" )
    public String toReadPage(ModelMap model, @RequestParam ( value = "novelId" ) String novelId) {
        CctNovel cctNovel= novelService.selectNovel(novelId);
        if(cctNovel==null){
            throw new CctException("没有查询到当前书籍，请联系管理员");
        }
        //下面是书籍的一些信息获取，你可以参考一下。后台都做好了，如果有异常，我再看看。
        String novel_title=cctNovel.getNovelTitle();//书籍名称
        String intro=cctNovel.getIntro();//书籍简介
        String author = cctNovel.getAuthor();//书籍作者
        String novel_cover=cctNovel.getNovelCover();
        //固定栏右侧按钮
        List rightButtonList = getRightButtonList();
        model.addAttribute("listMuen", codeService.findCode("BOOKTYPE"));
        model.addAttribute("rightButtonList", rightButtonList);
        return "readpage/readpageinfo";
    }

    public List<Map<String,String>> getRightButtonList() {
        List<Map<String,String>> getRightButtonList = new ArrayList<>();
        ArrayList  arrMenu = new ArrayList();
        arrMenu.add("登录");
        arrMenu.add("注册");
        arrMenu.add("我的书架");
        arrMenu.add("联系客服");
        for(int i=0; i<arrMenu.size(); i++) {
            Map<String, String> map = new HashMap<>();
            map.put("value",arrMenu.get(i).toString());
            getRightButtonList.add(map);
        }
        return getRightButtonList;
    }
}
