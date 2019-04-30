package com.company;

public class Sphere implements ThreeDimensionalShape {

    double radius;
    String colour;

    public double getRadius() {
        return radius;
    }

    @Override
    public String getColour() {
        return colour;
    }

    public Sphere(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public String getType(){
        return "Sphere";
    }
    public double getVolume(){
        return (4 * Math.pow(radius,3)*Math.PI)/3;
    }
    public double getSurfaceArea(){
        return (4 * Math.PI * Math.pow(radius,2));
    }
}
