package com.example.cctread.service.impl;

import com.example.cctread.dao.CctChapterMapper;
import com.example.cctread.dao.CctNovelMapper;
import com.example.cctread.service.NovelService;
import com.example.cctutil.exception.CctException;
import com.example.entity.CctChapter;
import com.example.entity.CctNovel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Auther: caic
 * @Date: 2018/6/21 14:28
 * @Description: 书籍操作服务
 * @Version: 1.0
 */
@Service("novelService")
public class NovelServiceImpl implements NovelService {

    @Autowired
    CctChapterMapper cctChapterMapper;

    @Autowired
    CctNovelMapper cctNovelMapper;

    @Override
    public void saveNovel(CctNovel cctNovel, File file) {
        try {
            saveNovel(cctNovel,new FileInputStream(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Transactional
    @Override
    public void saveNovel(CctNovel cctNovel, FileInputStream fileInputStream) {
        LineNumberReader reader = null;
        InputStreamReader isr = null;
        //BufferedWriter bufferedWriter = null;
        try {
            long timeStart = System.currentTimeMillis();
//            File file = new File("D:/dpcq_jjb.txt");//文件路径
//            fileInputStream = new FileInputStream(file);
            if(fileInputStream==null){
                throw new CctException("程序异常,传入文件为空");
            }
            byte[] b = new byte[3];
            fileInputStream.read(b);


            if (b[0] == -17 && b[1] == -69 && b[2] == -65) {//编码为UTF-8，linux环境默认编码是UTF-8
                isr = new InputStreamReader(fileInputStream);
            } else {//编码可能为GBK，windows环境默认编码是GBK
                isr = new InputStreamReader(fileInputStream, "GBK");
            }
            reader = new LineNumberReader(isr);
            String txt="";//文本内容
            String chapterName="";//章节名
            Pattern r = Pattern.compile("第.*章\\s*.*\\s*");
            //bufferedWriter=new BufferedWriter(new FileWriter(new File("D:/test/前言.txt"),true));
            StringBuilder stringBuilder=new StringBuilder();
            while(txt!=null){
                Matcher m = r.matcher(txt.trim());
                if(m.matches()){
                    chapterName=m.group(0);
                    //bufferedWriter.close();
                    //bufferedWriter=new BufferedWriter(new FileWriter(new File("D:/test/"+chapterName+".txt"),true));
                    stringBuilder.setLength(0);
                }
                //bufferedWriter.write(txt+"\n");
                stringBuilder.append(txt+"\n");
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
                if (isr != null) {
                    isr.close();
                }
//                if(bufferedWriter!=null){
//                    bufferedWriter.close();
//                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
