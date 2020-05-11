package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuits {

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square shape1= new Square(5);
        Square shape2 = new Square(3);
        Circle shape3 = new Circle(3.14, 2);
        Triangle shape4 = new Triangle(4,7);
        //When
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);
        shapeCollector.addFigure(shape3);
        shapeCollector.addFigure(shape4);
        //Then
        Assert.assertEquals(4, shapeCollector.getShapesSize());
        Assert.assertEquals(shape1, shapeCollector.getShapes().get(0));
        Assert.assertEquals(shape2, shapeCollector.getShapes().get(1));
        Assert.assertEquals(shape3, shapeCollector.getShapes().get(2));
        Assert.assertEquals(shape4, shapeCollector.getShapes().get(3));
    }

    
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square shape1 = new Square(5);
        Triangle shape4 = new Triangle(4,7);
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape4);
        //When
        boolean result1 = shapeCollector.removeFigure(shape1);
        //Then
        Assert.assertTrue(result1);

        Assert.assertEquals(1, shapeCollector.getShapesSize());
    }
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square shape1 = new Square(5);
        Square shape2 = new Square(3);
        Circle shape3 = new Circle(3.14, 2);
        Triangle shape4 = new Triangle(4,7);
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);
        shapeCollector.addFigure(shape3);
        shapeCollector.addFigure(shape4);
        //When
        Shape result = shapeCollector.getFigure(2);
        //Then
        Assert.assertEquals(shape3, result);
    }
}
