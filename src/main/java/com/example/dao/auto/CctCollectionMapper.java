package com.example.dao.auto;

import com.example.entity.CctCollection;
import com.example.entity.CctCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CctCollectionMapper {
    int countByExample(CctCollectionExample example);

    int deleteByExample(CctCollectionExample example);

    int deleteByPrimaryKey(Integer collectionid);

    int insert(CctCollection record);

    int insertSelective(CctCollection record);

    List<CctCollection> selectByExample(CctCollectionExample example);

    CctCollection selectByPrimaryKey(Integer collectionid);

    int updateByExampleSelective(@Param("record") CctCollection record, @Param("example") CctCollectionExample example);

    int updateByExample(@Param("record") CctCollection record, @Param("example") CctCollectionExample example);

    int updateByPrimaryKeySelective(CctCollection record);

    int updateByPrimaryKey(CctCollection record);
}