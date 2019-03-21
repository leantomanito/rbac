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

import com.rbac.exception.CustomException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zyj
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController
@Slf4j
public class TestControl {

    @RequestMapping("page.page")
    public void test(){
        throw new CustomException("就是想发生点异常");
    }
}
