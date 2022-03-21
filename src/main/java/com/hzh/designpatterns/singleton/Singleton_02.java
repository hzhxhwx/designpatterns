package com.hzh.designpatterns.singleton;

/**
 * 与1一致
 */
public class Singleton_02 {
    private static Singleton_02 singleton_02;
    static {
         singleton_02 = new Singleton_02();
    }

    private Singleton_02(){

    }

    public static Singleton_02 getInstance(){
        return singleton_02;
    }
}
