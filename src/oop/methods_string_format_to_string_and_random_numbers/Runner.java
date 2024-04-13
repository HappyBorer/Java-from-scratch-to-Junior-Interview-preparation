package oop.methods_string_format_to_string_and_random_numbers;

import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
//            int a = random.nextInt( 6) + 5;
            int a = random.nextInt(1, 7);
            System.out.printf("Ваш число %d\n", a);
        }
    }
}
