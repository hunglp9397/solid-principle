package com.hunglp.liskov_subtitution.good;

import lombok.Data;

@Data
public class PetrolCar extends AbstractCar{

    private Engine engine;

    @Override
    public void start() {
        engine.powerOn();
    }
}
