package com.company;

public class Prism implements ThreeDimensionalShape {

    TwoDimensionalShape base;
    int depth;

    @Override
    public String getColour() {
        return base.getColour();
    }

    public int getDepth() {
        return depth;
    }

    public Prism(TwoDimensionalShape base, int depth) {
        this.base = base;
        this.depth = depth;
    }

    public String getType() {
        return "Prism";
    }

    public double getVolume(){
        return (base.getArea()*getDepth());
    }

    public double getSurfaceArea(){
        return ((2*(base.getArea())+(base.getPerimeter()*getDepth())));

    }
}
