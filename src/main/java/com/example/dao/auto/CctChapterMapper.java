package com.example.dao.auto;

import com.example.entity.CctChapter;
import com.example.entity.CctChapterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CctChapterMapper {
    int countByExample(CctChapterExample example);

    int deleteByExample(CctChapterExample example);

    int deleteByPrimaryKey(Integer chapterid);

    int insert(CctChapter record);

    int insertSelective(CctChapter record);

    List<CctChapter> selectByExample(CctChapterExample example);

    CctChapter selectByPrimaryKey(Integer chapterid);

    int updateByExampleSelective(@Param("record") CctChapter record, @Param("example") CctChapterExample example);

    int updateByExample(@Param("record") CctChapter record, @Param("example") CctChapterExample example);

    int updateByPrimaryKeySelective(CctChapter record);

    int updateByPrimaryKey(CctChapter record);
}