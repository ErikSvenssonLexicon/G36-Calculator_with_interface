package org.example.models;

public class CalculatorImpl implements Calculator{
    @Override
    public double addition(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double division(double num1, double num2) {
        if(num2 == 0) return 0;
        return num1 / num2;
    }
}
