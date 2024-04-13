package oop.inheritance;

public class Cat extends CatFamily{
    public Cat(int lags, int eyes, boolean eatPerson){
        super(lags, eyes, eatPerson);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Вискас");
    }
}
