package day30_b_custom_clasess;

public class App {
    //INSTANCE VARIABLES / DATA MEMBERS
    String name;
    double version;
    boolean isFree;

    //INSTANCE METHOD
    public void run() {
        System.out.println(name + " is running");
    }

    public void update() {
        System.out.println(name + " is updating...");
        version += 1.1;
    }

}
