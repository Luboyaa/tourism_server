package com.spring.exception;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.spring.controller.BaseController;

import javax.xml.transform.Result;


/**
 * 全局异常处理器
 */


@RestControllerAdvice
public class GlobalExceptionHandler extends BaseController{

    @ExceptionHandler(Exception.class)
    public String ex(Exception ex){
        ex.printStackTrace();
        return showError("对不起，操作失败");
    }
}
