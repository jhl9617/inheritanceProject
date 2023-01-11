package oop.inheritance.run;

import oop.inheritance.sample.Shape;

public class TestInheritance{


    public static void main(String[] args) {
        Shape shape = new Shape();

        System.out.println("shape : " + shape.hashCode());
        System.out.println("shape : " + shape);

        Shape copy = shape;
        System.out.println("result : " + shape.equals(copy));
    }
}
