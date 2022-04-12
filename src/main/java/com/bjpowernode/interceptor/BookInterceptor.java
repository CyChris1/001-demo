package com.bjpowernode.interceptor;

import com.bjpowernode.controller.BookController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class BookInterceptor implements HandlerInterceptor {

//    @Resource
//    private BookController bookController;

    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        log.info("输入的url不正确，请重新输入");
        return false;
    }

    //添加拦截器对象，注入到容器中


}
