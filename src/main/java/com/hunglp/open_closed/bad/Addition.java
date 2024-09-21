package com.hunglp.open_closed.bad;

import lombok.Data;

@Data
public class Addition implements CalculatorOperation_Bad{
    private double left;
    private double right;
    private double result = 0.0;

    public Addition(double left, double right){
        this.left = left;
        this.right = right;
    }
}
