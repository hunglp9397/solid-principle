package com.hunglp.open_closed.good;

import lombok.Data;

@Data
public class Subtraction implements CalculatorOperation {

    private double left;
    private double right;
    private double result;

    @Override
    public void perform() {
        result = left - right;
    }
}
