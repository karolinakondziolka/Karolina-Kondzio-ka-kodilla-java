package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        int resultAdd = calculator.add(7,23);
        System.out.println(resultAdd);

        int resultSubtract = calculator.subtract(18, 8);
        System.out.println(resultSubtract);
    }
}
