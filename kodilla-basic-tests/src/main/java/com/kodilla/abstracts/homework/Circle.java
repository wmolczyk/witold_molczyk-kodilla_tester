package com.kodilla.abstracts.homework;

import static java.lang.Math.pow;

public class Circle extends Shape{

    double r;

    public Circle(double r) {
        this.r=r;     }


    public void surfaceArea() {
        double circleArea = pow(r,2.0)*Math.PI;
        System.out.println("the circle area is" + " " +circleArea);

    }


    public double perimeter() {
        double circlePerimeter = Math.PI*2*r;
        System.out.println("the circle perimeter is" + " "+circlePerimeter);
        return circlePerimeter;
    }
}
