package com.example.dao.auto;

import com.example.entity.CctUser;
import com.example.entity.CctUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CctUserMapper {
    int countByExample(CctUserExample example);

    int deleteByExample(CctUserExample example);

    int deleteByPrimaryKey(String userid);

    int insert(CctUser record);

    int insertSelective(CctUser record);

    List<CctUser> selectByExample(CctUserExample example);

    CctUser selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") CctUser record, @Param("example") CctUserExample example);

    int updateByExample(@Param("record") CctUser record, @Param("example") CctUserExample example);

    int updateByPrimaryKeySelective(CctUser record);

    int updateByPrimaryKey(CctUser record);
}