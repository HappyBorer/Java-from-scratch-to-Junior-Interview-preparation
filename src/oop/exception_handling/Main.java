package oop.exception_handling;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int index = 5;
        try {
            System.out.println(numbers[index]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Вышли за пределы массива");
        }
    }
}
