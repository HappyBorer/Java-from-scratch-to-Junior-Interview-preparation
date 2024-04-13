package oop.interfaces;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
//        Director director = new Director();
//        Programmer programmer = new Programmer();
//        Cook cook = new Cook();
//        ArrayList<Worker> workers = new ArrayList<>();
//        workers.add(director);
//        workers.add(programmer);
//        workers.add(cook);
//        for(Worker work: workers){
//            work.work();
//        }
//        ArrayList<Driver> drivers = new ArrayList<>();
//        drivers.add(programmer);
//        drivers.add(cook);
//        for(Driver drive: drivers){
//            drive.drive();
//        }
        Client client = new Client();
//        Waiter waiter = new EmployeeHall();
        client.makeOrder("meat", new Waiter() {
            @Override
            public void bringOrder(String order) {
                System.out.println("Bring the " + order);
            }
        });
    }
}
