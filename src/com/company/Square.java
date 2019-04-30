package com.company;

public class Square extends Rectangle {


    public Square (int length, String colour){
        super(length, length, colour);
    }

    public String getType() {
        return "Square";
    }
}
