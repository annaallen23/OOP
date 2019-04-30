package com.company;

public class Rectangle implements TwoDimensionalShape{

    int width;
    int height;
    String colour;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColour() {
        return colour;
    }


    public Rectangle(int width, int height, String colour) {
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    public double getArea (){
        return getWidth()*getHeight();


    }
    public double getPerimeter (){
        return (getHeight()*2) + (getWidth()*2);


    }
    public String getType (){
        return "rectangle";
    }
}
