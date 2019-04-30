package com.company;

public class Cylinder extends Prism {

    public Cylinder (int radius, int depth, String colour) {
        super(new Circle(radius, colour), depth);
    }
    public String getType(){
        return "Cylinder";
    }
}
