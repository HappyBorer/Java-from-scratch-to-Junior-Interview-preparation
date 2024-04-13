package oop.inheritance;

public class Triangle extends Shape {
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB);
        this.sideC = sideC;
    }

    @Override
    public double getPerimeter() {
        return getSideA() + getSideB() + sideC;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
}
