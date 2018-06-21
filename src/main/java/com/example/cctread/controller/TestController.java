package com.example.cctread.controller;

import com.example.cctread.domain.Code;
import com.example.cctread.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    private CodeService codeService;

    @RequestMapping (value = "/hello")
    @ResponseBody
    public String test(){
        List<Code> list=codeService.findCode("BOOKTYPE");
       // MyBatisUtil.getSqlSession().getConnection();
    //        String sql="select * from code";
    //  List<HashMap> list= SqlQueryUtil.getQueryInfoByManulSQL(sql);
    //        System.out.println(list.toString());
       //COSClient cosclient= TencentCOS.createClient();
       //TencentCOS.uploadFile(cosclient);
       //TencentCOS.downloadFile(cosclient);
       //TencentCOS.closeClient(cosclient);
       return list.toString();
    }

   /* @RequestMapping("/main")
    public String index(Map<String, Object> model){
        model.put("name", "adam");
        return "main";//返回的内容就是templetes下面文件的名称
    }*/
}
