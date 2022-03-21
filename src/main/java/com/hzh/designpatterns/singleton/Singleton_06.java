package com.hzh.designpatterns.singleton;

/**
 * @author 86185
 * 双重检查,避免线程安全问题
 */
public class Singleton_06 {

    private static volatile Singleton_06 INSTANCE;

    private Singleton_06() {

    }

    public static Singleton_06 getInstance() {
        //双重检查
        if (INSTANCE == null) {
            synchronized (Singleton_06.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton_06();
                }
            }

        }
        return INSTANCE;
    }
}

