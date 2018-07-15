package com.example.cctread;

import java.nio.charset.Charset;
import java.util.Properties;

/**
 * @Auther: caic
 * @Date: 2018/7/15 00:26
 * @Description:
 * @Version: 1.0
 */
public class OSName {
    public static void main(String[] args){
        Properties props = System.getProperties();
        System.out.println(props.getProperty("os.name"));
        System.out.println(props.getProperty("file.encoding"));
        System.out.println(Charset.defaultCharset());
        System.out.println("一个汉字"+"我".getBytes().length+"个字节");
    }
}
