package com.example.cctread.dao;

import com.example.cctread.domain.CctChapter;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: caic
 * @Date: 2018/6/21 11:58
 * @Description: 书籍章节表操作
 * @Version: 1.0
 */
public interface CctChapterMapper {
    void saveChapter(List<CctChapter> chapterList);
    List<CctChapter> selectChapterList(@Param("novelId") int novelId, @Param("start") int start, @Param("limit") int limit);
    CctChapter getChapter(int chapterId);
    CctChapter getFirstChapter(int novelId);
}
