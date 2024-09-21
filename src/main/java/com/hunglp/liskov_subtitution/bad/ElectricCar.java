package com.hunglp.liskov_subtitution.bad;

public class ElectricCar implements Car{
    @Override
    public void turnOnEngine() {
        throw new AssertionError("Turn On Engine fail!. Electric car not have an engine!!");
    }
}
