package com.example.cctread.controller;

import com.example.cctread.domain.CctChapter;
import com.example.cctread.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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

    /**
     * 获取章节列表，分页查询
     * @param model
     * @param novelId
     * @param start
     * @param limit
     * @return
     */
    @RequestMapping(value="/getchapterlist")
    @ResponseBody
    public Object selectChapterList(ModelMap model, @RequestParam ( value = "novelId" ) String novelId, @RequestParam ( value = "start" ) String start, @RequestParam ( value = "limit" ) String limit) {
        List<CctChapter> list=chapterService.selectChapter(Integer.parseInt(novelId),Integer.parseInt(start),Integer.parseInt(limit));
        return list;
    }

    /**
     * 获取章节文本内容，若没有章节id，则取书籍id的第一章。
     * @param model
     * @param chapterId
     * @param novelId
     * @return
     */
    @RequestMapping(value="getChapterTXT")
    @ResponseBody
    public void getChapterTXT(ModelMap model, @RequestParam (value="chapterId",required=false) String chapterId, @RequestParam(value="novelId",required=false) String novelId, HttpServletResponse response) {
//        return chapterService.getChapterTXT(novelId,chapterId);
        InputStream input = null;
        OutputStream out = null;
        try {
            out = response.getOutputStream();
            input = chapterService.getChapterInputStream(novelId, chapterId);
            byte[] b = new byte[1024];
            int len = 0;
            while ((len = input.read(b)) != -1) {
                out.write(b, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) out.close();
                if (input != null) input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
