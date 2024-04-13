package oop.inheritance;

public class CatFamily {
    protected int lags;
    protected int eyes;
    protected boolean eatPerson;

    public CatFamily(int lags, int eyes, boolean eatPerson) {
        this.lags = lags;
        this.eyes = eyes;
        this.eatPerson = eatPerson;
    }

    public int getLags() {
        return lags;
    }

    public void eat(){
        System.out.print("Кушаю ");
    }
    public void setLags(int lags) {
        this.lags = lags;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public boolean isEatPerson() {
        return eatPerson;
    }

    public void setEatPerson(boolean eatPerson) {
        this.eatPerson = eatPerson;
    }
}
