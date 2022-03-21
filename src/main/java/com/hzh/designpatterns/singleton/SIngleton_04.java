package com.hzh.designpatterns.singleton;

/**
 * @author 86185
 * 03的改进版,在方法上加锁,效率比较低
 */
public class SIngleton_04 {
    private static SIngleton_04 INSTANCE;

    private SIngleton_04(){

    }

    public synchronized static SIngleton_04 getInstance(){
        if (INSTANCE == null){
            INSTANCE = new SIngleton_04();
        }
        return INSTANCE;
    }
}
