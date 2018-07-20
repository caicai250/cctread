package com.example.cctutil.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: caic
 * @Date: 2018/7/20 16:18
 * @Description: 全局异常处理
 * @Version: 1.0
 */
@RestControllerAdvice
public class CctExceptionHandler {

    @ExceptionHandler (CctException.class)
    @ResponseStatus (HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String, Object> handlerMyException(CctException ex) {
        Map<String,Object> result = new HashMap<>();
        result.put("message", ex.getMessage());
        result.put("error type", "CctException");
        return result;
    }
}
