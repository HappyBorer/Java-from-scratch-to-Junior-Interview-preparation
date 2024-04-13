package oop.overloading_methods_and_constructors;

public class Monster {
    int numberEyes;
    int numberHands;
    int numberLegs;



    public Monster() {
        this(2);
    }

    public Monster(int number) {
        this(number, number, number);

    }

    public Monster(int numberEyes, int numberHands, int numberLegs) {
        this.numberEyes = numberEyes;
        this.numberHands = numberHands;
        this.numberLegs = numberLegs;
    }

    void voice() {
        voice(1);
    }

    void voice(int counter) {
       voice(counter, "Grrrrrrrrrrr...");
    }

    void voice(int counter, String word){
        for (int i = 0; i < counter; i++) {
            System.out.println(word);
        }
    }
}
