package OOP.Introduction_to_OOP;

public class Main {
    public static void main(String[] args) {
        Human humanOne = new Human();
        humanOne.name = "Jon";
        humanOne.age = 20;
        humanOne.heft = 82.5;
        Human humanTwo = new Human();
        humanTwo.name = "Alex";
        humanOne.age = 35;
        humanOne.heft = 90.3;
        Human humanThree = new Human();
        humanOne.name = "Debi";
        humanOne.age = 25;
        humanOne.heft = 61.7;
        double averageAge = humanOne.age + humanOne.age + humanOne.age / 3.;
        System.out.println(averageAge);
    }
}
