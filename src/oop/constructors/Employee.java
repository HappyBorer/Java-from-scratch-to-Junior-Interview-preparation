package oop.constructors;

public class Employee {
    String name;
    String appointment;
    int salary;
    public Employee(String name, String appointment, int salary){
        this.name = name;
        this.appointment = appointment;
        this.salary = salary;
    }

    public void show(){
        System.out.println("Name: " + name + "\nAppointment: " + appointment + "\nSalary: " + salary);
    }
}
