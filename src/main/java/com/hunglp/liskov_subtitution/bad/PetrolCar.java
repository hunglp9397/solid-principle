package com.hunglp.liskov_subtitution.bad;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PetrolCar implements Car{

    private Engine engine;

    @Override
    public void turnOnEngine() {
        engine.powerOn();
    }
}
