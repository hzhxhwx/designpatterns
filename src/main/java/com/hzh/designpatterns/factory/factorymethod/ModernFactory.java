package com.hzh.designpatterns.factory.factorymethod;

public class ModernFactory extends AbstractFactory{
    @Override
    Vehicle create() {
        return new Car();
    }
}
