package com.kodilla.testing.shape;

public class Circle implements Shape {
    double pi= 3.14;
    double r;

    public Circle(double pi, double r){
        this.pi=pi;
        this.r=r;
    }
    @Override
    public String getShapeName() {
        return "Circle";
    }
    @Override
    public double getField() {
        return (pi*(r*r));
    }
}