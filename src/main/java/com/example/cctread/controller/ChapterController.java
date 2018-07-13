package com.example.cctread.controller;

import com.example.cctread.domain.CctChapter;
import com.example.cctread.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: caic
 * @Date: 2018/7/13 15:31
 * @Description: 章节controller
 * @Version: 1.0
 */
@Controller
public class ChapterController {
    @Autowired
    ChapterService chapterService;

    @RequestMapping(value="/getchapterlist")
    @ResponseBody
    public String selectChapterList(ModelMap model, @RequestParam ( value = "novelId" ) String novelId, @RequestParam ( value = "novelId" ) String start, @RequestParam ( value = "novelId" ) String limit) {
        List<CctChapter> list=chapterService.selectChapter(Integer.parseInt(novelId),Integer.parseInt(start),Integer.parseInt(limit));
        return null;
    }
}
