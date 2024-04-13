package oop.inheritance;

public class WeightBox extends Box{
    private double weight;
    WeightBox(){
      weight = 10;
    }

    public WeightBox(double weight) {
        super();
        this.weight = weight;
    }

    public WeightBox(Box another, double weight) {
        super(another);
        this.weight = weight;
    }

    public WeightBox(double size, double weight) {
        super(size);
        this.weight = weight;
    }

    public WeightBox(double length, double height, double width, double weight) {
        super(length, height, width);
        this.weight = weight;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Weight " + weight);
    }
}
