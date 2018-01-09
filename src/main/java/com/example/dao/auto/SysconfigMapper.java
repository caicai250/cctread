package com.example.dao.auto;

import com.example.entity.Sysconfig;
import com.example.entity.SysconfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysconfigMapper {
    int countByExample(SysconfigExample example);

    int deleteByExample(SysconfigExample example);

    int insert(Sysconfig record);

    int insertSelective(Sysconfig record);

    List<Sysconfig> selectByExample(SysconfigExample example);

    int updateByExampleSelective(@Param("record") Sysconfig record, @Param("example") SysconfigExample example);

    int updateByExample(@Param("record") Sysconfig record, @Param("example") SysconfigExample example);
}