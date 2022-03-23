package com.hzh.designpatterns.factory.factorymethod;

public class Main {
    public static void main(String[] args) {
        AbstractFactory f = new ModernFactory();
        Vehicle c = f.create();
        c.go();
    }
}
