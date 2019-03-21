package com.example.bosclient.controller;

import java.util.HashMap;

public class ResposeData extends HashMap<String, Object> {

    private static final Integer error = 500;
    private static final Integer success = 200;

    public ResposeData() {
        put("status", success);
        put("data", "操作成功");
    }


    public static ResposeData error(Object obj) {
        ResposeData data = new ResposeData();
        data.put("status", error);
        data.put("data", obj);
        return data;
    }

    public static ResposeData success(Object obj) {
        ResposeData data = new ResposeData();
        data.put("status", success);
        data.put("data", obj);
        return data;
    }

    public static ResposeData success() {
        return new ResposeData();
    }


    @Override
    public Object put(String key, Object value) {
        return super.put(key, value);
    }
}
