package com.hzh.designpatterns.factory.factorymethod;

public class CarFactory {
    public Moveable create(){
        return new Car();
    }
}
