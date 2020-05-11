package com.kodilla.testing.shape;

public class Triangle implements Shape {
    double h;
    double a;

    public Triangle (double h, double a){
        this.h=h;
        this.a=a;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return (0.5 * a * h);
    }
}
