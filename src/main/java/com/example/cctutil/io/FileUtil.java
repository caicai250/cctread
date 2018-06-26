package com.example.cctutil.io;

import com.example.cctutil.exception.CctException;

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
     * 校验文件编码是否UTF-8
     * @param file
     * @return
     */
    public static boolean checkCode(File file){
        try {
            return checkCode(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new CctException("程序异常,传入文件为空");
        }
    }

    /**
     * 校验文件编码是否UTF-8
     * @param fileInputStream
     * @return
     */
    public static boolean checkCode(FileInputStream fileInputStream){
        if(fileInputStream==null){
            throw new CctException("程序异常,传入文件为空");
        }
        byte[] b = new byte[3];
        try {
            fileInputStream.read(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (b[0] == -17 && b[1] == -69 && b[2] == -65) {//编码为UTF-8，linux环境默认编码是UTF-8
            return true;
        } else {//编码可能为GBK，windows环境默认编码是GBK
            return false;
        }
    }

//    /**
//     * 读取书籍指定某行到某行
//     *
//     * @param bookpath    书籍文件路径
//     * @param startNumber 开始行号
//     * @param endNumber   结束行号
//     * @return String
//     */
//    public static String readBood(String bookpath, int startNumber, int endNumber) {
//        LineNumberReader reader = null;
//        InputStreamReader isr = null;
//        FileReader fileReader = null;
//        FileInputStream fileInputStream = null;
//        StringBuilder txt = new StringBuilder();
//        try {
//            File file = new File(bookpath);//文件路径
//            fileInputStream = new FileInputStream(file);
//            byte[] b = new byte[3];
//            fileInputStream.read(b);
//            if (b[0] == -17 && b[1] == -69 && b[2] == -65) {//编码为UTF-8，linux环境默认编码是UTF-8
//                fileReader = new FileReader(file);
//                reader = new LineNumberReader(fileReader);
//            } else {//编码可能为GBK，windows环境默认编码是GBK
//                isr = new InputStreamReader(new FileInputStream(file), "GBK");
//                reader = new LineNumberReader(isr);
//            }
//            for (int i = 1; i <= endNumber; i++) {
//                if (i < startNumber) {
//                    reader.readLine();
//                } else {
//                    txt.append(reader.readLine());
//                }
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (reader != null) {
//                    reader.close();
//                }
//                if (fileInputStream != null) {
//                    fileInputStream.close();
//                }
//                if (fileReader != null) {
//                    fileReader.close();
//                }
//                if (isr != null) {
//                    isr.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        return txt.toString();
//    }




    public static void main(String[] args) {


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
