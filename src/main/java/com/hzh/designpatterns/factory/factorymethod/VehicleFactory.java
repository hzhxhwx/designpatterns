package com.hzh.designpatterns.factory.factorymethod;

public class VehicleFactory {
    public Car createCar(){
        return  new Car();
    }
}
