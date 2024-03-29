package OOP.Overloading_Methods_and_Constructors;

public class Main {
    public static void main(String[] args) {
        Monster monsterOne = new Monster();
        Monster monsterTwo = new Monster(5);
        Monster monsterThree = new Monster(3, 6, 9);
        monsterOne.voice();
        monsterTwo.voice(4);
        monsterThree.voice(6, "Aaaaaaaaaa...");

    }
}
