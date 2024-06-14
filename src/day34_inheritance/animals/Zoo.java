package day34_inheritance.animals;

public class Zoo {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.type = "German Shepard";
        dog1.walk();
        dog1.bark();

        Lion lion1 = new Lion();
        lion1.type = "Arctic Lion";
        lion1.walk();
        lion1.roar();
    }

}
