package com.company;

public class FacadeShapeMaker {
    public Shapes Circle;
    public Shapes Rectangle;
    public Shapes Square;
    public Shapes Triangle;
    public Shapes Oval;

    public FacadeShapeMaker(){
        Circle = new Circle();
        Rectangle = new Rectangle();
        Square = new Square();
        Triangle = new Triangle();
        Oval = new Oval();
    }

    public void drawCircle(){
        Circle.draw();
    }

    public void drawRectangle(){
        Rectangle.draw();
    }

    public void drawSquare(){
        Square.draw();
    }

    public void drawTriangle(){
        Triangle.draw();
    }

    public void drawOval(){
        Oval.draw();
    }
}
