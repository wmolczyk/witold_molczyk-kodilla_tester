package com.kodilla.abstracts.homework;
import static java.lang.Math.sqrt;

public class Triangle extends Shape {

double a;
double b;
double c;


public Triangle(double a, double b, double c) {this.a = a; this.b = b; this.c =c;}

    public double perimeter() {
       double trianglePerimeter = a + b +c;
       System.out.println("triangle perimeter is" + " " +trianglePerimeter);
       return trianglePerimeter;
    }


    public void surfaceArea() {

        double tp = perimeter();
        double p= tp/2;
        double triangleSurface = sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("triangle surface is " + " " +triangleSurface);


    }



}
