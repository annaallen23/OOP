package com.company;

public class Cube extends Cuboid {

    public Cube (int length, String colour){
        super (length, length, length, colour);
    }
    public String getType(){
        return "Cube";
    }
}
