/*
 * Copyright (c) 2008-2016 浩瀚深度 All Rights Reserved.
 *
 * FileName: TestControl.java
 *
 * Description：
 *
 * History:
 * v1.0.0, zyj, 2019年03月20日, Create
 */
package com.rbac.control;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zyj
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController
@RequestMapping("test1xx")
@Slf4j
public class TestControl {

    @RequestMapping("tesxxt")
    public String test(){
        return "hello";
    }
}
