package oop.parameterized_methods;

public class Rectangle {
    double height;
    double width;

    public void setDimensions(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double getSquare(){
        return height * width;
    }
}
