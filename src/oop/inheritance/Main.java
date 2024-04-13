package oop.inheritance;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat(4, 2, false);
//        Lion lion = new Lion(4, 2, true);
//        cat.eat();
//        lion.eat();
//        WeightBox weightBox = new WeightBox(20, 500);
//        Box box = new Box(10);
//        box.show();
//        weightBox.show();
        Rectangle rectangle = new Rectangle(10, 20);
        Triangle triangle = new Triangle(10, 10, 20);
        System.out.println(rectangle.getPerimeter());
        System.out.println(triangle.getPerimeter());
    }
}
