package com.example.cctread.controller;

import com.example.cctread.domain.CctNovel;
import com.example.cctread.domain.Code;
import com.example.cctread.service.CodeService;
import com.example.cctread.service.NovelService;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public String uploadBook(@RequestParam ("book") MultipartFile file, CctNovel cctNovel){
        System.out.println(cctNovel.toString());
        return null;
    }
}
