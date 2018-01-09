package com.example.dao.auto;

import com.example.entity.CctUserlog;
import com.example.entity.CctUserlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CctUserlogMapper {
    int countByExample(CctUserlogExample example);

    int deleteByExample(CctUserlogExample example);

    int insert(CctUserlog record);

    int insertSelective(CctUserlog record);

    List<CctUserlog> selectByExample(CctUserlogExample example);

    int updateByExampleSelective(@Param("record") CctUserlog record, @Param("example") CctUserlogExample example);

    int updateByExample(@Param("record") CctUserlog record, @Param("example") CctUserlogExample example);
}