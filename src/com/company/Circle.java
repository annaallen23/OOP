package com.company;

public class Circle implements TwoDimensionalShape{

    double radius;
    String colour;

    public double getRadius() {
        return radius;
    }

    public String getColour() {
        return colour;
    }

    public Circle(int radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public double getArea(){
        return Math.PI * (getRadius() * getRadius());

    }

    public double getPerimeter(){
        return Math.PI * 2*getRadius();

    }
    public String getType(){
        return "Circle";
    }
}
