package com.example.demo;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

// 使用RestControllerAdvice 来统一拦截 api服务异常
@RestControllerAdvice
public class ApiExceptionHandler {
    // 使用ExceptionHandler 来指定执行的方法
    @ExceptionHandler(value=Exception.class)
    public Object errorHandler(HttpServletRequest req, Exception e) {
        HashMap map = new HashMap();
        HashMap data = new HashMap();

        e.printStackTrace();
        map.put("code", 1);
        map.put("data", data);
        map.put("msg", "failed");

        return map;
    }
}
