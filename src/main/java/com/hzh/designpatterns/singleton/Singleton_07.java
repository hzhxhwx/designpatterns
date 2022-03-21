package com.hzh.designpatterns.singleton;

/**
 * 静态内部类的方式,jvm保证线程安全,初始化外部类的时候,不会初始化内部类,实现懒加载
 */
public class Singleton_07 {

    private Singleton_07(){

    }

    static class Inner{
        private static final Singleton_07 instance = new Singleton_07();
    }

    public static Singleton_07 getInstance(){
        return Inner.instance;
    }
}
