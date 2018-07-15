package com.example.cctread.service;

import com.example.cctread.domain.CctChapter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

/**
 * @Auther: caic
 * @Date: 2018/6/26 11:45
 * @Description:
 * @Version: 1.0
 */
public interface ChapterService {
    /**
     * 保存章节信息
     * @param novelId
     * @param fileInputStream 书籍文件流
     */
    void saveChapter(int novelId, FileInputStream fileInputStream);

    /**
     * 保存章节信息
     * @param novelId   书籍id
     * @param file 书籍文件
     */
    void saveChapter(int novelId, File file) throws FileNotFoundException;

    /**
     * 查询章节列表
     * @param novelId   书籍id
     * @param start 页数
     * @param limit 每页记录数
     * @return
     */
    List<CctChapter> selectChapter(int novelId, int start, int limit);

    /**
     * 获取章节信息
     * @param chapterId
     * @return
     */
    CctChapter getChapter(int chapterId);

    /**
     * 获取章节文本，如果章节id为空，则取书籍id的第一章
     * @param novelId 书籍id
     * @param chapterId 章节id
     * @return
     */
    String getChapterTXT(String novelId, String chapterId);

    /**
     * 获取书籍的第一章信息
     * @param novelId
     * @return
     */
    CctChapter getFirstChapter(int novelId);

    /**
     * 获取文件输入流
     * @param novelId
     * @param chapterId
     * @return
     */
    InputStream getChapterInputStream(String novelId, String chapterId);
}
