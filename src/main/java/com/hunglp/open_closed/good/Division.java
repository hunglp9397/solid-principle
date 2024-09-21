package com.hunglp.open_closed.good;

import lombok.Data;

@Data
public class Division implements CalculatorOperation{
    private double left;
    private double right;
    private double result;

    @Override
    public void perform() {
        if (right != 0) {
            result = left / right;
        }
    }
}
