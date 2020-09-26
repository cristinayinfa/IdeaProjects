package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        FacadeShapeMaker shapemaker = new FacadeShapeMaker();

        shapemaker.drawCircle();
        shapemaker.drawSquare();
        shapemaker.drawRectangle();
        shapemaker.drawTriangle();
        shapemaker.drawOval();

    }
}
