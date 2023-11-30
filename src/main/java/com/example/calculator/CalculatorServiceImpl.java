package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public int addTwoNumbers(int num1, int num2) {

        int result = num1 + num2;
        return  result;
    }

    @Override
    public int subtractTwoNumbers(int num1, int num2) {

        int result = num1 - num2;
        return  result;

    }

    @Override
    public int multiplyTwoNumbers(int num1, int num2) {

        int result = num1 * num2;
        return  result;

    }

    @Override
    public float divideTwoNumbers(int num1, int num2) {

        float result = (float) num1 / num2;
        return  result;

    }

}