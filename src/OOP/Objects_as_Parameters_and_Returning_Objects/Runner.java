package OOP.Objects_as_Parameters_and_Returning_Objects;

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
