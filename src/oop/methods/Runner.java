package oop.methods;

public class Runner {
    public static void main(String[] args) {
        Dog tuz = new Dog();
        tuz.name = "Tuz";
        tuz.breed = "mastiff";
        tuz.weight = 12.5;
        tuz.speed = 5;
        System.out.println(tuz.getInfo());
        tuz.run();
    }
}
