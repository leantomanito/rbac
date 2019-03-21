/*
 * Copyright (c) 2008-2016 浩瀚深度 All Rights Reserved.
 *
 * FileName: JsonData.java
 *
 * Description：
 *
 * History:
 * v1.0.0, zyj, 2019年03月21日, Create
 */
package com.rbac.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zyj
 * @version 1.0.0
 * @since 1.0.0
 */
@Setter
@Getter
@ToString
public class JsonData {
    private boolean ret;
    private String msg;
    private Object data;

    private JsonData(Object data, String msg) {
        this.ret = true;
        this.msg = msg;
        this.data = data;
    }

    private JsonData(Object data) {
        this.data = data;
    }

    private JsonData(String msg) {
        this.msg = msg;
    }

    private JsonData() {
    }

    public static JsonData success(Object data) {
        JsonData jsonData = new JsonData(data);
        jsonData.ret = true;
        return jsonData;
    }

    public static JsonData success(Object data, String msg) {
        JsonData jsonData = new JsonData(data, msg);
        jsonData.ret = true;
        return jsonData;
    }

    public static JsonData error(String msg) {
        JsonData jsonData = new JsonData(msg);
        jsonData.ret = false;
        return jsonData;
    }

    public static Map buildMap(String msg) {
        if (msg != null && msg.isEmpty()) {
            msg = "";
        }
        Map<String, Object> map = new HashMap<>();
        map.put("ret", false);
        map.put("msg", msg);
        return map;
    }
}
