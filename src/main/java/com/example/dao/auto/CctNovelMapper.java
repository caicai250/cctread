package com.example.dao.auto;

import com.example.entity.CctNovel;
import com.example.entity.CctNovelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CctNovelMapper {
    int countByExample(CctNovelExample example);

    int deleteByExample(CctNovelExample example);

    int deleteByPrimaryKey(Integer novelid);

    int insert(CctNovel record);

    int insertSelective(CctNovel record);

    List<CctNovel> selectByExampleWithBLOBs(CctNovelExample example);

    List<CctNovel> selectByExample(CctNovelExample example);

    CctNovel selectByPrimaryKey(Integer novelid);

    int updateByExampleSelective(@Param("record") CctNovel record, @Param("example") CctNovelExample example);

    int updateByExampleWithBLOBs(@Param("record") CctNovel record, @Param("example") CctNovelExample example);

    int updateByExample(@Param("record") CctNovel record, @Param("example") CctNovelExample example);

    int updateByPrimaryKeySelective(CctNovel record);

    int updateByPrimaryKeyWithBLOBs(CctNovel record);

    int updateByPrimaryKey(CctNovel record);
}