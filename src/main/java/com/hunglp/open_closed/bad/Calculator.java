package com.hunglp.open_closed.bad;

import java.security.InvalidParameterException;


// Ko tối ưu vì : Khi thêm một Operation mới, ví dụ: division, mod, multiplication
// Thì phải định nghĩa thêm Operation, và sửa thêm hàm calculate này
// Vi phạm nguyên tắc: vì mở rộng tính năng nhưng lại update logic code ở class Calculator
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
