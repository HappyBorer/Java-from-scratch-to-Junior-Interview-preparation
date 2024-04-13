package oop.multi_flow_programming;

import java.util.Random;

public class Main {
    static boolean isFlag = false;
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(50);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int winNumber;
                do{
                    winNumber = random.nextInt(50);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                    }

                } while (number != winNumber);
                isFlag = true;
                System.out.println(winNumber);
            }
        });
        thread.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int second = 0;
                while (!isFlag){
                    System.out.println(second++);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                    }
                }
            }
        });
        thread2.start();
    }
}
