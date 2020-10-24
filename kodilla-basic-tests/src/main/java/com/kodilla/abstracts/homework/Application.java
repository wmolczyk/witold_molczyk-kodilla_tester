package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square(5.0);
        square.surfaceArea();
        square.perimeter();

        Triangle triangle = new Triangle(12.0,18.0, 7.0);

        triangle.perimeter();
        triangle.surfaceArea();

        Circle circle=new Circle(18.0);
        circle.surfaceArea();
        circle.perimeter();
    }
}
