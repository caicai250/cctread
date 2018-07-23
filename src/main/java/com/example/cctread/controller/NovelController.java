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
public class NovelController {

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
    @RequestMapping ( value = "/tonovelpage" )
    public String toNovelPage(ModelMap model, @RequestParam ( value = "novelId" ) String novelId) {
        CctNovel cctNovel= novelService.selectNovel(novelId);
        if(cctNovel==null){
            throw new CctException("没有查询到当前书籍，请联系管理员");
        }
        //下面是书籍的一些信息获取，你可以参考一下。后台都做好了，如果有异常，我再看看。
        String novel_title=cctNovel.getNovelTitle();//书籍名称
        String intro=cctNovel.getIntro();//书籍简介
        String author = cctNovel.getAuthor();//书籍作者
        String url=novelService.getShutdownUrl("/book/"+cctNovel.getNovelId()+"/"+cctNovel.getNovelTitle()+".txt");//书籍下载url
        Date start_date=cctNovel.getStartDate();//书籍开始时间
        Date end_date=cctNovel.getUpdateDate();//书籍最后更新时间
        int book_like=cctNovel.getBookLike();//书籍点赞数量
        String novel_type=cctNovel.getNovelType();//书籍分类
        String novel_cover=cctNovel.getNovelCover();

        String downloadUrl=novelService.getShutdownUrl("/book/"+cctNovel.getNovelId()+"/"+cctNovel.getNovelTitle()+".txt");
        System.out.println(downloadUrl);
        //固定栏右侧按钮
        List rightButtonList = getRightButtonList();
        model.addAttribute("listMuen", codeService.findCode("BOOKTYPE"));
        model.addAttribute("rightButtonList", rightButtonList);
        model.addAttribute("novelTitle", novel_title);
        model.addAttribute("bookIntro", intro);
        model.addAttribute("author", author);
        model.addAttribute("novelCover",novel_cover );
        model.addAttribute("downloadUrl",downloadUrl );
        return "novelpage/novelinfo";
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
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (input != null) input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
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
