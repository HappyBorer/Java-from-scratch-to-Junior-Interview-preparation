package oop.objects_as_parameters_and_returning_objects;

public class Runner {
    public static void main(String[] args) {
        Box box = new Box(20);
        Box another = new Box(30);
        System.out.println(box.compare(another));
        another = box.copy();
        System.out.println(box.compare(another));
        box = another.increase();
        System.out.println(box.compare(another));
    }
}
