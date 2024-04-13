package oop.interfaces;

public class EmployeeHall implements Waiter{
    @Override
    public void bringOrder(String order) {
        System.out.println("Bring the " + order);
    }
}
