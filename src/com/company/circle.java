package com.company;

public class circle {
     private double r;
     private circle c1;
}
public circle() {
    r=;
}
public circle(double radius){
    r=radius;
}
public double Area() {
    double a = Math.PI*Math.pow(r,2);
    return a;
}
public double Circumfrence() {
    double c = 2 * r * Math.PI;
    return c;
}
}