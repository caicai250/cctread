package com.example.cctread.webcontroller;

import com.example.cctutil.SqlQueryUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
public class TestController {
    @RequestMapping (value = "/hello")
    @ResponseBody
    public String test(){
        String sql="select * from code";
        List<HashMap> list= SqlQueryUtil.getQueryInfoByManulSQL(sql);
        System.out.println(list.toString());
        return list.toString();
    }
}
