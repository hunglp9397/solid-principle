package com.hunglp.open_closed.good;

import java.security.InvalidParameterException;


// Đã đảm bảo nguyên tắc
// Mở rộng chức năng : Division
// Mà không làm thay đổi logic của Class Calculator
public class Calculator {
    public void calculate(CalculatorOperation operation){
        if(operation == null){
            throw new InvalidParameterException("Invalid Operation. Can not calculate!");
        }
        operation.perform();
    }
}
