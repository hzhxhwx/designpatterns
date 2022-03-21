package com.hzh.designpatterns.singleton;

/**
 * @author 86185
 * 饿汉式
 * 类加载就实例化一个对象
 * jvm保证线程安全
 */
public class Singleton_01 {

    private static Singleton_01 singleton_01= new Singleton_01();

    private Singleton_01(){}

    public static Singleton_01 getInstance(){
        return singleton_01;
    }
}
