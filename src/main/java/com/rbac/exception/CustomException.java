/*
 * Copyright (c) 2008-2016 浩瀚深度 All Rights Reserved.
 *
 * FileName: CustomException.java
 *
 * Description：
 *
 * History:
 * v1.0.0, zyj, 2019年03月21日, Create
 */
package com.rbac.exception;

import lombok.Getter;

/**
 * @author zyj
 * @version 1.0.0
 * @since 1.0.0
 */
@Getter
public class CustomException extends RuntimeException {
    private String errorMsg;
    public CustomException() {
        super();
    }

    public CustomException(String message) {
        super(message);
        this.errorMsg = message;
    }
}
