package com.example.cctread.service.impl;

import com.example.cctread.dao.CctChapterMapper;
import com.example.cctread.domain.CctChapter;
import com.example.cctread.service.ChapterService;
import com.example.cctutil.cos.TencentCOS;
import com.example.cctutil.io.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Auther: caic
 * @Date: 2018/6/26 11:48
 * @Description: 章节服务
 * @Version: 1.0
 */
@Service("chapterService")
public class ChapterServiceImpl implements ChapterService {

    @Autowired
    CctChapterMapper cctChapterMapper;

    @Transactional
    @Override
    public void saveChapter(int novelId, FileInputStream fileInputStream) {
        LineNumberReader reader = null;
        InputStreamReader isr = null;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            long timeStart = System.currentTimeMillis();

            if (FileUtil.checkCode(fileInputStream)) {//编码为UTF-8，linux环境默认编码是UTF-8
                isr = new InputStreamReader(fileInputStream);
            } else {//编码可能为GBK，windows环境默认编码是GBK
                isr = new InputStreamReader(fileInputStream, "GBK");
            }
            reader = new LineNumberReader(isr);
            String txt="";//文本行内容
            String chapterName="前言";//章节名
            Pattern r = Pattern.compile("第.*章\\s*.*\\s*");
            StringBuilder chapterTxt=new StringBuilder();//章节内容
            int row=0;//行号
            String chapterPath="/book/"+novelId+"/chapter/前言.txt";//章节路径:/book/书籍id/chapter/章节名称.txt
            List<CctChapter> chapterList=new ArrayList<CctChapter>();
            while(txt!=null){
                Matcher m = r.matcher(txt.trim());
                if(m.matches()){
                    CctChapter cctChapter=new CctChapter();
                    cctChapter.setNovelId(novelId);
                    cctChapter.setChapterName(chapterName);
                    try {
                        cctChapter.setUpdateDate(formatter.parse(formatter.format(new Date())));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    cctChapter.setChapterPath(chapterPath);
                    cctChapter.setStartRow(row);
                    cctChapter.setEndRow(reader.getLineNumber());
                    chapterList.add(cctChapter);
                    row=reader.getLineNumber()+1;
                    TencentCOS.putObject(chapterTxt.toString(),chapterPath);
                    chapterName=m.group(0);
                    chapterPath="/book/"+novelId+"/chapter/"+chapterName+".txt";
                    chapterTxt.setLength(0);
                }
                chapterTxt.append(txt+"\n");
                txt=reader.readLine();
            }
            TencentCOS.putObject(chapterTxt.toString(),"/book/"+novelId+"/chapter/"+chapterName+".txt");
            cctChapterMapper.saveChapter(chapterList);
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
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void saveChapter(int novelId, File file) {

    }
}
