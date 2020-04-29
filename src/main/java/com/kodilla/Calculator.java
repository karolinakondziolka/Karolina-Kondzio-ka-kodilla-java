package com.kodilla;

public class Calculator {

    int a;
    int b;

    public int addAToB (int a, int b) {
        return a+b;
    }

    public int substractBFromA ( int a, int b) {
        return a-b;
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        int resultAdd = calculator.addAToB(4,6);
        int resultSubstract = calculator.substractBFromA(7,1);

        System.out.println(resultAdd);
        System.out.println(resultSubstract);
    }

}
