package com.example.cctread.service.impl;

import com.example.cctread.dao.CodeMapper;
import com.example.cctread.domain.Code;
import com.example.cctread.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: caic
 * @Date: 2018/6/12 19:29
 * @Description:
 * @Version: 1.0
 */
@Service ( value = "codeService" )
public class CodeServiceImpl implements CodeService {

    @Autowired
    private CodeMapper codeMapper;

    @Override
    public List <Code> findCode(String codeType) {
        return codeMapper.findCode(codeType);
    }
}
