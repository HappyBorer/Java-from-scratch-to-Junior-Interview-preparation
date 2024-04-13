package oop.inheritance;

public class Lion extends CatFamily{
    public Lion(int lags, int eyes, boolean eatPerson){
        super(lags, eyes, eatPerson);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Антилопу");
    }
}
