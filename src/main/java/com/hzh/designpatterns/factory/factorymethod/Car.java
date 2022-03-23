package com.hzh.designpatterns.factory.factorymethod;

public class Car extends Vehicle implements Moveable  {
    @Override
    public void go() {
        System.out.println("runing");
    }
}
