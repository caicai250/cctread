package com.example.cctread.dao;

import com.example.cctread.domain.Code;

import java.util.List;

/**
 * @Auther: caic
 * @Date: 2018/6/12 19:13
 * @Description:
 * @Version: 1.0
 */
public interface CodeMapper {
    List<Code> findCode(String CodeType);
}
