package oop.built_in_collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Runner {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Emma");
        names.add("Sam");
        names.add("Olivia");
        names.add("Peter");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i);
        }
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i < numbers.size(); i++){
            result.add(numbers.get(i) + " - " + names.get(i));
        }
        for(String line: result){
            System.out.println(line);
        }
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Pol");
        hashSet.add("Roll");
        hashSet.add("Tell");
        hashSet.add("Abs");
        hashSet.add("Const");
        for(String line: hashSet){
            System.out.println(line);
        }
    }
}
