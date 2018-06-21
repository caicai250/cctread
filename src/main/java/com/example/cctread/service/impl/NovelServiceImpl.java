package com.example.cctread.service.impl;

import com.example.cctread.dao.CctChapterMapper;
import com.example.cctread.dao.CctNovelMapper;
import com.example.cctread.service.NovelService;
import com.example.entity.CctChapter;
import com.example.entity.CctNovel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    /**
     * 保存书籍信息
     * @param cctNovel
     */
    @Override
    public void saveNovel(CctNovel cctNovel) {

    }
}
