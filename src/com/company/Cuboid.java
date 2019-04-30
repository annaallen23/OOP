package com.company;

public class Cuboid extends Prism {

    public Cuboid (int width, int length, int depth, String colour) {
        super(new Rectangle(width, length, colour), depth);
    }
    public String getType(){
        return "Cuboid";
    }


}
