package com.example.cctread.service;

import java.io.File;
import java.io.FileInputStream;

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
     * @param novelId
     * @param file 书籍文件
     */
    void saveChapter(int novelId, File file);
}
