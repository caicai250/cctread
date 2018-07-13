package com.example.cctread.service;


import com.example.cctread.domain.CctNovel;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;

/**
 * @Auther: caic
 * @Date: 2018/6/21 14:26
 * @Description: 书籍操作服务
 * @Version: 1.0
 */
public interface NovelService {
    /***
     * 通过文件方式上传书籍
     * @param cctNovel 书籍信息
     * @param file 书籍文件
     */
    void saveNovel(CctNovel cctNovel, File file);

    /**
     * 通过文件流的方式上传文件
     * @param cctNovel 书籍信息
     * @param book 书籍文件输入流
     */
    void saveNovel(CctNovel cctNovel, MultipartFile book);

    /**
     * 查询书籍信息
     * @param novelId
     * @return
     */
    CctNovel selectNovel(String novelId);
}
