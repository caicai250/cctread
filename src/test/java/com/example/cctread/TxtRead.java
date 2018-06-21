package com.example.cctread;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @Auther: caic
 * @Date: 2018/6/20 09:35
 * @Description:
 * @Version: 1.0
 */
public class TxtRead {
    public static void main(String[] args) {
//       System.out.println( System.getProperty("file.encoding"));
//        System.out.println(Charset.defaultCharset());
        LineNumberReader reader = null;
        InputStreamReader isr = null;
        FileReader fileReader = null;
        FileInputStream fileInputStream = null;
        try {
            long timeStart = System.currentTimeMillis();
            File file = new File("D:/dpcq_jjb.txt");//文件路径

            fileInputStream = new FileInputStream(file);
            byte[] b = new byte[3];
            fileInputStream.read(b);


            if (b[0] == -17 && b[1] == -69 && b[2] == -65) {//编码为UTF-8，linux环境默认编码是UTF-8
                fileReader = new FileReader(file);
                reader = new LineNumberReader(fileReader);
            } else {//编码可能为GBK，windows环境默认编码是GBK
                isr = new InputStreamReader(new FileInputStream(file), "GBK");
                reader = new LineNumberReader(isr);
            }
            int startNumber = 80000;//设置指定行数
            int endNumber = 80010;//设置指定行数
            StringBuilder txt = new StringBuilder();
            for(int i=1;i<endNumber;i++){
                if(i<startNumber){
                    reader.readLine();
                }else{
                    txt.append(reader.readLine());
                }
            }
            long time2=System.currentTimeMillis();
            System.out.println("总耗时："+(time2-timeStart)+"ms,内容是：" + txt + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
                if (isr != null) {
                    isr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
