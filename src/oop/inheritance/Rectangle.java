package oop.inheritance;

public class Rectangle extends Shape{

    public Rectangle(double sideA, double sideB) {
        super(sideA, sideB);
    }

    @Override
    public double getPerimeter() {
        return (getSideA() + getSideB())*2;
    }
}
