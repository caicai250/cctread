package com.example.cctread.controller;

import com.example.cctread.domain.CctNovel;
import com.example.cctread.domain.Code;
import com.example.cctread.service.CodeService;
import com.example.cctread.service.NovelService;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @Auther: caic
 * @Date: 2018/6/28 14:30
 * @Description: 后台管理
 * @Version: 1.0
 */
@Controller
public class AdminController {
    @Autowired
    private NovelService novelService;

    @Autowired
    private CodeService codeService;

    @RequestMapping(value="/uploadbookpage")
    public String openUplaodPage(HttpServletRequest request, ModelMap modelMap) throws IOException, TemplateException {
        List<Code> novelStatus=codeService.findCode("NOVEL_STATE");
        modelMap.addAttribute("novelStatus",novelStatus);
        List<Code> isCharge=codeService.findCode("IS_OR_NOT");
        modelMap.addAttribute("isCharge",isCharge);
        List<Code> bookType=codeService.findCode("BOOKTYPE");
        modelMap.addAttribute("novelType",bookType);
        return "admin/uploadbook";
    }

    @RequestMapping(value="uploadbook",method = RequestMethod.POST)
    @ResponseBody
    public String uploadBook(@RequestParam ("book") MultipartFile book,@RequestParam("novelCover") MultipartFile novelCover, CctNovel cctNovel,BindingResult bindingResult) throws IOException{
        if(novelCover!=null){
            String filePath="D:/novelCoverImg/"+cctNovel.getNovelTitle()+"."+novelCover.getOriginalFilename().split("\\.")[1];
            File coverImg=new File(filePath);
            try {
                if(!coverImg.getParentFile().exists()){
                    coverImg.mkdirs();
                }
                if(!coverImg.exists()){
                    coverImg.createNewFile();
                }
                novelCover.transferTo(coverImg);
                cctNovel.setNovelCover(filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        novelService.saveNovel(cctNovel,book);
        return "上传成功";
    }
}
