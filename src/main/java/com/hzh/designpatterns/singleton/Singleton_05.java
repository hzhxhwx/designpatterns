package com.hzh.designpatterns.singleton;

/**
 * 缩小锁的范围,还是有线程安全问题
 */
public class Singleton_05 {
        private static Singleton_05 INSTANCE;

        private Singleton_05(){

        }

        public  static Singleton_05 getInstance(){
            if (INSTANCE == null){
                synchronized(Singleton_05.class){
                    INSTANCE = new com.hzh.designpatterns.singleton.Singleton_05();
                }
            }
            return INSTANCE;
        }
    }

