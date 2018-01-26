package com.example.cctread.webcontroller;

import com.example.cctutil.TencentCOS;
import com.qcloud.cos.COSClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class TestController {

    @RequestMapping (value = "/hello")
    @ResponseBody
    public String test(){
       // MyBatisUtil.getSqlSession().getConnection();
    //        String sql="select * from code";
    //  List<HashMap> list= SqlQueryUtil.getQueryInfoByManulSQL(sql);
    //        System.out.println(list.toString());
       //COSClient cosclient= TencentCOS.createClient();
       //TencentCOS.uploadFile(cosclient);
       //TencentCOS.downloadFile(cosclient);
       //TencentCOS.closeClient(cosclient);
       return "成功";
    }

   /* @RequestMapping("/main")
    public String index(Map<String, Object> model){
        model.put("name", "adam");
        return "main";//返回的内容就是templetes下面文件的名称
    }*/
}
