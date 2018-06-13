package com.example.cctread.serviece;

import com.example.cctread.domain.Code;

import java.util.List;

/**
 * @Auther: caic
 * @Date: 2018/6/12 19:27
 * @Description:
 * @Version: 1.0
 */
public interface CodeService {
    public List<Code> findCode(String codeType);
}
