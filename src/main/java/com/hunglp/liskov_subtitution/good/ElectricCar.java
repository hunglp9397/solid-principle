package com.hunglp.liskov_subtitution.good;

public class ElectricCar extends AbstractCar{
    @Override
    public void start() {
        System.out.println("Khởi động pin!");
    }
}
