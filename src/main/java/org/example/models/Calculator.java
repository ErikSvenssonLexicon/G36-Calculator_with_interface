package org.example.models;

import java.util.Scanner;

public interface Calculator {
    /*
        1. Define the calculation methods - DONE
        2. Define a scanner - DONE
        3. Define static methods to take input - DONE
        4. Make a default method called calculate - DONE
        5. Implement! - DONE
     */

    Scanner SCANNER = new Scanner(System.in);

    static String getString(){
        return SCANNER.nextLine().trim();
    }

    static double getDouble() throws NumberFormatException{
        return Double.parseDouble(getString().replace(',', '.'));
    }

    default double calculate(double num1, double num2, String operation){
        switch (operation.toUpperCase()){
            case "+":
                return addition(num1, num2);
            case "-":
                return subtraction(num1, num2);
            case "*":
            case "X":
                return multiplication(num1, num2);
            case "/":
                return division(num1, num2);
            default:
                throw new IllegalArgumentException(operation + " is not a recognized input");
        }
    }

    double addition(double num1, double num2);
    double subtraction(double num1, double num2);
    double multiplication(double num1, double num2);
    double division(double num1, double num2);

}
