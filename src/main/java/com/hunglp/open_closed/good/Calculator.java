package com.hunglp.open_closed.good;

import java.security.InvalidParameterException;



public class Calculator {
    public void calculate(CalculatorOperation operation){
        if(operation == null){
            throw new InvalidParameterException("Invalid Operation. Can not calculate!");
        }
        operation.perform();
    }
}
