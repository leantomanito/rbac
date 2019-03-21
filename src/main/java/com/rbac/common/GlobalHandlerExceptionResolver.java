/*
 * Copyright (c) 2008-2016 浩瀚深度 All Rights Reserved.
 *
 * FileName: GlobalHandlerExceptionResolver.java
 *
 * Description：
 *
 * History:
 * v1.0.0, zyj, 2019年03月21日, Create
 */
package com.rbac.common;

import com.rbac.exception.CustomException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author zyj
 * @version 1.0.0
 * @since 1.0.0
 */
@Slf4j
public class GlobalHandlerExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        String url = httpServletRequest.getRequestURL().toString();
        String errmsg = "系统出现异常";
        ModelAndView modelAndView = new ModelAndView();
        if(url.endsWith(".json")){
            if(e instanceof CustomException){
                errmsg = e.getMessage();
                modelAndView.setViewName("jsonView");
            }
            log.error("json error msg :" + errmsg, e);
        }else if(url.endsWith(".page")){
            modelAndView.setViewName("exception");
            log.error("page error msg :" + errmsg, e);
        }else{
            modelAndView.setViewName("jsonView");
            log.error("system error msg :" + errmsg, e);
        }
        modelAndView.getModelMap().addAllAttributes(JsonData.buildMap(errmsg));
        return modelAndView;
    }
}
