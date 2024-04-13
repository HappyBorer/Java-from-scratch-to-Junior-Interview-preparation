package oop.we_create_our_own_collection;

public class Runner {
    public static void main(String[] args) {
        MyArrayList myArray = getArray();
        myArray.add("Boris");
        myArray.remove("Emma");
        for(int i = 0; i < myArray.getSize(); i++){
            System.out.println(myArray.get(i));
        }
    }

    private static MyArrayList getArray(){
        MyArrayList array = new MyArrayList();
        array.add("John");
        array.add("Olivia");
        array.add("Emma");
        array.add("Max");
        return array;
    }
}
