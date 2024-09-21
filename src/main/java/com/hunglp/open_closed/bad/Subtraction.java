package com.hunglp.open_closed.bad;

import lombok.Data;

@Data
public class Subtraction {
    private double left;
    private double right;
    private double result = 0.0;

    public Subtraction(double left, double right) {
        this.left = left;
        this.right = right;
    }

}
