package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private final ArrayList<Shape> shapes= new ArrayList<>();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape){
//        boolean result = false;
//        if(shapes.contains(shapes)){
//            shapes.remove(shapes);
//            result = true;
//        }
        return shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        Shape shape = null;
        if (n >= 0 && n < shapes.size()) {
            shape = shapes.get(n);
        }
        return shape;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public int getShapesSize() {
        return shapes.size();
    }
}
