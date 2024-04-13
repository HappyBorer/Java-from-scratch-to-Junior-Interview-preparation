package oop.inheritance;

public abstract class Shape {
    private double sideA;
    private double sideB;

    public Shape(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public abstract double getPerimeter();

    public final double getSideA() {
        return sideA;
    }


    public final double getSideB() {
        return sideB;
    }


}
