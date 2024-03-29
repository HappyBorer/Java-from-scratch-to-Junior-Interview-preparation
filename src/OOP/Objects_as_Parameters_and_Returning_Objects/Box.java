package OOP.Objects_as_Parameters_and_Returning_Objects;

public class Box {
    double length;
    double height;
    double width;

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

    Box increase(){
        return new Box(length * 2, height * 2, width * 2);
    }

    Box copy(){
        return new Box(length, height, width);
    }

    int compare(Box another){
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

    double getVolume(){
        return length * height * width;
    }
}
