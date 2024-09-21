package com.hunglp.open_closed.bad;

import java.security.InvalidParameterException;



public class Calculator {
    public void calculate(CalculatorOperation_Bad operation){
        if (operation == null) {
            throw new InvalidParameterException("Operation invalid. Can not calculate!");
        }
        if (operation instanceof Addition) {
            Addition addition = (Addition) operation;
            addition.setResult(addition.getLeft() + addition.getRight());
        } else if (operation instanceof Subtraction) {
            Subtraction subtraction = (Subtraction) operation;
            subtraction.setResult(subtraction.getLeft() - subtraction.getRight());
        }
    }
}
