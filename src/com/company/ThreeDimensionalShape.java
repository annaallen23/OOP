package com.company;

public interface ThreeDimensionalShape extends Shape{
    double getSurfaceArea();
    double getVolume();
    default String prettyPrint() {
        return "A " + getColour() + " " + getType() + " with volume " + getVolume() + " and surface area " + getSurfaceArea();
    }
}
