package oop.little_shells;

public class Person {
    private String name;
    private int age;
    private double heft;

    Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, double heft) {
        this (name, age);
        this.heft = heft;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeft() {
        return heft;
    }

    public void setHeft(double heft) {
        this.heft = heft;
    }
}
