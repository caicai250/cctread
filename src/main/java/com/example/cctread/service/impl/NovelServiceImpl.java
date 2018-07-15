package com.example.cctread.service.impl;

import com.example.cctread.dao.CctNovelMapper;
import com.example.cctread.domain.CctNovel;
import com.example.cctread.service.ChapterService;
import com.example.cctread.service.NovelService;
import com.example.cctutil.cos.TencentCOS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
/**
 * @Auther: caic
 * @Date: 2018/6/21 14:28
 * @Description: 书籍操作服务
 * @Version: 1.0
 */
@Service("novelService")
public class NovelServiceImpl implements NovelService {

    @Autowired
    private CctNovelMapper cctNovelMapper;

    @Autowired
    private ChapterService chapterService;

    @Override
    public void saveNovel(CctNovel cctNovel, File file) {
            saveNovel(cctNovel,file);
    }

    @Transactional
    @Override
    public void saveNovel(CctNovel cctNovel,MultipartFile book){
        try {
            cctNovelMapper.saveNovel(cctNovel);
            chapterService.saveChapter(cctNovel.getNovelId(),(FileInputStream) book.getInputStream());
            TencentCOS.putObject((FileInputStream) book.getInputStream(),"/book/"+cctNovel.getNovelId()+"/"+cctNovel.getNovelTitle()+".txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public CctNovel selectNovel(String novelId) {
        if(novelId==null||"".equals(novelId.trim())){
            return null;
        }
        return cctNovelMapper.selectNovel(Integer.parseInt(novelId));
    }

    @Override
    public String getShowdownUrl(String filePath) {
        return TencentCOS.getDownUrl(filePath);
    }
}
