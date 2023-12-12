package com.itheima.reggie.common;

/*
* 基于threadLocal封装工具类，用户保存和获取当前登录用户id*/
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>(); // 用Long是因为要存id
    public static void setThreadLocal(Long id) {
        threadLocal.set(id);
    }
    public static Long getCurrentId() {
        return threadLocal.get();
    }
}
