package com.example.cctread.dao;

import com.example.cctread.domain.CctNovel;

/**
 * @Auther: caic
 * @Date: 2018/6/21 11:54
 * @Description: 书籍主表操作
 * @Version: 1.0
 */
public interface CctNovelMapper {
    void saveNovel(CctNovel cctNovel);
    CctNovel selectNovel(int novelId);
}
