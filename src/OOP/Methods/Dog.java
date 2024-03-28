package OOP.Methods;

public class Dog {
    String name;
    String breed;
    double weight;
    int speed;
    String getInfo(){
        return "Name: " + name + "\nBreed: " + breed + "\nWeight: " + weight;
    }

    void run(){
        for (int i = 0; i < speed; i++){
            if(i != speed - 1) {
                System.out.print("run, ");
            }else{
                System.out.print("run.");
            }
        }
    }
}
