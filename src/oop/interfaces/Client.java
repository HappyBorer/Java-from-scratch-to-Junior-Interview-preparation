package oop.interfaces;

public class Client {
    void makeOrder(String order, Waiter waiter){
        waiter.bringOrder(order);
    }
}
