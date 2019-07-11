package com.example.demo;

import org.springframework.http.HttpRequest;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 使用controllerAdvice 统一拦截错误
@ControllerAdvice
public class NiceExceptionHandler {
    // 使用ExceptionHandler 来设置响应
    @ExceptionHandler(value=Exception.class)
    public Object errorHandler(HttpServletRequest request, HttpServletResponse response, Exception e) throws Exception{
        e.printStackTrace();
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", request.getRequestURL());
        mav.setViewName("thymeleaf/my_error");
        return mav;
    }
}
