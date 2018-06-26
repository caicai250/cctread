package com.example.cctread.service.impl;

import com.example.cctread.dao.CctNovelMapper;
import com.example.cctread.domain.CctNovel;
import com.example.cctread.service.ChapterService;
import com.example.cctread.service.NovelService;
import com.example.cctutil.cos.TencentCOS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
    CctNovelMapper cctNovelMapper;

    @Autowired
    ChapterService chapterService;

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
        cctNovelMapper.saveNovel(cctNovel);
        TencentCOS.putObject(fileInputStream,"/book/"+cctNovel.getNovelId()+"/"+cctNovel.getNovelTitle()+".txt");
        chapterService.saveChapter(cctNovel.getNovelId(),fileInputStream);
    }
}
