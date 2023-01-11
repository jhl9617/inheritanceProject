package com.practice2.model.entity;

public class Circle extends Point{
    private int radius;

    public Circle() {
    }

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle{" +
                "radius=" + radius +
                ", x=" + getX() +
                ", y=" + getY() +
                "} " +
        "\n둘레 : " + (int)(radius * 2 * Math.PI * 10) / (double)10 +
                "\n면적 : " + (int)(Math.PI * radius * radius * 10) / (double)10);
    }
}
