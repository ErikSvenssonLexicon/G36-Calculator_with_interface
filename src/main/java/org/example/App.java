package org.example;

import org.example.models.Calculator;
import org.example.models.CalculatorImpl;


public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator = new CalculatorImpl();
        boolean calculating = true;
        while(calculating){
            System.out.println("Do you want to calculate? (y/n)");
            String answer = Calculator.getString();
            if("n".equalsIgnoreCase(answer)){
                calculating = false;
            }else {
                System.out.println("Enter a number: ");
                double number = Calculator.getDouble();
                System.out.println("Enter another number: ");
                double number2 = Calculator.getDouble();
                System.out.println("Enter operator (+ - * /) ");
                String operator = Calculator.getString();
                try{
                    double result = calculator.calculate(number, number2, operator);
                    System.out.println(number + " " + operator + " " + number2 + " = " +result);
                }catch (IllegalArgumentException ex){
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}
