package com.example.cctread.controller;

import com.example.cctread.domain.CctNovel;
import com.example.cctread.service.NovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: caic
 * @Date: 2018/7/12 15:01
 * @Description: 书籍controller
 * @Version: 1.0
 */
@Controller
public class NovelController {

    @Autowired
    NovelService novelService;

    @RequestMapping ( value = "/tonovelpage" )
    public String toNovelPage(ModelMap model, @RequestParam ( value = "novelId" ) String novelId) {
        CctNovel cctNovel= novelService.selectNovel(novelId);
        return "novelpage/novelinfo";
    }
}
