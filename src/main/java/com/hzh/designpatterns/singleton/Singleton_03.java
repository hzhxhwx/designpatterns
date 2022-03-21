package com.hzh.designpatterns.singleton;

/**
 * 懒汉式,需要用到的时候才加载,有线程不安全问题
 *
 * @author 86185
 */
public class Singleton_03 {

    private static Singleton_03 INSTANCE;

    private Singleton_03() {
    }

    public static Singleton_03 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton_03();
        }
        return INSTANCE;
    }
}
