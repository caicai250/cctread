package com.example.cctread.controller;

import com.example.cctread.domain.CctNovel;
import com.example.cctread.service.NovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

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

    /**
     * 跳转到章节页面，查询当前书籍信息
     * @param model
     * @param novelId
     * @return
     */
    @RequestMapping ( value = "/tonovelpage" )
    @ResponseBody
    public String toNovelPage(ModelMap model, @RequestParam ( value = "novelId" ) String novelId) {
        CctNovel cctNovel= novelService.selectNovel(novelId);
        String downUrl=novelService.getShowdownUrl("/book/"+cctNovel.getNovelId()+"/"+cctNovel.getNovelTitle()+".txt");
        System.out.println(downUrl);
        return cctNovel.toString();
    }

    /**
     * 获取小说封面
     * @param imgPath
     * @param response
     */
    @RequestMapping ( value = "/getNovelCover" )
    @ResponseBody
    public void getNovelCover(@RequestParam(value="imgPath") String imgPath,HttpServletResponse response){
        InputStream input = null;
        OutputStream out = null;
        try {
            out = response.getOutputStream();
            input=new FileInputStream(new File(imgPath));
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
