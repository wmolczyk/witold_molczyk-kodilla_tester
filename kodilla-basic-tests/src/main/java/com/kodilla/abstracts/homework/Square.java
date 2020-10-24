package com.kodilla.abstracts.homework;

import static java.lang.Math.pow;

public class Square extends Shape {

 double a;
public Square (double a) {this.a =a;}

    public void surfaceArea() {
        double squareArea = pow(a,2.0);
System.out.println("the square surface is" + " " + squareArea);
            }

    @Override
    public double perimeter() {
     double squarePerimeter = a * 4.0;
     System.out.println("square perimeter is" + " " + squarePerimeter);

        return squarePerimeter;
    }
}
