package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println();

        Rectangle rectangle = new Rectangle(3, 2, "black");

        System.out.println(rectangle.prettyPrint());

        System.out.println();

        Circle circle = new Circle( 3, "green");

        System.out.println(circle.prettyPrint());

        System.out.println();

        Square square = new Square(3, "red");

        System.out.println(square.prettyPrint());

        System.out.println();

        Prism prism = new Prism(circle, 5);

        System.out.println(prism.prettyPrint());

        System.out.println();

        Sphere sphere = new Sphere( 3, "purple");

        System.out.println(sphere.prettyPrint());

        System.out.println();

        Cuboid cuboid = new Cuboid(3,4,5,"pink");

        System.out.println(cuboid.prettyPrint());

        System.out.println();

        Cube cube = new Cube(4,"yellow");

        System.out.println(cube.prettyPrint());

        System.out.println();

        Cylinder cylinder = new Cylinder(4,5,"cerise");

        System.out.println(cylinder.prettyPrint());

    }
}
