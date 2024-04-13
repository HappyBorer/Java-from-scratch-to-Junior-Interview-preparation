package oop.access_modifiers;

public class Box {
    private double length;
    private double height;
    private double width;

    public Box(){
        this(10);
    }

    public Box(Box another){
        this(another.length, another.height, another.width);
    }

    public Box(double size){
        this(size, size, size);
    }

    public Box(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public Box increase(){
        return new Box(length * 2, height * 2, width * 2);
    }

    public Box copy(){
        return new Box(length, height, width);
    }

    public int compare(Box another){
        double volume = getVolume();
        double anotherVolume = another.getVolume();
        if(volume > anotherVolume){
            return 1;
        } else if (volume < anotherVolume) {
            return -1;
        }else {
            return 0;
        }
    }

    public double getVolume(){
        return length * height * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
