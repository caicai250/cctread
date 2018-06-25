package com.example.cctutil.io;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Auther: caic
 * @Date: 2018/6/20 16:03
 * @Description: 文件操作辅助类
 * @Version: 1.0
 */
public class FileUtil {
    /**
     * 读取书籍指定某行到某行
     *
     * @param bookpath    书籍文件路径
     * @param startNumber 开始行号
     * @param endNumber   结束行号
     * @return String
     */
    public static String readBood(String bookpath, int startNumber, int endNumber) {
        LineNumberReader reader = null;
        InputStreamReader isr = null;
        FileReader fileReader = null;
        FileInputStream fileInputStream = null;
        StringBuilder txt = new StringBuilder();
        try {
            File file = new File(bookpath);//文件路径
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
            for (int i = 1; i <= endNumber; i++) {
                if (i < startNumber) {
                    reader.readLine();
                } else {
                    txt.append(reader.readLine());
                }
            }

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
        return txt.toString();
    }


    public static void cut(){
        LineNumberReader reader = null;
        InputStreamReader isr = null;
        FileReader fileReader = null;
        BufferedWriter bufferedWriter = null;
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
            //int startNumber = 80000;//设置指定行数
            //int endNumber = 80010;//设置指定行数
//            StringBuilder txt = new StringBuilder();
//            for(int i=1;i<endNumber;i++){
//                if(i<startNumber){
//                    reader.readLine();
//                }else{
//                    txt.append(reader.readLine());
//                }
//
//            }
            String txt="";//文本内容
            String chapterName="";//章节名
            Pattern r = Pattern.compile("第.*章\\s*.*\\s*");
            bufferedWriter=new BufferedWriter(new FileWriter(new File("D:/test/前言.txt"),true));
            while(txt!=null){
                Matcher m = r.matcher(txt.trim());
                if(m.matches()){
                    chapterName=m.group(0);
                    bufferedWriter.close();
                    bufferedWriter=new BufferedWriter(new FileWriter(new File("D:/test/"+chapterName+".txt"),true));
                }
                bufferedWriter.write(txt);
                txt=reader.readLine();
            }
            long time2=System.currentTimeMillis();
            System.out.println("总耗时："+(time2-timeStart)+"ms");
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
                if(bufferedWriter!=null){
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        cut();
//        String str = "　　第一千一百六十五章 升灵";
//        String pattern = "第.*章\\s*.*\\s*";
//
//        Pattern r = Pattern.compile(pattern);
//        Matcher m = r.matcher(str.trim());
//        System.out.println(m.matches());
//        BufferedWriter bufferedWriter=null;
//        try {
//            bufferedWriter=new BufferedWriter(new FileWriter(new File("D:/test/0.txt"),true));
//            for(int i=0;i<10;i++){
//                bufferedWriter.close();
//                bufferedWriter=new BufferedWriter(new FileWriter(new File("D:/test/"+i+".txt"),true));
//                bufferedWriter.write("sjaldjsakljdlfskajflkdsjalfdsjalfjsdalkdfjlsadkjfldsjfladskjflasdjdslkjkldsfjaldsjflas");
//
//            }
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                bufferedWriter.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        //String text = readBood("D:/dpcq_jjb.txt", 6, 7);
       // System.out.println(text);
    }
}
